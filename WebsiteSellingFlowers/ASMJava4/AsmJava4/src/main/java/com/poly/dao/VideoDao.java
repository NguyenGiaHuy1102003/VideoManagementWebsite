package com.poly.dao;

import java.util.List;

import com.poly.entity.Video;

public interface VideoDao 
{
	Video finById(Integer id);
	Video findByHref(String href);
	List<Video> findAll();
	List<Video> finAll(int pageNumber, int pageSize);
	Video create(Video entity);
	Video update(Video entity);
	Video delete(Video entity);
	
	
}
