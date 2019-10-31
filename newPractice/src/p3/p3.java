package p3;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class p3 extends Application {

	public void start(Stage primaryStage) {
		Label l1 = new Label("Hallo");
		Label l2 = new Label("Welt");
		VBox root = new VBox();
		root.getChildren().add(l1);
		root.getChildren().add(l2);

		Scene scene = new Scene(root, 240, 40);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Hello World");
		primaryStage.show();
		root.getChildren().add(createButton());
		root.getChildren().add(createLambda());

	}
	
	
	
	
	
	
	
	
	private Node createLambda() {
		// TODO Auto-generated method stub
		
		final Button btn = new Button();
		btn.setText("add your mom to the whole thing");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7,7,7,7));
		pane.getChildren().add(btn);
		// ActionHandler registrieren
		btn.setOnAction(event -> pane.getChildren().add(new Label ("lamba label")));
		
		
		
		return pane;
	}








	Pane createButton() {
		// TODO Auto-generated method stub
		final Button btn = new Button();
		btn.setText("add your mom to the whole thing");
		final FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(7,7,7,7));
		pane.getChildren().add(btn);
		// ActionHandler registrieren
		btn.setOnAction(new EventHandler<ActionEvent>()
			{
				
			@Override
			public void handle(ActionEvent event)
			{
				pane.getChildren().add(new Label("Hello Pane new"));
			}
			
			
			});
		
		
		return pane;
	}




	public static void main(String[] args) {
		launch(args);
	}



	
	

}
