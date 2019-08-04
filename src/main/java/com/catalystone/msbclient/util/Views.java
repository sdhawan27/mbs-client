package com.catalystone.msbclient.util;

public enum Views {

    LOGIN("login"),
    USER_HOME("user_home"),
    ADMIN_HOME("admin_home"),
    ERROR("error");

    private String view;

    Views(String view){
        this.view = view;
    }

    public String getView(){
        return view;
    }

}
