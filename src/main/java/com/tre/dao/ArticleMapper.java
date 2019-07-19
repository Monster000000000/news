package com.tre.dao;

import com.tre.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface ArticleMapper {

    List<Article> selectAllArticle();

    Article selectArticleByName(String article_title);

    Integer insertArticle(Article article);

    Integer updateArticle(Article article);

    Integer deleteArticle(String article_id);

    List<Article> vagueSelectTitle(@Param("article_title") String article_title);
}
