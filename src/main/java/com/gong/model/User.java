package com.gong.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/6/29.
 */
public class User implements Serializable {
    private static final long serialVersionUID = -6011241820070393952L;
    private String id;
    private String username;
    private String password;
    public User() {
    }

    public User(String id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
