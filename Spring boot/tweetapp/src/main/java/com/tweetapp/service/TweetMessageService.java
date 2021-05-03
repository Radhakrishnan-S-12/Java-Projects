package com.tweetapp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entity.ReplyTweetMessage;
import com.tweetapp.entity.TweetMessage;
import com.tweetapp.entity.UserRegistration;
import com.tweetapp.repository.ReplyTweetMessageRepository;
import com.tweetapp.repository.TweetMessageRepository;
import com.tweetapp.repository.UserRegistrationRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TweetMessageService {
	@Autowired
	TweetMessageRepository tweetMessageRepository;
	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	@Autowired
	ReplyTweetMessageRepository replyTweetMessageRepository;

	public List<TweetMessage> getAllTweet() {
		log.debug("Entered get all tweet method");
		return tweetMessageRepository.findAll();

	}

	public String postTweet(TweetMessage tweetMessage, String username) {
		log.debug("Entered post tweet method");
		tweetMessage.setLoginId(username);
		tweetMessageRepository.save(tweetMessage);
		return "saved";
	}

	public List<TweetMessage> getUserTweet(String username) {
		// tweetMessageRepository.=
		log.debug("Entered get user tweet method");
		return tweetMessageRepository.findByLoginId(username);

	}

	public String updateTweetMessage(String username, String id, String tweet) {
		log.debug("Entered update tweet method");
		TweetMessage tweetMessage = tweetMessageRepository.findByIdAndLoginId(id, username);
		tweetMessage.setTweetMessage(tweet);
		tweetMessageRepository.save(tweetMessage);
		return "updated";
	}

	public String deleteTweetMessage(String username, String id) {
		log.debug("Entered delete tweet method");
		tweetMessageRepository.deleteByIdAndLoginId(id, username);
		return "deleted";
	}

	public String postReplyTweet(ReplyTweetMessage replyTweetMessage) {
		log.debug("Entered post reply tweet method");
		replyTweetMessageRepository.save(replyTweetMessage);
		return "saved";
	}

	public List<ReplyTweetMessage> getReplyTweet(String tweetMessageId) {
		log.debug("Entered get reply tweet method");
		return replyTweetMessageRepository.findByTweetMessageId(tweetMessageId);

	}

	public String updateLike(String username, String id) {
		log.debug("Entered update  tweet like method");
		TweetMessage message = tweetMessageRepository.findByIdAndLoginId(id, username);
		int count = message.getLikeCount() + 1;
		message.setLikeCount(count);
		tweetMessageRepository.save(message);
		return "updated";
	}

}
