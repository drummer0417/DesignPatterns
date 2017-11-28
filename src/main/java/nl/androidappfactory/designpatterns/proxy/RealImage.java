package nl.androidappfactory.designpatterns.proxy;

public class RealImage implements Image {

	private String filename;

	public RealImage(String filename) {

		this.filename = filename;
		loadFromDisk(filename);
	}

	public void loadFromDisk(String filename) {

		System.out.println("Loading file from disk: " + filename);
	}

	@Override
	public void display() {

		System.out.println("Display file: " + filename);
	}

}
