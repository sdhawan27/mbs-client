package com.catalystone.msbclient.service;

import com.catalystone.msbclient.entity.User;
import com.catalystone.msbclient.exception.UserNotFoundException;
import com.catalystone.msbclient.repository.UserRepository;
import com.catalystone.msbclient.util.UserRole;
import com.catalystone.msbclient.util.Views;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

   @Autowired
   UserRepository uRepo;


    public String getUserView(String name, String password) throws  UserNotFoundException{

        User user = Optional.ofNullable(uRepo.findByUserName(name))
                .orElseThrow( UserNotFoundException::new);

        boolean isAuthenticated = isAuthenticatedUser(user, password);

        if(!isAuthenticated){
            return Views.ERROR.getView();
        }
        return getView(user.getRole());
    }

    private String getView(String role) {

        if(UserRole.ADMIN.getRole().equalsIgnoreCase(role)){
            return Views.ADMIN_HOME.getView();
        }
        return Views.USER_HOME.getView();
    }

    private boolean isAuthenticatedUser(User user, String password){

        if(password.equals(user.getPassword()))
            return true;
        return false;
    }

}