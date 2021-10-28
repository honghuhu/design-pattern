package io.honghu.state;

public class Context {

    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    /*
     * Context 与状态实体组合时没有初始化状态操作实体里聚合的 Context
     * 会导致运行时执行修改电梯状态实体报空指针异常，这块只需要稍加修改就可以。
     * 在 Context 添加空参构造
     */
    /*public Context() {
        openningState.setContent(this);
        closingState.setContent(this);
        runningState.setContent(this);
        stoppingState.setContent(this);
    }*/

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContent(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
