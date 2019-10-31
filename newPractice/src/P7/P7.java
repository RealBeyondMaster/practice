package P7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Random;

public class P7  extends Application

{
	
	@Override
	public void start (Stage primarystage)
	
	{
		
		
		String[] antworten = {"Kino", "Restaurant", "Schwimmbad" }; 
		
		

		
		GridPane gbox = new GridPane();
		gbox.setAlignment(Pos.CENTER);
		Label label1 = new Label ("Experiment");
		
		Button btn1 = new Button("Klick mich, wohin gehts?");
		btn1.setStyle("-fx-font-size: 30pt;");
		
		btn1.setOnAction ( event -> {
	
			btn1.setText(randomNumber(antworten));
			
		});
		
		gbox.getChildren().addAll(label1, btn1);
		
		
		Scene szene1 = new Scene(gbox, 500,150);
		
		primarystage.setTitle("EXP");
		primarystage.setScene(szene1);
		primarystage.show();
		
		
		
		
}
	public String randomNumber(String[] array) {
		
		int idx = new Random().nextInt(array.length);
		String random = array[idx];
		
		return random;
	}
	
	
	
	public static void main (String[] args)
	{
		launch(args);
	}
	

}