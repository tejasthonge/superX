package UI;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{

   public static void main(String[] args){
      launch(args);
   }

   public void start(Stage primaryStage) throws Exception{
      Group root =new Group();
      Scene scene = new Scene(root,600,600,Color.SKYBLUE);
      Stage stage = new Stage();


      //Text:
      Text text = new Text();
      text.setText("BOSS__");
      text.setX(100);
      text.setY(100);
      text.setFont(Font.font("Verdana" ,100));
      text.setFill(Color.DARKBLUE);

      root.getChildren().add(text);




      //Line
      Line line= new Line();
      line.setStartX(110);
      line.setStartY(150);
      line.setEndX(500);
      line.setEndY(150);
      line.setStrokeWidth(10);
      line.setStroke(Color.RED);
      line.setOpacity(0.9);
      line.setRotate(180);

      root.getChildren().add(line);



    //Reactangele:
    Rectangle rectangle = new  Rectangle();
    rectangle.setX(40);
    rectangle.setY(5);
    rectangle.setHeight(200);
    rectangle.setWidth(500);
   //  rectangle.setOpacity(0.3);
    rectangle.setFill(null);
    rectangle.setStrokeWidth(5);
    rectangle.setStroke(Color.DARKCYAN);

    root.getChildren().add(rectangle);

    //Tringle
   Polygon triangle = new Polygon();
   triangle.getPoints().setAll(500.0,);

      

      stage.setScene(scene);
      stage.show();
   }

   
}
