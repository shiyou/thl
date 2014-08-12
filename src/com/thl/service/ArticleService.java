package com.thl.service;

import java.util.List;

import com.thl.model.Article;

public interface ArticleService {
	public void addArticle(Article article);
	public List<Article> listArticle();
	public void delArticle(String id);
	public void updateArticle(Article article);
}
