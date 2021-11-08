package io.honghu.bridge.mode.impl;

import io.honghu.bridge.mode.IPayMode;

public class PayFingerprintMode implements IPayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("指纹支付，风控校验指纹信息");
        return true;
    }

}
