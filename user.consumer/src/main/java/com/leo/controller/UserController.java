package com.leo.controller;

import com.leo.entity.UserAddress;
import com.leo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(path = "/list",method = RequestMethod.GET)
    public List<UserAddress> getlist() {
        return orderService.gets("1");
    }
}
