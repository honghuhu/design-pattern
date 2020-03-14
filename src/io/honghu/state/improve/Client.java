package io.honghu.state.improve;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.closingState);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
