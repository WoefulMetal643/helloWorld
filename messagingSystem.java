package application;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.RadioButton;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

public class messagingSystem extends Application{
	Stage window;
	Scene scene;
	String who="doctor";
	
	@Override
	public void start(Stage primaryStage) {
		window=primaryStage;
		window.setTitle("Doctor View");
		
		//Text
		Text welcome1 = new Text("Phoenix Pediatric Office");
		Text welcome2 = new Text("\tWelcome");
		Text inbox = new Text("Inbox");
		Text select = new Text("Selected Message");
		
		//TextArea
		TextArea textArea1 = new TextArea();
		textArea1.setPrefHeight(300);
		textArea1.setPrefWidth(240);
		
		TextArea textArea2 = new TextArea();
		textArea2.setPrefHeight(300);
		textArea2.setPrefWidth(240);
		
		//button
		Button urgent = new Button("Urgent Call");
		Button newMessage = new Button("New Message");
		Button reply = new Button("Reply");
		Button view = new Button(who +" view");

		
		GridPane grid =new GridPane();
		grid.setAlignment(Pos.BASELINE_LEFT);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.setPadding(new Insets(10,10,10,10));
		
		grid.add(welcome1, 20, 0,2,1);
		grid.add(welcome2, 20, 1,2,1);
		grid.add(inbox, 5, 2,2,1);
		grid.add(select, 25, 2,2,1);
		grid.add(textArea1, 2, 4,15,1);
		grid.add(textArea2, 25, 4,10,1);
		
		grid.add(urgent, 25, 6,10,1);
		grid.add(newMessage, 2, 6,10,1);
		grid.add(reply, 30, 6,10,1);
		grid.add(view, 30, 12,10,1);
		
		scene=new Scene(grid,600,600);
		window.setScene(scene);
		window.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
