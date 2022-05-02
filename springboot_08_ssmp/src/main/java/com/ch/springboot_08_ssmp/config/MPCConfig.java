package com.ch.springboot_08_ssmp.config;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.ch.springboot_08_ssmp.doman.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年05月02日 14:50
 */
@Configuration
public class MPCConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor( new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }

}
