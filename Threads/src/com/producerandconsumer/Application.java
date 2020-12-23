package com.producerandconsumer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProducerAndConsumer pc = new ProducerAndConsumer();
		new Producer(pc);
		new Consumer(pc);

	}

}
