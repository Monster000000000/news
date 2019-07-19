package com.tre.service;

import com.tre.dao.ArticleMapper;
import com.tre.entity.Article;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<Article> selectAll() {
        return articleMapper.selectAllArticle();
    }

    @Override
    public Article selectArticleByName(String article_title) {
        return articleMapper.selectArticleByName(article_title);
    }

    @Override
    public Integer createArticle(Article article) {
        Integer article2 = articleMapper.insertArticle(article);
        return article2;
    }

    @Override
    public Integer updateArticle(Article article) {
        return articleMapper.updateArticle(article);
    }

    @Override
    public Integer deleteArticle(String article_id) {
        return articleMapper.deleteArticle(article_id);
    }

    @Override
    public List<Article> vagueSelectTitle(String article_title) {
        return articleMapper.vagueSelectTitle(article_title);
    }
}
