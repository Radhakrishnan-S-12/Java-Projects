package com.producerandconsumer;

public class Producer implements Runnable {

	ProducerAndConsumer pc = new ProducerAndConsumer();

	public Producer(ProducerAndConsumer pc) {
		this.pc = pc;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {

		Integer i = 0;
		while (true) {
			try {
				pc.put(i++);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
