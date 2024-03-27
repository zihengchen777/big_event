package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.ArticleMapper;
import com.itheima.pojo.Article;
import com.itheima.pojo.PageResult;
import com.itheima.service.ArticleService;
import com.itheima.utils.ThreadLocalUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/16:14
 * @Description:
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticleMapper articleMapper;
    @Override
    public void add(Article article) {
        //补充属性值
        article.setCreateTime(LocalDateTime.now());
        article.setUpdateTime(LocalDateTime.now());
        Map<String,Object> o = ThreadLocalUtil.get();
        Integer userId= (Integer) o.get("id");
        article.setCreateUser(userId);
        articleMapper.add(article);
    }

    @Override
    public PageResult pageQuery(Integer pageNum, Integer pageSize, Integer categoryId, String state) {
        PageHelper.startPage(pageNum,pageSize);
        Page<Article> page=articleMapper.pageQuery(categoryId,state);
        Long total=page.getTotal();
        List<Article> result = page.getResult();
        return new PageResult(total,result);
    }


}
