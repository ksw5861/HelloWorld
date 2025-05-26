package com.yedam.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class StackQueExe {
	public static void main(String[] args) {
		
		// First In First Out 구조.
		Queue<String> orders = new LinkedList<String>();
		orders.offer("카페라떼");
		orders.offer("아메리카노");
		orders.offer("녹차");
		
		while(!orders.isEmpty()) {
			System.out.println(orders.poll());
		}
		
		Stack<String> books = new Stack<String>();
		// Last In First Out 구조.
		books.push("이것이자바다");
		books.push("HTML,CSS");
		books.push("자바스크립트기초");
		
		while(!books.isEmpty()) {
			System.out.println(books.pop());
		}
	} // end of main.
} // end of class.
