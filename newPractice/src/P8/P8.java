package P8;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class P8 extends Application

{
	
	public void start(Stage primarystage) {
		
		
		Label label1 = new Label();
		Slider slider = new Slider(1,15,50);
		slider.setShowTickMarks(false);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(1);
		
		VBox layout = new VBox (10, label1, slider);
		label1.textProperty().bind(Bindings.format("%.2f", slider.valueProperty()));
		
		primarystage.setScene(new Scene(layout, 300,100));
		primarystage.setTitle("Slider");
		primarystage.show();
		
		
		
	}
	
	public static void main (String[] args) {
		
		launch(args);
	}

}
