package com.hwadee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwadee.entity.Movie;
import com.hwadee.mapper.MovieMapper;

@Service("movieService")
public class MovieService {

	@Autowired
	private MovieMapper movieMapper;

	private int pageSize = 10;

	public void saveMovie(Movie movie) {
		System.out.println(" Service 业务层 ：保存电影数据（ " + movie + ")");
	}

	public Movie findMovieById(Integer id) {
		System.out.println(" Service 业务层 ：根据 id（" + id + "） 查找电影数据");

		return null;
	}

	public List<Movie> findMovieList(Integer currentPage) {
		System.out.println(" Service 业务层 ：根据分页信息， 查找电影数据集");

		return null;
	}

}
