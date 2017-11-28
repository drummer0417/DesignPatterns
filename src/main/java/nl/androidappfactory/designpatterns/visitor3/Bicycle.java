package nl.androidappfactory.designpatterns.visitor3;

public class Bicycle implements Visitable {

	private int weight;

	public Bicycle(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public double accept(Visitor visitor) {

		return visitor.visit(this);
	}

}
