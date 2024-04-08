package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.pojo.Article;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.pojo.dto.ArticlePageQueryDTO;
import com.itheima.service.ArticleService;
import com.itheima.utils.JwtUtil;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/article")
public class ArticleController {
//    @GetMapping("/list")
//    public Result<String> list(/*@RequestHeader(name = "Authorization") String token, HttpServletResponse response*/){
//        //验证token
////        try {
////            Map<String, Object> claims = JwtUtil.parseToken(token);
////            return Result.success("所有的文章数据");
////        } catch (Exception e) {
////            //http响应状态码为401
////            response.setStatus(401);
////            return Result.error(MessageConstant.NOT_LOGGED_IN);
////        }
//        return Result.success("所有的文章数据");
//    }
    @Resource
    ArticleService articleService;

    public Result addArticle(@RequestBody @Validated Article article){
        articleService.add(article);
        return Result.success();
    }

    @GetMapping
    public Result<PageResult> pageQuery(ArticlePageQueryDTO articlePageQueryDTO){
        log.info("文章分类查询:{}",articlePageQueryDTO);
        PageResult pageResult=articleService.pageQuery(articlePageQueryDTO);
        return Result.success(pageResult);
    }

}
