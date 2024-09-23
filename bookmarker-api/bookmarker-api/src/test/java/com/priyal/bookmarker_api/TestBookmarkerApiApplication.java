package com.priyal.bookmarker_api;

import com.priyal.bookmarker.BookmarkerApiApplication;
import org.springframework.boot.SpringApplication;

public class TestBookmarkerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
