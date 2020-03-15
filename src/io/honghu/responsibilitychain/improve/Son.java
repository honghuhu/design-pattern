package io.honghu.responsibilitychain.improve;

public class Son extends Handler {

    /**
     * 每个类都要说明一下自己能处理哪些请求
     */
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    /**
     * 儿子的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("----- 母亲的请示 -----");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是: 同意");
    }
}
