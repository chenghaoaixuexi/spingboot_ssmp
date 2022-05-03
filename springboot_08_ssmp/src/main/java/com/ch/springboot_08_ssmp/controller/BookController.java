package com.ch.springboot_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ch.springboot_08_ssmp.controller.util.R;
import com.ch.springboot_08_ssmp.doman.Book;
import com.ch.springboot_08_ssmp.service.IBookService;
import com.ch.springboot_08_ssmp.service.impl.BookServieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @author chenghao
 * @purpose：消息一致性的处理
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
    public R getAll(){
       return new R(true,bookService.list());
    }
    //根据ID查
    @GetMapping("{id}")
    public R getBookById(@PathVariable Integer id){
        return new R(true,bookService.getById(id));
    }
    //分页查
    @GetMapping("{currentPage}/{pageSize}")
    public R getIpages(@PathVariable Integer currentPage,@PathVariable Integer pageSize){
         return new R(true,bookService.getIpages(currentPage, pageSize));

    }
    //增加书籍
    @PostMapping
    public R add(@RequestBody Book book) throws IOException {

        //模拟异常
        if (book.getName().equals("123"))
        throw new IOException();
        boolean flag = bookService.save(book);

        //三木
        return new R(flag,flag ? "添加成功^_^" : "添加失败-.-");
    }

    //按照id修改书籍
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.updateById(book));
    }

    //删除书籍
    @DeleteMapping("{id}")
    public R deleteById(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }






}
