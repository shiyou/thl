package com.thl.service.impl;

import java.util.List;

import com.thl.dao.ArticleDao;
import com.thl.model.Article;
import com.thl.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	ArticleDao articleDao ;
	@Override
	public void addArticle(Article article) {
		articleDao.addArticle(article);
	}

	@Override
	public void delArticle(String id) {
		articleDao.delArticle(id);
	}

	@Override
	public List<Article> listArticle() {
		return articleDao.listArticle();
	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);
	}
	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
}
