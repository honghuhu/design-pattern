package io.honghu.bridge.pay.impl;

import io.honghu.bridge.mode.IPayMode;
import io.honghu.bridge.pay.Pay;

import java.math.BigDecimal;

public class WxPay extends Pay {

    public WxPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String channelName() {
        return "wx";
    }

    @Override
    public String transfer(String uid, String tradeId, BigDecimal amount) {
        System.out.printf("模拟微信渠道支付划账成功。uid：{%s} tradeId：{%s} amount：{%s}%n", uid, tradeId, amount);
        return "0000";
    }

}
