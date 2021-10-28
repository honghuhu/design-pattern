package io.honghu.responsibilitychain;

public class Husband extends Handler {

    /**
     * 每个类都要说明一下自己能处理哪些请求
     */
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    /**
     * 丈夫的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("----- 妻子的请示 -----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是: 同意");
    }
}
