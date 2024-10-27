package com.priyal.bookmarker;

import com.priyal.bookmarker.BookmarkerApiApplication;
import org.springframework.boot.SpringApplication;
import org.testcontainers.utility.TestcontainersConfiguration;

public class TestBookmarkerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookmarkerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
