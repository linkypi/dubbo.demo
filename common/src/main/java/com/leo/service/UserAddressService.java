package com.leo.service;

import com.leo.entity.UserAddress;
import com.alibaba.dubbo.config.annotation.Service;
import java.util.List;

//@Service(timeout = 5000)
public interface UserAddressService {

    public List<UserAddress> getUserAddrList(String userId);
}