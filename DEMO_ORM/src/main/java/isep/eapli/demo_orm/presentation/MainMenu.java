/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isep.eapli.demo_orm.presentation;

import isep.eapli.demo_orm.domain.car.CarUI;
import isep.eapli.demo_orm.domain.cargroup.CarGroupUI;
import isep.eapli.demo_orm.util.Console;

/**
 *
 * @author mcn
 */
public class MainMenu {
	public static void mainLoop() {
		CarGroupUI carGroupUI = new CarGroupUI();
		CarUI carUI = new CarUI();
		int option = 0;
		do {
			option = menu();

			switch (option) {
				case 0:
					System.out.println("exiting ...");
					break;
				case 1:
					carGroupUI.registerCG();
					break;
				case 2:
					carGroupUI.listGAs();
					break;
				case 3:
					carGroupUI.searchGAPorID();
					break;
				case 4:
					carUI.registerCar();
					break;
				case 5:
					carUI.listCars();
					break;
				case 6:
					carUI.searchCar();
					break;
				default:
					System.out.println("unrecognized option.");
					break;
			}
		} while (option != 0);

	}

	private static int menu() {
		int option = -1;
		System.out.println("");
		System.out.println("=============================");
		System.out.println(" Rent a Car ");
		System.out.println("=============================\n");
		System.out.println("1. Register Car Group");
		System.out.println("2. List all Car Groups");
		System.out.println("3. Search Car Group");
		System.out.println("4. Register Car");
		System.out.println("5. List all Cars");
		System.out.println("6. Search for a Car");

		System.out.println("=============================");
		System.out.println("0. Exit\n\n");
		option = Console.readInteger("Please choose an option");
		return option;
	}
}