package com.bwei.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwei.service.MovieService;


@Controller
public class MovieController {

	@Autowired
	private MovieService ms;
	
	@RequestMapping("list.do")
	public String selectMovieList(Model model) {
		Map<String, Object> map=new HashMap<>();
		List<Map<String,Object>> movieList = ms.selectMovieList(map);
		model.addAttribute("movieList", movieList);
		return "list";
	}
}
