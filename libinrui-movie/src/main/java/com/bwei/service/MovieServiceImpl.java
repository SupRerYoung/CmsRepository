package com.bwei.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwei.mapper.MovieMapperDao;


@Service
public class MovieServiceImpl implements MovieService{
	
	@Resource
	private MovieMapperDao movieMapperDao;

	@Override
	public List<Map<String, Object>> selectMovieList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return movieMapperDao.selectMovieList(map);
	}
	
}
