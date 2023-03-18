package application;

import java.net.URL;
import java.time.Duration;
import java.util.ResourceBundle;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class controller implements Initializable{

	@FXML
	private ImageView myImage;
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//translate
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myImage);
		translate.setDuration(javafx.util.Duration.millis(5000));
		translate.setCycleCount(2);
		translate.setAutoReverse(true);
		translate.setByX(300);
		
		RotateTransition rotation = new RotateTransition();
		rotation.setNode(myImage);
		rotation.setAutoReverse(true);
		rotation.setByAngle(360);
		rotation.setCycleCount(3);
		rotation.setDuration(javafx.util.Duration.millis(2000));
		
//		ParallelTransition paralel = new ParallelTransition(myImage, translate , rotation);
//		paralel.play();
		
		SequentialTransition sequential = new SequentialTransition(myImage , translate , rotation);
		sequential.setCycleCount(2);
		sequential.play();
		
	}

	
}
