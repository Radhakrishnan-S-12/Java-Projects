package com.producerandconsumer;

public class ProducerAndConsumer {

	Integer count;
	boolean valueSet = false;

	public synchronized void put(int count) throws Exception {
		while (valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
			;
		}
		this.count = count;
		System.out.println("Put: " + count);
		valueSet = true;
		notify();

	}

	public synchronized void get() throws Exception {
		while (!valueSet) {
			try {
				wait();
			} catch (Exception e) {
			}
			;
		}
		System.out.println("Get: " + count);
		valueSet = false;
		notify();

	}

}
