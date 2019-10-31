package p4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;


	
	public class p4 extends Application {
	
	public void start(Stage primaryStage)
	{
		BorderPane borderpane = new BorderPane();
		borderpane.setPadding(new Insets(20,20,20,20));
		borderpane.setTop(createToolbarpane());
		borderpane.setCenter(crateInputPane());
		borderpane.setLeft(createNavigationPane());
		
		primaryStage.setTitle(p4.class.getSimpleName());
		primaryStage.setScene(new Scene(borderpane, 350,250));
		primaryStage.setTitle("my Try!");
		primaryStage.show();
		
		
		
	}

	private Pane createNavigationPane() {

		final VBox vbox = new VBox(10);
		vbox.setStyle("-fx-border-width: 2;-fx-border-color: red;");
		vbox.getChildren().addAll(new Text("LEFT"), new Button("VBox1"), new Button("VBox2"));
		
		return vbox;
	}

	private Pane crateInputPane() {
		
		final GridPane gridPane = new GridPane();
		gridPane.setBorder(
				new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
		gridPane.setPadding(new Insets(7, 7, 7, 7));
		gridPane.setGridLinesVisible(true);
		gridPane.setHgap(5);
		gridPane.setVgap(10);

		final Label label1 = new Label("Label1");
		final TextField textfield1 = new TextField();
		final Label label2 = new Label("Label2");
		final TextField textfield2 = new TextField();
		final Button button = new Button("Button");
		
		
		gridPane.add(label1, 0, 0);
		gridPane.add(textfield1, 1, 0);
		gridPane.add(label2, 0, 1);
		gridPane.add(textfield2, 1, 1);
		gridPane.add(button, 1, 2);
		return gridPane;


		

	}

	private Pane createToolbarpane() {
		
		final HBox hbox = new HBox(6);
		hbox.setStyle("-fx-border-width: 2;-fx-border-color: red;");
		hbox.getChildren().addAll(new Text("TOP"), new Text("TOP2"),new Button("HBox1"), new Button("HBox2"));
		return hbox;
	}
		
	
	
		
	

	public static void main(String[] args) {
		launch(args);
	}
	
	}
