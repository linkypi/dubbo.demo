package com.leo.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String phone;

    public UserAddress(){
        super();
    }
    public UserAddress(Integer id, String address, String userId, String phone){
        this.setId(id);
        this.setUserAddress(address);
        this.setUserId(userId);
        this.setPhone(phone);
    }
}
