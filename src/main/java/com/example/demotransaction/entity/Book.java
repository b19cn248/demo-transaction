package com.example.demotransaction.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String author;
  private String title;
  private int price;

  @Version
  private Integer version;

  public Book(Integer id, String author, String title, int price) {
    this.id = id;
    this.author = author;
    this.title = title;
    this.price = price;
  }
}
