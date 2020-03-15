package io.honghu.responsibilitychain.improve;

public class Father extends Handler {

    /**
     * 每个类都要说明一下自己能处理哪些请求
     */
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    /**
     * 父亲的答复
     */
    @Override
    protected void response(IWomen women) {
        System.out.println("----- 女儿的请示 -----");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是: 同意");
    }
}
