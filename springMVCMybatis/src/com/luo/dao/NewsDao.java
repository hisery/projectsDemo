package com.luo.dao;

import java.util.List;

import com.luo.pojo.News;

public interface NewsDao {

	List<News> findAllNewsList();

}
