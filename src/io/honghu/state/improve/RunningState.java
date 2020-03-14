package io.honghu.state.improve;

/**
 * [运行]任务模型
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        // do nothing
    }

    @Override
    public void close() {
        // do nothing
    }

    /**
     * [运行]逻辑
     */
    @Override
    public void run() {
        System.out.println("电梯上下运行。。。");
    }

    /**
     * 状态切换为[停止],这里将上下文交给[停止]任务模型
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
