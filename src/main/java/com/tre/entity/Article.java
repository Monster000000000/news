package com.tre.entity;

public class Article {
    private String article_id;// varchar(36) primary key comment '文章的UUID',
    private String article_title;// varchar(300) not null comment '文章的标题',
    private String article_date;// varchar(20) not null comment '发布时间',
    private String article_content;// longtext comment '文章内容',
    private String nav_id;// varchar(36) not null comment '分类ID'

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_date() {
        return article_date;
    }

    public void setArticle_date(String article_date) {
        this.article_date = article_date;
    }

    public String getArticle_content() {
        return article_content;
    }

    public void setArticle_content(String article_content) {
        this.article_content = article_content;
    }

    public String getNav_id() {
        return nav_id;
    }

    public void setNav_id(String nav_id) {
        this.nav_id = nav_id;
    }
}
