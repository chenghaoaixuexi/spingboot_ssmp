package com.ch.springboot_08_ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ch.springboot_08_ssmp.doman.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*
* MybatisPlus快速开发版
* */
@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {

}
