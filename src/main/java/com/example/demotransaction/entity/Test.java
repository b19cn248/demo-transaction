package com.example.demotransaction.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Transactional
public class Test {

  private final BookService bookService;

  @Scheduled(fixedRate = 5000)
  public void getBook() {
    System.out.println(bookService.get(1));
  }


  @Scheduled(fixedRate = 5000)
  public void getBook1() {
    System.out.println(bookService.get(1));
  }

  @Scheduled(fixedRate = 5000)
  @Transactional
  public void updateBook() {
    Book book2 = new Book(1, "Hieu 1", "noi phet de thanh cong", 111,1);
    bookService.update(book2);
  }

  @Scheduled(fixedRate = 5000)
  @Transactional
  public void updateBook1() {
    Book book2 = new Book(1, "Hieu 2", "noi phet de thanh cong", 222,1);
    bookService.update(book2);
  }


}
