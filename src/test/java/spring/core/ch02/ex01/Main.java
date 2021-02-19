package spring.core.ch02.ex01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Rabbit rabbit = new Rabbit();
		
		calculator.start();
		rabbit.start();
	}
}
/*
경과 시간: 102
경과 시간: 188
*/