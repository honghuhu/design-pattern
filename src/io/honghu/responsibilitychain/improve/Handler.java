package io.honghu.responsibilitychain.improve;

public abstract class Handler extends Client {

    public final static int FATHER_LEVEL_REQUEST = 1;

    public final static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    /**
     * 能处理的级别
     */
    private int level;

    /**
     * 责任传递，下一个责任人是谁
     */
    private Handler nextHandler;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     */
    public Handler(int level) {
        this.level = level;
    }

    /**
     * 处理请求
     */
    public final void handleMessage(IWomen women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else {
            if (this.nextHandler != null) {
                this.nextHandler.handleMessage(women);
            } else {
                System.out.println("--- 不同意 ---");
            }
        }
    }

    /**
     * 设置下一个处理者
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * 响应
     */
    protected abstract void response(IWomen women);
}
