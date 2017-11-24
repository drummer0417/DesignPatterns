package nl.androidappfactory.designpatterns.commandqueueing;

public class Task {

	private int id;

	public Task(int id) {

		this.id = id;

	}

	public void solveTheProblem() {
		System.out.println("Solving problem with id: " + id);
	}
}
