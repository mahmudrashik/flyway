package com.rashik.flyway;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Book {

    @Id
    String isbn;

    @Column(name = "title")
    String title;

//    @Column(name = "price")
//            @ColumnDefault("0")
//    double price;
}
