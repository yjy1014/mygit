package com.kh.git;

import com.kh.foo.Foo;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world~");
		System.out.println("Hello git~");
		System.out.println("Good luck~");
		
		new Foo().sayFoo();
		new Foo().sayFoo(); // #sayFoo 에서 추가
	}

}
