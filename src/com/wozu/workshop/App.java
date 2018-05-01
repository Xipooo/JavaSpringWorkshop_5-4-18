package com.wozu.workshop;

import com.wozu.workshop.operations.Incrementer;
import com.wozu.workshop.operations.MyClass;

public class App {

	public static void main(String[] args) {
		System.out.println("This program will print Hello World 5 times.");
        Incrementer inc = new Incrementer();
        MyClass myClass = new MyClass();

        int totalWrites = 0;
        for (int i = 1; i <= 5; inc.IncrementInteger(i))
        {
        	System.out.println("Hello World!");
            
            if (++totalWrites > 5){
            	System.out.println("Too many!");
                break;
            }
        }
	}
}
