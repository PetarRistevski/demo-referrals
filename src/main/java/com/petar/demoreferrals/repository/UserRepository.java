package com.petar.demoreferrals.repository;

import com.petar.demoreferrals.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Profile("jpa")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName (String name);

}