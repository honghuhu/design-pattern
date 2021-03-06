package io.honghu.responsibilitychain;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0, len = 5; i < len; i++) {
            arrayList.add(new Women(random.nextInt(3) + 1, "我要出去逛街"));
        }
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        arrayList.forEach(father::handleMessage);

//        控制台结果
//        ----- 妻子的请示 -----
//                我要出去逛街
//        丈夫的答复是: 同意
//                ----- 妻子的请示 -----
//                我要出去逛街
//        丈夫的答复是: 同意
//                ----- 母亲的请示 -----
//                我要出去逛街
//        儿子的答复是: 同意
//                ----- 母亲的请示 -----
//                我要出去逛街
//        儿子的答复是: 同意
//                ----- 母亲的请示 -----
//                我要出去逛街
//        儿子的答复是: 同意
    }
}
