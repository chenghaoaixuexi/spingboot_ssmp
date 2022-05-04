package com.ch.springboot_08_ssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.springboot_08_ssmp.doman.Book;

public interface IBookService extends IService<Book> {

    //分页查询自定义的


    IPage<Book> getPage(int currentPage, int pageSize);
}