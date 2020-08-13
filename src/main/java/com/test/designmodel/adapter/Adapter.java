package com.test.designmodel.adapter;

public class Adapter extends TargetClass {

//    @Override
//    public void request() {
//
//    }
    /**
     * 建立一个私有的Adaptee对象
     * */
    private Adaptee adaptee=new Adaptee();

    @Override
    public void request() {
        adaptee.SpecificRequest();
    }
}
