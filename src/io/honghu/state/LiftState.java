package io.honghu.state;

public abstract class LiftState {

    protected Context context;

    public void setContent(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
