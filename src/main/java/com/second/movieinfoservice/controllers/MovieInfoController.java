package com.second.movieinfoservice.controllers;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.second.movieinfoservice.models.MovieInfoModels;

@RestController
@RequestMapping("/movieInfo")
public class MovieInfoController {
	
	@RequestMapping("/{id}")
	public MovieInfoModels getMovieInfo(@PathVariable("id") String id){
		
		MovieInfoModels model = new MovieInfoModels();
		
		if(id.equals("111")) {
			model.setId("111");
			model.setMovie("jab we met");
			model.setPrice(200l);
		}
		
		if(id.equals("222")) {
			model.setId("222");
			model.setMovie("Atarangi re");
			model.setPrice(100l);
		}
		if(id.equals("333")) {
			model.setId("333");
			model.setMovie("Hum dil de chuke sanam");
			model.setPrice(100l);
		}
		return model;
	}

}
