package io.honghu.state;

/**
 * [打开]任务模型
 */
public class OpenningState extends LiftState {

    /**
     * [打开]逻辑
     */
    @Override
    public void open() {
        System.out.println("电梯门打开。。。");
    }

    /**
     * 状态切换为[关闭],这里将上下文交给[关闭]任务模型
     */
    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.close();
    }

    @Override
    public void run() {
        // do nothing;
    }

    @Override
    public void stop() {
        // do nothing;
    }
}
