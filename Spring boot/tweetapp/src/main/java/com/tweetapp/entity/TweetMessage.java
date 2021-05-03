package com.tweetapp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "TweetMessage")
public class TweetMessage {
	@Id
	private String id;
	private String tweetMessage;
	private String tweetTime;
	private int likeCount;
	private String loginId;

}
