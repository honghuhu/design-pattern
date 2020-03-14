package io.honghu.state;

public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.openWithOutLogic();
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.openWithOutLogic();
                this.setState(OPENING_STATE);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                this.closeWithOutLogic();
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.runWithOutLogic();
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                this.runWithOutLogic();
                this.setState(RUNNING_STATE);
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                this.stopWithOutLogic();
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                this.stopWithOutLogic();
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }

    private void openWithOutLogic() {
        System.out.println("open ...");
    }

    private void closeWithOutLogic() {
        System.out.println("close ...");
    }

    private void runWithOutLogic() {
        System.out.println("run ...");
    }

    private void stopWithOutLogic() {
        System.out.println("stop ...");
    }
}
