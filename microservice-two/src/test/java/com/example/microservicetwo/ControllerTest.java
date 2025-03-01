package com.example.microservicetwo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(Controller.class)
class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void helloEndpointShouldReturnExpectedMessage() throws Exception {
		mockMvc.perform(get("/service-two/hello")).andExpect(status().isOk())
				.andExpect(content().string("Hello from Microservice Two!"));
	}
}
