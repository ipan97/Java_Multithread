package com.github.ipan97.java.multithreading.extending;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
* @author Ipan Taupik Rahman
*/
public class Application extends Thread{
	private static Logger log = LoggerFactory.getLogger(Application.class);
	
	public void run(){
		log.info("My thread this running state...");
	}
	public static void main(String[] args) {
		log.info("Starting project");
		Application app = new Application();
		app.start();
	}
}
