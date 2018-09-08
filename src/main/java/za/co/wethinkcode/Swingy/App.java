package za.co.wethinkcode.Swingy;

import za.co.wethinkcode.Swingy.Views.SquareMap;
import za.co.wethinkcode.Swingy.Views.Console.Console;
import za.co.wethinkcode.Swingy.Views.Gui.Gui;
import za.co.wethinkcode.Swingy.Views.Gui.Window;

public class App {
	
    	public static void main(String[] args) {
    		
    		try {
                switch (args[0]) {
                    case "console":
                        Console.run();
                        break;
                    case "gui":
                        Gui.run();
                        break;
                    default:
                    	System.out.print("Usage: java -jar target/swingy [console/gui]");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
            	System.out.print("Usage: java -jar target/swingy console/gui");
            }
    	}
    }

