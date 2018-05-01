package com.wozu.workshop.operations;

public class Incrementer {
	public void IncrementInteger(int numToIncrement){
        numToIncrement++;
    }
    public void IncrementMyClass(MyClass myClass){
        myClass.setMyInteger(myClass.getMyInteger() + 1);
    }
}
