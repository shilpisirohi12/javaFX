package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class forms extends Application{
	final Text actiontarget = new Text();

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("Forms");
		GridPane pane=new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25,25,25,25));
		
	
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		pane.add(scenetitle, 0, 0, 2, 1);

		Text userName = new Text("User Name:");
		pane.add(userName, 0, 1);

		TextField userTextField = new TextField();
		pane.add(userTextField, 1, 1);

		Text pw = new Text("Password:");
		pane.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		pane.add(pwBox, 1, 2);		
		
		Button btn= new Button("Submit");
		HBox hbbtn=new HBox(10);
		hbbtn.setAlignment(Pos.BOTTOM_CENTER);
		hbbtn.getChildren().add(btn);
		pane.add(btn, 1, 3);

	    pane.add(actiontarget, 1, 6);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
		        actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Submit button pressed");
				
			}
		});
		Scene scene=new Scene(pane,500,500);
		stage.setScene(scene);	
		stage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
