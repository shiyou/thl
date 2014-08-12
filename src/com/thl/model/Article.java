package com.thl.model;

import java.util.Date;
import java.util.Set;

public class Article {
	private String id;
	private String title;
	private String content;
	private Date releaseTime;
	private int status;
	private User user;
	private Set<Atype> types;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<Atype> getTypes() {
		return types;
	}
	public void setTypes(Set<Atype> types) {
		this.types = types;
	}

}
