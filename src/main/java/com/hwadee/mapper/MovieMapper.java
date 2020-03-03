package com.hwadee.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hwadee.entity.Movie;

@Repository("movieMapper")
public interface MovieMapper {

	int saveMovie(Movie movie);

	Movie findMovieById(Integer id);

	List<Movie> findMovieList(Integer beginPage, Integer endPage);

//	List<Movie> findMovieList(Integer currentPage, Integer pageSize);

}
