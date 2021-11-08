package io.honghu.bridge.mode.impl;

import io.honghu.bridge.mode.IPayMode;

public class PayFaceMode implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("人脸支付，风控校验脸部识别");
        return true;
    }

}