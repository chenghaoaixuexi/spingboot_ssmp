package com.ch.springboot_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ch.springboot_08_ssmp.doman.Book;
import com.ch.springboot_08_ssmp.service.IBookService;
import com.ch.springboot_08_ssmp.service.impl.BookServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月28日 17:26
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    IBookService bookService;
    //查询全部
    @GetMapping
    public List<Book> getAll(){
        return  bookService.list();
    }
    //根据ID查
    @GetMapping("{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookService.getById(id);
    }
    //分页查
    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getIpages(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
        IPage<Book> ipages = bookService.getIpages(currentPage, pageSize);
        return ipages;
    }
    //增加书籍
    @PostMapping
    public boolean add(@RequestBody Book book){
       return bookService.save(book);
    }

    //按照id修改书籍
    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.updateById(book);
    }

    //删除书籍
    @DeleteMapping("{id}")
    public boolean deleteById(@PathVariable Integer id){
        return bookService.removeById(id);
    }






}
