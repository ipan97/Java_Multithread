package com.github.ipan97.java.multithreading.extending;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Count extends Thread {
	private static Logger log = LoggerFactory.getLogger(Count.class);

	public Count() {
		log.info("my extending thread");
		log.info("my thread creating " + this);
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Printing the count " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			log.error(e.getMessage());
		}
		log.info("My Thread run is over");
	}

	public static void main(String[] args) {
		Count count = new Count();
		try {
			while (count.isAlive()) {
				log.info("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			log.error("in Thread interrupt "+e.getMessage());
		}
		log.info("Main Tharead's run is over");
	}
}
