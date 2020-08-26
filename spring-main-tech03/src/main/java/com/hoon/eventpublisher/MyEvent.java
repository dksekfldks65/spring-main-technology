package com.hoon.eventpublisher;

public class MyEvent {

    private int data;

    private Object source;

    public MyEvent(Object source, int data){
        this.source = source;
        this.data = data;
    }

    public Object getSource(){
        return source;
    }

    public int getData(){
        return data;
    }

}
