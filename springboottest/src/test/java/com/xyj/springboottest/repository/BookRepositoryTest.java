package com.xyj.springboottest.repository;

import com.xyj.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {


    @Autowired
    private BookRepository bookRepository;

    @Test
    void findAll()
    {
        System.out.println(bookRepository.findAll());
    }


    @Test
    void save()
    {
        Book book = new Book();
        book.setName("zsds");
        book.setAuthor("zs");
        System.out.println(bookRepository.save(book));

    }

    @Test
    void findById()
    {
        System.out.println(bookRepository.findById(1).get());
    }

    @Test
    void update()
    {
        Book book = new Book();
        book.setId(15);
        book.setName("骄阳似火");
        book.setAuthor("顾漫");
        System.out.println(bookRepository.save(book));

    }

    @Test
    void delete(){
        bookRepository.deleteById(18);
        System.out.println();
    }

}