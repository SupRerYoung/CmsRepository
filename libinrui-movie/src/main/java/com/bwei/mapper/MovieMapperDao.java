package com.bwei.mapper;

import java.util.List;
import java.util.Map;

public interface MovieMapperDao {
	List<Map<String,Object>> selectMovieList(Map<String,Object> map);
}
