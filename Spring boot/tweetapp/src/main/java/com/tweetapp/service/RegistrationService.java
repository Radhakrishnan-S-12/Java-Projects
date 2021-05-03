package com.tweetapp.service;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.entity.UserRegistration;
import com.tweetapp.repository.UserRegistrationRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RegistrationService {
	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	public String saveUserRegistration(UserRegistration registration) throws Exception {
		log.info("Entered into save user method");
		UserRegistration user = userRegistrationRepository.findByLoginIdAndEmail(registration.loginId,
				registration.email);
		boolean existingUser = user == null ? true : false;
		log.info("Checking UserAlready Exist, {}", existingUser);
		if (!existingUser) {
			throw new Exception("LoginId and EmailId already Exist");
		} else {
			userRegistrationRepository.save(registration);

		}

		return "saved";

	}

	public UserRegistration getUser(String username) {
		log.info("Enter into get user method");
		return userRegistrationRepository.findByLoginId(username);
	}

	public List<UserRegistration> getAllUser() {
		log.info("Enter into get user method");
		return userRegistrationRepository.findAll();
	}

	public String updatePassword(String loginId, String oldPassword, String newPassword) throws Exception {
		log.info("Enter into update password method");
		boolean valid = userRegistrationRepository.existsByLoginIdAndPassword(loginId, oldPassword);
		if (valid) {
			UserRegistration user = userRegistrationRepository.findByLoginId(loginId);
			user.setPassword(newPassword);
			userRegistrationRepository.save(user);
		} else {
			throw new Exception("Old password incorrect");
		}
		return "updated";
	}

	public String forgetPassword(String loginId, String newPassword) throws Exception {
		log.info("Enter into forget password method");
		boolean valid = userRegistrationRepository.existsByLoginId(loginId);
		if (valid) {
			UserRegistration user = userRegistrationRepository.findByLoginId(loginId);
			user.setPassword(newPassword);
			userRegistrationRepository.save(user);
		} else {
			throw new Exception("incorrect loginId");
		}
		return "updated";
	}

}
