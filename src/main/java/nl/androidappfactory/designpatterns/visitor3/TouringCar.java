package nl.androidappfactory.designpatterns.visitor3;

public class TouringCar implements Visitable {

	private int weight;

	public TouringCar(int weight) {
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
