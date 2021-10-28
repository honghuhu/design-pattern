package io.honghu.responsibilitychain;

public class Women implements IWomen {

    /**
     * 1: 未结婚
     * 2: 已结婚
     * 3: 丈夫去世了
     */
    private int type = 0;
    /**
     * 妇女的请示
     */
    private String request = "";

    public Women(int type, String request) {
        this.type = type;
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是: " + request;
                break;
            case 2:
                this.request = "妻子的请求是: " + request;
                break;
            case 3:
                this.request = "母亲的请求是: " + request;
        }
        this.request = request;
    }

    /**
     * 获得自己的状况
     */
    @Override
    public int getType() {
        return this.type;
    }

    /**
     * 获得妇女的请求
     */
    @Override
    public String getRequest() {
        return this.request;
    }
}
