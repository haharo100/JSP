package com.example.sbs.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sbs.demo.dao.ArticleDao;


@Controller
public class Testcontroller {
	
	ArticleDao dao=new ArticleDao();
	
	@RequestMapping("addArticle")
	@ResponseBody
	public String hello(int id,String title,String body,String nick){
		
		dao.insertArticle(id, title, body, nick);
		
		return "게시물이 저장 되었습니다.";
		
		
	}
	@RequestMapping("list")
	@ResponseBody
	public ArrayList<Article> list(){
		
		ArrayList<Article> list =dao.getArticles();
		return list;
		
	}
	ArrayList<Integer> nlist =new ArrayList<Integer>();//아래가 누적이 안되서 위에 올림
	@RequestMapping("addNumber")
	@ResponseBody
	
	
	public String addNumber(int num) {
		
		/*
		ArrayList<Integer> nlist =new ArrayList<Integer>();
		nlist.add(num);			누적이 안됨
		*/
		nlist.add(num);
		
		
		return num+" 추가되었습니다.";
	}
	@RequestMapping("showAllvalues")
	@ResponseBody
	
	public ArrayList<Integer> showAllValues(){
		return nlist;
	}
	
	@RequestMapping("removeArticle")
	@ResponseBody
	
	public String removeArticle(int id) {
		dao.removeArticle(id);
		
		return id+"번 글이 삭제되었습니다.";
	
	}
	
	@RequestMapping("editArticle")
	@ResponseBody
	
	public String editArticle(int id,String title,String body) {
		
	}
	
	
	
}
