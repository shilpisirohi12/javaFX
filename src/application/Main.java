package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			// Creating and Setting the properties to a Text
			Text txt=new Text();
			txt.setFont(new Font(30));
			
			txt.setX(350);
			txt.setY(150);
			txt.setText("Welcome Page");
			
		  // Creating and Setting the properties to a line 
			Line line=new Line();
			line.setStartX(60);
			line.setStartY(40);
			line.setEndX(500);
			line.setEndY(40);
			
			//creating complex objects
			Path path =new Path();
			MoveTo movTo=new MoveTo(100,71);
			
			LineTo  mv1=new LineTo(321, 161);
			LineTo  mv2=new LineTo(126,232);
			LineTo  mv3=new LineTo(232,52);
			LineTo  mv4=new LineTo(269, 250);
			LineTo  mv5=new LineTo(100,71);
			
			path.getElements().add(movTo);
			path.getElements().addAll(mv1,mv2,mv3,mv4,mv5);
			
			Group group=new Group();
			//Group group1=new Group(path);
			ObservableList list=group.getChildren();
			list.add(txt);
			list.add(line);
			list.add(path);
			
			Scene scene = new Scene(group,600,300);
			//Scene scene = new Scene(group1,600,300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//scene.setFill(Color.AQUA);
			primaryStage.setTitle("Welcome!!!");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
