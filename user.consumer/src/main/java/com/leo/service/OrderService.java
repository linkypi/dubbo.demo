package com.leo.service;

import com.leo.entity.UserAddress;

import java.util.List;

public interface OrderService {
    public void initOrder(String userId);
    public List<UserAddress> gets(String userid);
}
