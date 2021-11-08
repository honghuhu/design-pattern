package io.honghu.bridge.pay;

import io.honghu.bridge.mode.IPayMode;

import java.math.BigDecimal;

public abstract class Pay {

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public String pay(String uid, String tradeId, BigDecimal amount) {
        System.out.printf("模拟%s渠道支付划账开始。uid：{%s} tradeId：{%s} amount：{%s}%n", channelName(), uid, tradeId, amount);
        boolean security = payMode.security(uid);
        System.out.printf("模拟%s渠道支付风控校验。uid：{%s} tradeId：{%s} security：{%s}%n", channelName(), uid, tradeId, security);
        if (!security) {
            System.out.printf("模拟%s渠道支付划账拦截。uid：{%s} tradeId：{%s} amount：{%s}%n", channelName(), uid, tradeId, amount);
            return "0001";
        }
        return transfer(uid, tradeId, amount);
    }

    public abstract String channelName();

    public abstract String transfer(String uid, String tradeId, BigDecimal amount);
}