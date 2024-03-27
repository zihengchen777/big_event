package com.itheima.mapper;

import com.github.pagehelper.Page;
import com.itheima.pojo.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Chen Ziheng
 * @Date: 2024/03/27/16:15
 * @Description:
 */
@Mapper
public interface ArticleMapper {

    @Insert("insert into article(title, content, cover_img,state, category_id, create_user, create_time, update_time) " +
            "VALUES(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime}) ")
    public void add(Article article);

    @Select("select * from article where category_id=#{categoryId} and state=#{state}")
    Page<Article> pageQuery(Integer categoryId, String state);
}
