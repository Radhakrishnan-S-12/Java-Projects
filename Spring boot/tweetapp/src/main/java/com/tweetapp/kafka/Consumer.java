package com.tweetapp.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Consumer {
	@KafkaListener(topics = "tweet", groupId = "group-id")
	public String listen(String message) {
		log.info("Received Messasge in group - group-id: {}", message);
		return "message received:" + message;

	}

}
