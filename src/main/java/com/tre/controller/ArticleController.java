package com.tre.controller;

import com.tre.entity.Article;
import com.tre.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //查询全部文章信息
    @GetMapping(value = "/allArticle")
    public ResponseEntity getArticle() {
        List<Article> articleList=articleService.selectAll();
        return ResponseEntity.ok(articleList);
    }

    //添加文章
    @PostMapping(value = "/articleCreate")
    public ResponseEntity createArticle(@RequestBody Article article) {
        Article article1 = articleService.selectArticleByName(article.getArticle_title());
        if (article1 != null) {
            return ResponseEntity.ok().body("False");
        } else {
            articleService.createArticle(article);
            return ResponseEntity.ok().body("Success");
        }

    }

    //修改文章
    @PostMapping(value = "/articleUpdate")
    public ResponseEntity updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
        return ResponseEntity.ok(article);
    }

    //删除文章
    @PostMapping(value = "/articleDelete/{article_id}")
    public ResponseEntity deleteArticle(@PathVariable("article_id") String article_id) {
        articleService.deleteArticle(article_id);
        return ResponseEntity.ok(article_id);
    }

    //模糊查询
    @PostMapping(value = "/vagueSelectArticle/{article_title}")
    public ResponseEntity vagueSelect(@PathVariable("article_title") String article_title) {
        List<Article> articleList2 = articleService.vagueSelectTitle(article_title);
        return ResponseEntity.ok(articleList2);
    }
}
