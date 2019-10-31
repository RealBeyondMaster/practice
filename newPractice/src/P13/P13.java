package P13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Random;

public class P13  extends Application

{
	
	@Override
	public void start (Stage primarystage)
	

	
	
	{
		
		
		
		ArrayList<String> liste = new ArrayList<>();
		
		liste.add("Kino");
		liste.add("Restaurant");
		liste.add("Schwimmbad");
		 

		
		Button btn2 = new Button("Save");
		
		
		
		
		TextField input = new TextField();

		
		
		input.setPromptText("Bitte Destination eingeben:");
		
		btn2.setOnAction(e->{
		
			//input.setText("");
		
			if (input.getText().equals("Fehler: Angaben gibt es bereits oder Input leer"))
				input.setText("");
			
			String neu = input.getText();
		
		
		
		
		if (neu.isEmpty()) {
			return;
		}
		else {
		
			
			if( liste.contains(neu))
			{ input.setText("Fehler: Angaben gibt es bereits oder Input leer");
			}
			
			else {liste.add(neu);
			input.setText("");	}}});
			
	/*	for ( String i: liste)
		{
			if(i.equals(neu) ) {  
				input.setText("Fehler: Angaben gibt es bereits oder Input leer");
				break;
						
				
			}
			
				
				
					}
		}
		liste.add(neu);
		input.setText("");	
		}
		
		
		
			
		);
		*/


		
		HBox gbox = new HBox();
		gbox.setAlignment(Pos.CENTER);
		Label label1 = new Label ("Experiment");
		
		Button btn1 = new Button("Klick mich, wohin gehts?");
		btn1.setStyle("-fx-font-size: 10pt;");
		
		btn1.setOnAction ( event -> {
	
			btn1.setText(randomNumber(liste));
			
		});
		
		gbox.getChildren().addAll(input, btn2, label1, btn1);
		
		
		Scene szene1 = new Scene(gbox, 500,550);
		
		primarystage.setTitle("EXP");
		primarystage.setScene(szene1);
		primarystage.show();
		
		
		
		
}
	public String randomNumber(ArrayList<String> array) {
		
		int idx = new Random().nextInt(array.size());
		String random = array.get(idx);
		
		return random;
	}
	
	
	
	public static void main (String[] args)
	{
		launch(args);
	}
	

}