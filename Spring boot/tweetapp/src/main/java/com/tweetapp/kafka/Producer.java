package com.tweetapp.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Producer {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	private String topicName = "tweet";

	public void sendMessage(String msg) {
		log.info("Sent message: {}", msg);
		kafkaTemplate.send(topicName, msg);
	}

}
