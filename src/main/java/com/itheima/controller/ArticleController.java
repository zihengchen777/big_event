package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.pojo.Article;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.ArticleService;
import com.itheima.utils.JwtUtil;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/26/15:54
 * @Description:
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;
    @PostMapping
    public Result add(@RequestBody @Validated Article article){
        articleService.add(article);
        return Result.success();
    }

    @GetMapping
    public Result<PageResult> page(@RequestParam Integer pageNum, @RequestParam Integer pageSize,Integer categoryId, String state){
        PageResult pageResult=articleService.pageQuery(pageNum,pageSize,categoryId,state);
        return Result.success(pageResult);
    }
}
