package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.pojo.Category;
import com.itheima.pojo.Result;
import com.itheima.service.CategoryService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/14:20
 * @Description:
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @PostMapping
    public Result add(@RequestBody @Validated(Category.Add.class) Category category){
        categoryService.add(category);
        return Result.success();
    }

    @GetMapping
    public Result<List<Category>> list(){
       List<Category> cs= categoryService.list();
       return Result.success(cs);
    }

    @GetMapping("/detail")
    public Result<Category> detail(Integer id){
        Category c=categoryService.findById(id);
        return Result.success(c);
    }

    @PutMapping
    public Result update(@RequestBody @Validated(Category.Update.class) Category category){
        categoryService.update(category);
        return Result.success();
    }
    @DeleteMapping
    public Result delete(Integer id){
        Category c=categoryService.findById(id);
        if(c==null){
            return Result.error(MessageConstant.NOT_CATEGORY_ID);
        }
        categoryService.delete(id);
        return Result.success();
    }
}
