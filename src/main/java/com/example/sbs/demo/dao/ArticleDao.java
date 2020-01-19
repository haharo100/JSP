package com.example.sbs.demo.dao;

import java.util.ArrayList;

import com.example.sbs.demo.controller.Article;

public class ArticleDao {
	ArrayList<Article> articles =new ArrayList<Article>();

	
	public void insertArticle(int id,String title,String body,String nick) {
		
		Article a =new Article();
		
		a.setId(id);
		a.setTitle(title);
		a.setBody(body);
		a.setNick(nick);
		
		articles.add(a);
		
	}
	
	public ArrayList<Article> getArticles(){
		return this.articles;
	}
	
	public void removeArticle(int id) {
		articles.remove(id);
	}
	
}
