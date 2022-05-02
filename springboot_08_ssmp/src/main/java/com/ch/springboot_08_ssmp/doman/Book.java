package com.ch.springboot_08_ssmp.doman;

import lombok.Data;

/**
 * @author chenghao
 * @purpose：
 * @备注：
 * @data 2022年04月28日 17:12
 */

@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
