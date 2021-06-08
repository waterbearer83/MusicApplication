package Application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {


	///Maybe we can grow this to be more dynamic....
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Artists", 
			"Display Albums",
			"Display Tracks",
			"Add New Artist",
			"Add New Album",
			"Add New Track",
			"Update Artist",
			"Update Album",
			"Update Track",
			"Delete Artists",
			"Delete Albums",
			"Delete Tracks"
			);
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			if (selection.equals("1")) {
//					displayArtists();
			} else if (selection.equals("2")) {
//					displayAlbums();
			} else if (selection.equals("3")) {
//					displayTracks();	
			} else if (selection.equals("4")) {
//					addArtists();
			} else if (selection.equals("5")) {
//					addAlbums();
			} else if (selection.equals("6")) {
//					addTracks();
			} else if (selection.equals("7")) {
//					deleteArtists();
			} else if (selection.equals("8")) {
//					deleteAlbums();
			} else if (selection.equals("9")) {
//					deleteTracks();
			}
//			
// Will want to add a CATCH at the end for a SQL Exeception.
				
			System.out.println("Please press enter to continue...");
			scanner.nextLine();
		} while (!selection.equals("-1"));
	}
	
	private void printMenu() {
		System.out.println("Select an Option:\n-----------------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i + 1 + ") " + options.get(i));
		}
	
	}
	
}
