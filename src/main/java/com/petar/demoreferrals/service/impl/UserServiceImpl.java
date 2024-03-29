package com.petar.demoreferrals.service.impl;


import com.petar.demoreferrals.model.User;
import com.petar.demoreferrals.repository.UserRepository;
import com.petar.demoreferrals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Optional<User> findById(Long id) {
        return Optional.of(repository.getOne(id));
    }

    @Override
    public Collection<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
}