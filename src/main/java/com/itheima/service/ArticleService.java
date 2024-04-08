package com.itheima.service;

import com.itheima.pojo.Article;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.dto.ArticlePageQueryDTO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/16:14
 * @Description:
 */
public interface ArticleService {
    //新增文章
    void add(Article article);

    PageResult pageQuery(ArticlePageQueryDTO articlePageQueryDTO);
}
