package nl.androidappfactory.designpatterns.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/*
 * 
 * This is the Invoker
 *
 * 
 */
public class Switcher {

	List<Command> commands;

	public Switcher() {
		commands = new ArrayList<>();
	}

	public void addCommand(Command command) {

		this.commands.add(command);
	}

	public void executeCommands() {

		for (Command command : commands) {

			command.execute();
			try {

				TimeUnit.SECONDS.sleep(1);

			} catch (InterruptedException e) {
				// ignore
			}
		}
		commands.clear();
	}
}
