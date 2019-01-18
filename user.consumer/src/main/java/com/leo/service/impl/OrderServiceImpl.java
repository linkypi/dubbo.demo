package com.leo.service.impl;

import com.leo.entity.UserAddress;
import com.leo.service.OrderService;
import com.leo.service.UserAddressService;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Reference;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Reference
    public UserAddressService userAddressService;


    @Override
    public void initOrder(String userId) {

    }

    public List<UserAddress> gets(String userid){
        List<UserAddress> result = userAddressService.getUserAddrList(userid);
        return result;
    }
}
