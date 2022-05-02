package com.ch.springboot_08_ssmp.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月28日 18:52
 */
@SpringBootTest
public class DaoTest {
    @Autowired
    BookDao bookDao;
    @Test
    void test01(){
        System.out.println(bookDao.selectById(2));
    }
}
