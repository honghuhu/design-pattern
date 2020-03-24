package io.honghu.command.improve;

public class RemoteController {

    /**
     * 按钮的命令数组
     */
    private Command[] onCommands;
    private Command[] offCommands;

    /**
     * 执行撤销的命令
     */
    private Command undoCommand;

    /**
     * 构造器，完成对按钮初始化
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给我们的按钮设置你需要的命令
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按开按钮
     */
    public void onButtonWasPushed(int no) {
        // 找到你按下的开的按钮， 并调用对应方法
        onCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按关按钮
     */
    public void offButtonWasPushed(int no) {
        // 找到你按下的关的按钮， 并调用对应方法
        offCommands[no].execute();
        // 记录这次的操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}