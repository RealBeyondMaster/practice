package P12;

import java.util.Random;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P12 extends Application {
	
	public void start (Stage stage) {
		
		EventHandler<MouseEvent> eventHandler = getEventHandler();
		

		
		//draw a circle
		Circle circle = new Circle (300,124,25,Color.BROWN);
		circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		TextField field = new TextField();
		field.setPromptText("first click");
		//field.setText(randomColor.toString());
		field.setText(circle.getFill().toString() );
		
		//cricle 2
		Circle circle2 = new Circle (450,124,25,Color.BROWN);
		circle2.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		Circle circle3 = new Circle (150,124,25,Color.BROWN);
		circle3.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		Text text = new Text( 150,50, "Click on circle to change color");
		text.setFont(Font.font(null, FontWeight.BOLD,15));
		text.setFill(Color.CRIMSON);
		
		
		Group root = new Group(circle, circle2, circle3, text, field);
		Scene scene = new Scene(root, 600,300);
		
		scene.setFill(Color.LAVENDER);
		
		stage.setTitle("New Day New Try");
		stage.setScene(scene);
		stage.show();
		
		
		
		
		
		
		
	}

	public EventHandler<MouseEvent> getEventHandler() {
		// TODO Auto-generated method stub
		return new EventHandler<MouseEvent>() {
			public void handle (MouseEvent event)
			{
				Random rand = new Random();
				double r = rand.nextDouble();
				double g = rand.nextDouble();
				double b = rand.nextDouble();
				Color randomColor = new Color(r,g,b,1);
				System.out.println("Color is:" + randomColor.toString());
				if (event.getSource() instanceof Circle) {
					Circle c = (Circle) event.getSource();
					c.setFill(randomColor);
	
				}
				
				
			}
		};
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}
