package com.luo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luo.annotation.Cache;
import com.luo.annotation.CacheKeyPrefix;
import com.luo.annotation.CacheType;
import com.luo.dao.NewsDao;
import com.luo.pojo.News;
import com.luo.service.INewsService;

@Service
@Transactional
public class NewsServiceImpl implements INewsService {

	@Autowired
	private NewsDao newsDao;
	
	
	@Cache(cacheKeyPrefix=CacheKeyPrefix.SYSTEM_ALLNEWS,cacheType=CacheType.List)
	@Transactional(readOnly=true)
	@Override
	public List<News> findAllNewsList() {
		return newsDao.findAllNewsList();
	}

}
