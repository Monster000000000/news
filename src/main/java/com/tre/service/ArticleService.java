package com.tre.service;

import com.tre.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> selectAll();

    Article selectArticleByName(String article_title);

    Integer createArticle(Article article);

    Integer updateArticle(Article article);

    Integer deleteArticle(String article_id);

    List<Article> vagueSelectTitle(String article_title);
}
