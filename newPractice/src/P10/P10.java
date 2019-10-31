package P10;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class P10 extends Application {

	
	public void start (Stage primaryStage) {
		
		GridPane pane = new GridPane();
		Label label1 = new Label("Name");
		Label label2 = new Label("Passwort");
		
		TextField txt1 = new TextField();
		TextField txt2 = new PasswordField();
		
		pane.setPadding(new Insets(7,7,7,7));
		pane.setHgap(10);
		pane.setVgap(10);
		
		txt1.setPromptText("Hier bitte Namen Eintragen");
		txt2.setPromptText("Hier bitte Passwort Eintragen");
		
		GridPane.setConstraints(label1, 0,	0 );
		GridPane.setConstraints(label2, 1,0 );
		GridPane.setConstraints(txt1, 0,1 );
		GridPane.setConstraints(txt2, 1,1 );
		
		Button btn1 = new Button("Submit");
		GridPane.setConstraints(btn1, 1,2 );
		
		btn1.setOnAction( event ->{
			System.out.println("Name is" + txt1.getText().toString());
			System.out.println ( "Password is" + txt2.getText().toString());
			
			
		}); 
		pane.getChildren().addAll(label1, label2, txt2, txt1, btn1);
		
		Scene scene = new Scene(pane , 300 , 350);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	public static void main (String[] args) {
		
		launch(args);
	}
	
	
}
