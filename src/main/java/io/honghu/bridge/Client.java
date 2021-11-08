package io.honghu.bridge;

import io.honghu.bridge.mode.impl.PayFaceMode;
import io.honghu.bridge.mode.impl.PayFingerprintMode;
import io.honghu.bridge.pay.Pay;
import io.honghu.bridge.pay.impl.WxPay;
import io.honghu.bridge.pay.impl.ZfbPay;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        System.out.printf("模拟测试场景；微信支付、人脸方式。%n");
        Pay wxPay = new WxPay(new PayFaceMode());
        String wx = wxPay.pay("weixin_100", "100000109893", new BigDecimal(100));

        System.out.printf("\r\n模拟测试场景；支付宝支付、指纹方式。%n");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        String zfb = zfbPay.pay("zfb_100", "100000109894", new BigDecimal(100));
    }
}
