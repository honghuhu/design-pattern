package io.honghu.state;

/**
 * [关闭]任务模型
 */
public class ClosingState extends LiftState {

    /**
     * 状态切换为[打开],这里将上下文交给[打开]任务模型
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    /**
     * [关闭]操作
     */
    @Override
    public void close() {
        System.out.println("电梯门关闭。。。");
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
     * 状态切换为[停止],这里将上下文交给[停止]任务模型
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
