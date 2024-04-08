package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/04/08/10:23
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult implements Serializable {
    private long total; //总记录数

    private List records; //当前页数据集合
}
