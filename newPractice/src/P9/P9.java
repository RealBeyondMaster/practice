package P9;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class P9 extends Application

{
	
	public void start(Stage primarystage) {
		
		

		Slider slider = new Slider(1,100,50);
		slider.setShowTickMarks(false);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(1);
		TextField text = new TextField();
		text.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());
		VBox layout = new VBox (10, text, slider);

		
		primarystage.setScene(new Scene(layout, 300,100));
		primarystage.setTitle("Slider");
		primarystage.show();
		
		
		
	}
	
	public static void main (String[] args) {
		
		launch(args);
	}

}
