package io.honghu.state.improve;

/**
 * [停止]任务模型
 */
public class StoppingState extends LiftState {

    /**
     * 状态切换为[打开],这里将上下文交给[打开]任务模型
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.open();
    }

    @Override
    public void close() {
        // do nothing
    }

    /**
     * 状态切换为[运行],这里将上下文交给[运行]任务模型
     */
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    /**
     * [停止]操作
     */
    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
