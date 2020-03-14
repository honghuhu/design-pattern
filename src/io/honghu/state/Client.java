package io.honghu.state;

public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.open();
        lift.setState(ILift.STOPPING_STATE);
        lift.close();
        lift.run();
        lift.stop();
    }
}
