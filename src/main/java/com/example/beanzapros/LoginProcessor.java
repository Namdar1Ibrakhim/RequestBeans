package com.example.beanzapros;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
//бин с областью видимости в рамках запроса
public class LoginProcessor {

    private String username;
    private String password;

    public boolean login(){
        String username = this.getUsername();
        String password = this.getPassword();
        if ("ibra".equals(username) && "ibra".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
