package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	
	public static void drawCircle(Robot r) {
	for (int i = 0; i < 360; i++) {
		r.setSpeed(100);
		r.turn(1);
		r.move(2);
	}
	}
	public static void main(String[] args) {
		Robot first = new Robot(600,350);
		Robot second = new Robot(700,450);
		Robot third = new Robot(800,350);
		Robot fourth = new Robot(900,450);
		Robot fifth = new Robot(1000,350);
		
		first.setSpeed(1000);
		second.setSpeed(1000);
		third.setSpeed(1000);
		fourth.setSpeed(1000);
		fifth.setSpeed(1000);
		
		first.setPenColor(Color.BLUE);
		second.setPenColor(Color.YELLOW);
		third.setPenColor(Color.BLACK);
		fourth.setPenColor(Color.GREEN);
		fifth.setPenColor(Color.RED);
		
		first.penDown();
		second.penDown();
		third.penDown();
		fourth.penDown();
		fifth.penDown();
		
		
		
		Thread t1 = new Thread(()->drawCircle(first));
		Thread t2 = new Thread(()->drawCircle(second));
		Thread t3 = new Thread(()->drawCircle(third));
		Thread t4 = new Thread(()->drawCircle(fourth));
		Thread t5 = new Thread(()->drawCircle(fifth));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
//		first.hide();
//		second.hide();
//		third.hide();
//		fourth.hide();
//		fifth.hide();
	}
}

