package com.ll.aws_spring_2;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
class S3ServiceImplTest {

	@Autowired
	private MockMvc mvc;

	@Test
	@DisplayName("GET Buckets Name")
	void t1() throws Exception {

		ResultActions resultActions = mvc.perform(
			get("/buckets")
		).andDo(print());

		resultActions.andExpect(
			status().isOk()
		);
	}
}
