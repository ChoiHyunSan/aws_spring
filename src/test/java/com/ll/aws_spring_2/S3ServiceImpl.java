package com.ll.aws_spring_2;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;

@Service
public class S3ServiceImpl implements S3Service {
	@Override
	public List<String> getBucketsNames() {
		return List.of(" ");
	}
}
