package com.thl.model;

import java.util.Date;
import java.util.Set;

public class Atype {
	private Long id;
	private String name;
	private Date createTime;
	private Set articles;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Set getArticles() {
		return articles;
	}
	public void setArticles(Set articles) {
		this.articles = articles;
	}
	

}
