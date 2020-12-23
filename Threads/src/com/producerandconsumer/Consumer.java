package com.producerandconsumer;

public class Consumer implements Runnable {

	ProducerAndConsumer pc = new ProducerAndConsumer();

	public Consumer(ProducerAndConsumer pc) {
		this.pc = pc;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	public void run() {

		while (true) {
			try {
				pc.get();
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
