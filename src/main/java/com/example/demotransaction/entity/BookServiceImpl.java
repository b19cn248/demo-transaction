package com.example.demotransaction.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
  private final BookRepository repository;

  @Override
  public void update(Book book) {
    repository.save(book);
  }

  @Override
  public Book get(Integer id) {
    return repository.getById(id);
  }
}
