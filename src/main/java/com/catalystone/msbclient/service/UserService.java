package com.catalystone.msbclient.service;

import com.catalystone.msbclient.client.UserRestClient;
import com.catalystone.msbclient.domain.Theater;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRestClient userRestClient;

    public List<Theater> getTheaters(){
        log.info("into service");
        return userRestClient.getTheaterList();
    }

}
