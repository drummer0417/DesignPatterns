package nl.androidappfactory.designpatterns.proxy;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String filename;

	public ProxyImage(String filename) {

		this.filename = filename;
		System.out.println("\nproxyImage created. file not yet loaded: ");
	}

	@Override
	public void display() {
		if (realImage == null) {

			realImage = new RealImage(filename);
		}
		realImage.display();
	}

}
