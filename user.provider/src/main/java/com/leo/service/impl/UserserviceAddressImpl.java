package com.leo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leo.entity.UserAddress;
import com.leo.service.UserAddressService;

import java.util.Arrays;
import java.util.List;

@Service(timeout = 5000)
public class UserserviceAddressImpl implements UserAddressService {

    @Override
    public List<UserAddress> getUserAddrList(String userId) {
        UserAddress add1 = new UserAddress(1,"深圳福田","12","1501231237");
        UserAddress add2 = new UserAddress(1,"北京王府井","47","1991231672");
        return Arrays.asList(add1,add2);
    }
}
