package UI.javaFx_prictice;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class stacPane3 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a StackPane
        StackPane stackPane = new StackPane();

        // Create three buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        
      //   button1.setAlignment(10);

        // Add buttons to the StackPane
        stackPane.getChildren().addAll(button1, button2, button3);

        // Create a Scene with the StackPane
        Scene scene = new Scene(stackPane, 300, 200);

        // Set the Scene on the Stage
        primaryStage.setScene(scene);

        // Set the stage title and show it
        primaryStage.setTitle("StackPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}