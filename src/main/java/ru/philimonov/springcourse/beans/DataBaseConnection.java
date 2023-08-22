package ru.philimonov.springcourse.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DataBaseConnection {
    @Value("${db.login}")
    private String login;

    @Value("${db.password}")
    private String password;

    @Value("${db.url}")
    private String url;

    @Override
    public String toString() {
        return "DataBaseConnection{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
