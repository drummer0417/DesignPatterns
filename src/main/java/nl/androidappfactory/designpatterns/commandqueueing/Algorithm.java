package nl.androidappfactory.designpatterns.commandqueueing;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Algorithm {

	private BlockingQueue<Command> commandList;

	public Algorithm() {

		commandList = new ArrayBlockingQueue<>(10);

	}

	public void produce() {

		// simulate adding new tasks every second
		for (int i = 1; i < 11; i++) {
			try {

				commandList.put(new TaskSolver(new Task(i)));
				System.out.println("adding taske: " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void consume() {

		// execute tasks in queue
		for (int i = 0; i < 10; i++) {

			try {

				TimeUnit.SECONDS.sleep(1);
				commandList.take().execute();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("consume() done: ");
	}
}
