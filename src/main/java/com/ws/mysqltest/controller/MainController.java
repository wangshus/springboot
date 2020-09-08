package com.ws.mysqltest.controller;

import com.ws.mysqltest.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Api
@Slf4j
@RestController
public class MainController {

    @ApiOperation("hi")
    @GetMapping("/")
    public String hi() {
        return "hi";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ApiOperation("get info")
    @PostMapping("/q")
    public User user(@RequestParam("id") int id, HttpSession httpSession) {
        User user = new User();

        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from user where id =" + id);
        Map<String,Object> map = list.get(0);
        user.setId((Integer) map.get("id"));
        user.setName((String) map.get("name"));
        user.setSex((Integer) map.get("sex"));
        user.setContent((String) map.get("content"));
        log.warn(String.valueOf(user));
        return user;
    }
}
