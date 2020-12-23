package com;

public class ThreadsBasics extends Synchronization {

	public static void main(String[] args) throws InterruptedException {

		Synchronization synchronization = new Synchronization();

		Thread t1 = new Thread(() -> {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hi");
					synchronization.increasingCount();
					Thread.sleep(500);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}, "Nool-1");

		Thread t2 = new Thread(() -> {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println("This is Radhakrishnan S");
					synchronization.increasingCount();
					Thread.sleep(500);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}, "Nool-2");

		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		Thread.sleep(10);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.join();
		t2.join();

		System.out.print("Is " + t1.getName() + " alive: ");
		System.out.println(t1.isAlive());

		System.out.print("Is " + t2.getName() + " alive: ");
		System.out.println(t2.isAlive());

		System.out.println("Priority of thread 1: " + t1.getPriority());
		System.out.println("Priority of thread 2: " + t2.getPriority());

		System.out.println("Total count number is: " + synchronization.getCount());
	}

}
