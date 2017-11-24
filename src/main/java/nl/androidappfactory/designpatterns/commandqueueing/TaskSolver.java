package nl.androidappfactory.designpatterns.commandqueueing;

public class TaskSolver implements Command {

	private Task task;

	public TaskSolver(Task task) {

		this.task = task;
	}

	@Override
	public void execute() {

		task.solveTheProblem();
	}

}
