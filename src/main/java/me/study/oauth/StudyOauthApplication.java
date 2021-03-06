package me.study.oauth;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StudyOauthApplication {
	private static final String PROPERTIES = "spring.config.location=classpath:/oauth.yml";

	public static void main(String[] args) {
		new SpringApplicationBuilder(StudyOauthApplication.class)
				.properties(PROPERTIES)
				.run(args);
	}

}
