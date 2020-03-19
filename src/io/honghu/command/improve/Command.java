package io.honghu.command.improve;

/**
 * 创建命令接口
 */
public interface Command {

    /**
     * 执行动作
     */
    void execute();

    /**
     * 撤销动作
     */
    void undo();
}
