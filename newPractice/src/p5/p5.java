package p5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

	public class p5 extends Application{
		
		Stage fenster;
		Scene szene1, szene2;
		Button btn1, btn2;
		Label label1, label2;
		
		@Override
		public void start (Stage primarystage) {
		
			try {
				
				
				fenster = primarystage;
				label1 = new Label("Erste Szene");
				btn1 = new Button (" Wechsel zur zweiten Szene");
				
		
		
				
				btn1.setOnAction ( event ->{
					fenster.setScene(szene2);
					fenster.show();
					
				});
				
				
				VBox layout1 = new VBox (30);
				layout1.getChildren().addAll(label1, btn1);
				szene1 = new Scene(layout1, 250,250);
				
				
				
				label2 = new Label("ZweiteSzene");
				btn2 = new Button (" Wechsel zur ersten Szene");
				btn2.setOnAction ( event ->{
					fenster.setScene(szene1);
					fenster.show();
					
				});
				
				VBox layout2 = new VBox (30);
				layout2.getChildren().addAll(label2, btn2);
				szene2 = new Scene(layout2, 250,250);
				
				

				
				
				primarystage.setScene(szene1);
				primarystage.show();
			
				
			}
			
			
			catch(Exception e) { 
			e.printStackTrace();
			
		
	}

}
	public static void main (String[] args) {
		
		launch(args);
	}
	}
	
