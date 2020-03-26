package io.honghu.visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
