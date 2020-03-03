package com.hwadee.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwadee.service.MovieService;

public class SpringTest {

	@Test
	void test01() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		MovieService movieService = (MovieService) applicationContext.getBean("movieService");

		movieService.findMovieById(1);
		movieService.findMovieList(1);
	}

}
