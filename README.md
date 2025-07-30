# Flyway Spring Boot Java Project

This project demonstrates how to use **Flyway** for database migration within a **Spring Boot** Java application, leveraging **JPA** and **Lombok** to simplify database interactions.

## Project Overview

- **Framework:** Spring Boot  
- **Database:** PostgreSQL  
- **Database Migration:** Flyway  
- **Libraries Used:** Spring Data JPA, Lombok  

## Prerequisites

- Java 17 or newer  
- Maven 3.5.4  
- PostgreSQL Database  

## Setup

### Clone the Repository

```bash
git clone https://github.com/mahmudrashik/flyway.git
cd flyway
```

## Configure Database

Create a PostgreSQL database named library and set the username/password as follows or edit accordingly (src/main/resources/application.properties):

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/library
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.flyway.enabled=true
```

## Running the Application

Use Maven to run the application:

```bash
mvn clean spring-boot:run
```

## Database Migration with Flyway

Flyway migration scripts are stored in:

Create migration files following Flyway’s naming convention:

## V<version>__<description>.sql

Example:

-- V1__initial.script.value.sql

    CREATE TABLE books (

    b VARCHAR(20) PRIMARY KEY,
    title VARCHAR(255)
    );


-- V2__Add.books.sql

    insert into books (b, title)

    values ('978-0-262-04630-5', 'Physics 1st Paper')


-- V3__add.new.column.sql

    alter table if exists books

    add column price float(53) default 0

Flyway automatically applies new migrations when the application starts.

## Dependencies

Key dependencies include:

- Spring Boot Starter Data JPA

- PostgreSQL JDBC Driver

- Flyway Core

- Lombok

## Contributing

Contributions are welcome. Please open an issue or submit a pull request.

## Screenshots

### After V1 operation done

- flyway_schema_history

  ![image_alt](https://github.com/mahmudrashik/flyway/blob/102c7b2eacdb9d4f926cfbd59c635f3065fe8c44/Screenshot%202025-07-30%20223719.png)

### After V2 operation done

- flyway_schema_history

 ![image_alt](https://github.com/mahmudrashik/flyway/blob/e2d6b80b267c11df28703a3c07e41490b9ecfc74/Screenshot%202025-07-30%20223931.png)

- books

 ![image_alt](https://github.com/mahmudrashik/flyway/blob/e2d6b80b267c11df28703a3c07e41490b9ecfc74/Screenshot%202025-07-30%20224043.png)

### After V3 operation done

- flyway_schema_history

 ![image_alt](https://github.com/mahmudrashik/flyway/blob/b788cfaa5cb125043bec2b7804597d6b92de2207/Screenshot%202025-07-30%20224147.png)

- books

 ![image_alt](https://github.com/mahmudrashik/flyway/blob/b788cfaa5cb125043bec2b7804597d6b92de2207/Screenshot%202025-07-30%20224131.png)
