package io.honghu.visitor.heighten;

public class Client {
    public static void main(String[] args) {
        DataView dataView = new DataView();

        // 家长视角访问
        dataView.show(new Parent());
        // 校长视角访问
        dataView.show(new Principal());
    }
}
