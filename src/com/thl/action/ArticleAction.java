package com.thl.action;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.thl.model.Article;
import com.thl.model.Atype;
import com.thl.model.User;
import com.thl.service.ArticleService;
import com.thl.service.AtypeService;
import com.thl.service.UserService;

public class ArticleAction implements ModelDriven {
	Article article = new Article();
	User user = new User();
	ArticleService articleService;
	UserService userService;
	AtypeService typeService;
	
	public String addArticle(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);  
		String title = (String) request.getAttribute("title");
		String content =(String) request.getAttribute("content");
		Integer status = 0;//(Integer) request.getAttribute("status");
		Long userId =Long.parseLong("1");// (Long) request.getAttribute("userId");
		Long[] typeIds = {Long.parseLong("1")};//(Long[]) request.getAttribute("typeIds");

		user = userService.getUser(userId); 
		Set<Atype> types = new HashSet<Atype>();
		for(int i=0;i<typeIds.length;i++){
			types.add(typeService.getAtype(typeIds[i]));
		}
		article.setId(UUID.randomUUID().toString());
		article.setTitle(title);
		article.setContent(content);
		article.setStatus(status);
		article.setUser(user);
		article.setTypes(types);
		
		articleService.addArticle(article);
		
		return null;
	}


	@Override
	public Object getModel() {
		return article;
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


	public AtypeService getTypeService() {
		return typeService;
	}


	public void setTypeService(AtypeService typeService) {
		this.typeService = typeService;
	}
	
}
