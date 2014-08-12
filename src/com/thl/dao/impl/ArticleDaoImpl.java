package com.thl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.thl.dao.ArticleDao;
import com.thl.model.Article;

public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	@Override
	public void addArticle(Article article) {
			getHibernateTemplate().save(article);
	}

	@Override
	public void delArticle(String id) {
		getHibernateTemplate().delete(getHibernateTemplate().get(Article.class, id)); //你看虽然方便了，但却。。。
	}

	@Override
	public Article getArticleById(String id) {
		return (Article) getHibernateTemplate().get(Article.class, id);
	}

	@Override
	public List<Article> listArticle() {
		//List<Article> list = getHibernateTemplate().loadAll(Article.class);
		//List<Article> list2=  getHibernateTemplate().find("from article");
		return getHibernateTemplate().find("from Article");
	}

	@Override
	public void updateArticle(Article article) {
		getHibernateTemplate().update(article);
	}

}
