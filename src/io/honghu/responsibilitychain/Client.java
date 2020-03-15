package io.honghu.responsibilitychain;

import java.util.ArrayList;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<>();
        for (int i = 0, len = 5; i < len; i++) {
            arrayList.add(new Women(random.nextInt(4), "我要出去逛街"));
        }

        IHandler father = new Father();
        IHandler husband = new Husband();
        IHandler son = new Son();
        arrayList.forEach(women -> {
            if (women.getType() == 1) {
                System.out.println("----- 女儿向父亲请示 -----");
                father.HandleMessage(women);
            } else if (women.getType() == 2) {
                System.out.println("------ 妻子向丈夫指示 -----");
                husband.HandleMessage(women);
            } else if (women.getType() == 3) {
                System.out.println("----- 母亲向儿子请示 -----");
                son.HandleMessage(women);
            } else {

            }
        });
    }
}
