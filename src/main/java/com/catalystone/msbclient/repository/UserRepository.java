package com.catalystone.msbclient.repository;

import com.catalystone.msbclient.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String name);
}
