package com.ll.aws_spring_2;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.Bucket;

@Service
@RequiredArgsConstructor
public class S3ServiceImpl implements S3Service {

	private final S3Client s3Client;

	@Override
	public List<String> getBucketsNames() {
		return s3Client.listBuckets().buckets().stream().map(Bucket::name).toList();
	}
}
