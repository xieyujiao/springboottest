package com.xyj.springboottest.repository;

import com.xyj.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * className:BookRepository
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
public interface BookRepository extends JpaRepository<Book,Integer> //继承jpa的只需要传入实体类和主键即可
{
}
