package io.honghu.responsibilitychain;

public class Father implements IHandler {
    @Override
    public void HandleMessage(IWomen women) {
        System.out.println("女儿的请求: " + women.getRequest());
        System.out.println("父亲的答复: 同意");
    }
}
