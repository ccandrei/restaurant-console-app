package dev;

import dev.dao.PlatDaoFichier;
import dev.dao.PlatDaoMemoire;
import dev.ihm.Menu;
import dev.service.PlatServiceVersion1;
import dev.service.PlatServiceVersion2;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String[] args) {

		

		// Cr�ation du contexte Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		// r�cup�ration du bean Menu
		Menu menu = context.getBean(Menu.class);
		menu.afficher();
		// fermeture du Scanner
		context.getBean(Scanner.class).close();
		// fermeture du contexte Spring
		context.close();

	}
}
