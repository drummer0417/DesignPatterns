package nl.androidappfactory.designpatterns.proxy;

import java.util.concurrent.TimeUnit;

/**
 * 
 * ProxyPatternDemo
 * 
 * 
 */
public class App {

	public static void main(String[] args) {

		Image image = new ProxyImage("picture.jpg");

		System.out.println("before image.display(), File is not yet loaded: ");

		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		image.display();
	}

}
