package io.honghu.observer;

import java.util.Vector;

abstract class Subject {
    private final Vector<Observer> obs = new Vector<>();

    public void addObserver(Observer obs){
        this.obs.add(obs);
    }
    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }
    protected void notifyObserver(){
        for(Observer o: obs){
            o.update();
        }
    }
    public abstract void doSomething();
}

class ConcreteSubject extends Subject {
    @Override
    public void doSomething(){
        System.out.println("被观察者事件发生改变");
        this.notifyObserver();
    }
}