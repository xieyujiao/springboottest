package com.xyj.springboottest.controller;

import com.xyj.springboottest.entity.Book;
import com.xyj.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * className:BookHandler
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/findAll/{page}/{size}")
    public Page<Book> findAll(@PathVariable("page") Integer page,
                              @PathVariable("size") Integer size)
    {
        Pageable pageable= PageRequest.of(page-1,size);
        return bookRepository.findAll(pageable);
    }

    @PostMapping("/save")
    public String save(@RequestBody Book book)
    {
        Book result = bookRepository.save(book);
        if(result!=null)
        {
            return "success";
        }else{
            return "error";
        }
    }

    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id")Integer id)
    {
      return bookRepository.findById(id).get();
    }

    @PutMapping("/update")
    public String update(@RequestBody Book book)
    {
        Book result = bookRepository.save(book);
        if(result!=null)
        {
            return "success";
        }else{
            return "error";
        }
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")Integer id)
    {
         bookRepository.deleteById(id);
    }



}
