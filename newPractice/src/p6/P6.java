package p6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class P6 extends Application {
	
	
	@Override
	public void start(Stage primarystage) {
		
		// create menubar
		
		MenuBar menuBar = new MenuBar();
		
		// create Menus
		
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu ("Edit");
		Menu helpMenu = new Menu("Help");
		
		// create Menuitem
		
		MenuItem newItem = new MenuItem("New");
		newItem.setOnAction( event -> System.exit(0));
		
		MenuItem openFileItem = new MenuItem("Open File");
		MenuItem exitItem = new MenuItem("EXit");
		
		
		
		//set acc. for Exit Menu
		exitItem.setAccelerator(KeyCombination.keyCombination("ctrl+x"));
		
		//when user click on the exit item, uise ann. inner class
		
		exitItem.setOnAction( event ->{
			System.exit(0);
		});
		
		
		MenuItem copyItem = new MenuItem("Copy");
		MenuItem pasteItem = new MenuItem("Paste");
		
		//Add Menu Items to the menu
		fileMenu.getItems().addAll(newItem, openFileItem, exitItem);
		editMenu.getItems().addAll(copyItem, pasteItem);
		
		//RadiomenuItem
		RadioMenuItem updateItem1 = new RadioMenuItem("Auto Update");
		RadioMenuItem updateItem2 = new RadioMenuItem("Ask for update");
		
		ToggleGroup group = new ToggleGroup();
		updateItem1.setToggleGroup(group);
		updateItem2.setToggleGroup(group);
		updateItem2.setSelected(true);
		helpMenu.getItems().addAll(updateItem1,updateItem2);
		
		//Add Menus to the Menu Bar
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
		
		BorderPane root = new BorderPane();
		
		root.setTop(menuBar);
		Scene scene = new Scene(root, 350, 200);
		
		primarystage.setTitle("JavaFX Menu");
		primarystage.setScene(scene);
		primarystage.show();
		
		
		
		
		
		
		
		
		
	}
	public static void main (String[] args) {
		
		launch(args);
	}

}
