package com.mattlangsenkamp.learningspring;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.mattlangsenkamp.config.ContentCalendarProperties;
import com.mattlangsenkamp.learningspring.model.Content;
import com.mattlangsenkamp.learningspring.model.Status;
import com.mattlangsenkamp.learningspring.model.Type;
import com.mattlangsenkamp.learningspring.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class LearningspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningspringApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository contentRepository) {
		return args -> {
			Content c = new Content(
					null,
					"woooow that suckkks dude",
					"cool dffffesc",
					Status.IN_PROGRESS,
					Type.ARTICLE,
					LocalDateTime.now(),
					LocalDateTime.now(),
					"wow");
			contentRepository.save(c);
		};
	}

}
