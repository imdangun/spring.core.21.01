package spring.core.ch01.ex02;

import spring.core.ch01.ex01.Gun;

@Setter
public class Shooter {
	private String name;
	private Gun gun;
	
	public void fire() {
		System.out.println(name + ": ");
		gun.fire();
	}
}
