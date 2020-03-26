package io.honghu.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Visit Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visit Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visit Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visit Monitor.");
    }
}
