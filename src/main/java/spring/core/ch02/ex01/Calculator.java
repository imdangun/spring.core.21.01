package spring.core.ch02.ex01;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	private void calc() {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		calc();
		long end = System.currentTimeMillis();
		
		System.out.println("경과 시간: " + (end - start));
	}
}
