package com.thl.dao;

import java.util.List;

import com.thl.model.Article;

public interface ArticleDao {
	void addArticle(Article article);
	void delArticle(String id);
	void updateArticle(Article article);
	Article getArticleById(String id);
	List<Article> listArticle();
}
