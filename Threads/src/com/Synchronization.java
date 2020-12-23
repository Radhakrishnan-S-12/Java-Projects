package com;

public class Synchronization {

	private int count;

	public synchronized void increasingCount() {
		setCount(getCount() + 1);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
