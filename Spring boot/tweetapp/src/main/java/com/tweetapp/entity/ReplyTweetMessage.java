package com.tweetapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "ReplyTweetMessage")
public class ReplyTweetMessage {
	@Id
	private String id;
	private String replyMessage;
	private String tweetMessageId;
	private String loginId;

}
