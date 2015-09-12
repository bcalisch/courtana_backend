package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> getList();

    boolean verify(User user);
}
