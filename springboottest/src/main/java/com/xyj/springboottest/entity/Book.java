package com.xyj.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * className:Book
 * Package:
 * Description
 *
 * @Date:
 * @Author:736354146@qq.com
 */
@Entity //将book类和表名绑定
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//设置id自增
    private Integer id;//编号

    private String name;//书名

    private String author;//作者


}
