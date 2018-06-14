package com.bcbsfl.wizardAdmin.service;

import com.bcbsfl.wizardAdmin.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}