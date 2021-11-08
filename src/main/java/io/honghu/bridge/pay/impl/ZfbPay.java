package io.honghu.bridge.pay.impl;

import io.honghu.bridge.mode.IPayMode;
import io.honghu.bridge.pay.Pay;

import java.math.BigDecimal;

public class ZfbPay extends Pay {

    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String channelName() {
        return "zfb";
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        System.out.printf("模拟支付宝渠道支付划账成功。uid：{%s} tradeId：{%s} amount：{%s}%n", uid, tradeId, amount);
        return "0000";
    }

}