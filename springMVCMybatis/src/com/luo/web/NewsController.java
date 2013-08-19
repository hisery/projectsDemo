package com.luo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.luo.pojo.News;
import com.luo.service.INewsService;


@Controller
@RequestMapping("/news")
public class NewsController {
	@Autowired
	private INewsService newsService;
	
	@RequestMapping(value="/findAllNewsList",method=RequestMethod.GET)
	public ModelAndView hello(){
		List<News> newsList=newsService.findAllNewsList();
		return new ModelAndView("newsList", "newsList", newsList);
	}
	
}
