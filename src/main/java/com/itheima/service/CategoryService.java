package com.itheima.service;

import com.itheima.pojo.Category;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/14:42
 * @Description:
 */
public interface CategoryService {
    void add(Category category);

    List<Category> list();

    Category findById(Integer id);

    void update(Category category);
}
