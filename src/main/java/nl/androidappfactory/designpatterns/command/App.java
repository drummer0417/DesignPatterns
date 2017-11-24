package nl.androidappfactory.designpatterns.command;

/*
 * 
 * This is the Invoker
 *
 * 
 */
public class App {

	public static void main(String[] args) {

		Switcher switcher = new Switcher();
		Light light = new Light();

		switcher.addCommand(new TurnOnCommand(light));
		switcher.executeCommands();

		System.out.println("The light is : " + light.getStatus());

		//
		switcher.addCommand(new TurnOffCommand(light));
		switcher.executeCommands();

		System.out.println("The light is : " + light.getStatus());

		//
		switcher.addCommand(new TurnOnCommand(light));
		switcher.addCommand(new TurnOffCommand(light));
		switcher.executeCommands();

		System.out.println("The light is : " + light.getStatus());

		//
		System.out.println("done: ");
	}

}
