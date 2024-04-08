package com.itheima.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/04/08/10:37
 * @Description:
 */
@Data
public class ArticlePageQueryDTO implements Serializable {
    Integer PageNum;

    Integer pageSize;

    Integer categoryId;

    String state;
}
