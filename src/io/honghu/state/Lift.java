package io.honghu.state;

public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    /**
     * 打开操作
     * 状态为[关闭|停止]才可以执行
     */
    @Override
    public void open() {
        switch (this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                this.openWithOutLogic();
                this.setState(OPENING_STATE);
                break;
            case OPENING_STATE:
            case RUNNING_STATE:
        }
    }

    /**
     * 关闭操作
     * 状态为[打开]才可以执行
     */
    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithOutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
            case RUNNING_STATE:
            case STOPPING_STATE:
        }
    }

    /**
     * 运行操作
     * 状态为[关闭|停止]才可以执行
     */
    @Override
    public void run() {
        switch (this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                this.runWithOutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
            case OPENING_STATE:
        }
    }

    /**
     * 停止操作
     * 状态为[关闭|运行]才可以执行
     */
    @Override
    public void stop() {
        switch (this.state) {
            case CLOSING_STATE:
            case RUNNING_STATE:
                this.stopWithOutLogic();
                this.setState(STOPPING_STATE);
                break;
            case OPENING_STATE:
            case STOPPING_STATE:
                break;
        }
    }

    /**
     * 打开逻辑
     */
    private void openWithOutLogic() {
        System.out.println("open ...");
    }

    /**
     * 关闭逻辑
     */
    private void closeWithOutLogic() {
        System.out.println("close ...");
    }

    /**
     * 运行逻辑
     */
    private void runWithOutLogic() {
        System.out.println("run ...");
    }

    /**
     * 停止逻辑
     */
    private void stopWithOutLogic() {
        System.out.println("stop ...");
    }
}
