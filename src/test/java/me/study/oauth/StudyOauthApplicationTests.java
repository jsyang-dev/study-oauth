package me.study.oauth;

import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudyOauthApplicationTests {
	@Before
	public void setup() {
		RestAssured.port = 8080;
	}

	@Test
	public void 기본path로_접근하면_index_html_호출된다 () {
		given()
				.when()
				.get("/")
				.then()
				.statusCode(200)
				.contentType("text/html")
				.body(containsString("권한 관리"));
	}
}
