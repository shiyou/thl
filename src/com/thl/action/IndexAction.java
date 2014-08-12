package com.thl.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.thl.model.Article;
import com.thl.service.ArticleService;
import com.thl.service.UserService;

public class IndexAction implements ModelDriven{
	ArticleService articleService;
	UserService userService;
	
	public String index(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
		List<Article> articleList = articleService.listArticle();
		request.setAttribute("articles", articleList);
		return "success";
	}
	

	public ArticleService getArticleService() {
		return articleService;
	}


	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public Object getModel() {
		return null;
	}
	

}
