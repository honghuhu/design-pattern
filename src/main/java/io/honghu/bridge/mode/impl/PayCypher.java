package io.honghu.bridge.mode.impl;

import io.honghu.bridge.mode.IPayMode;

public class PayCypher implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("密码支付，风控校验环境安全");
        return true;
    }

}