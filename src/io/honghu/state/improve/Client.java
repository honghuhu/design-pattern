package io.honghu.state.improve;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();

//        控制台结果
//        电梯门打开。。。
//        电梯门关闭。。。
//        电梯上下运行。。。
//        电梯停止了。。。
    }
}
