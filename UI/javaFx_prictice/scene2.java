package UI.javaFx_prictice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class scene2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a root node (a StackPane in this case)
        StackPane root = new StackPane();

        // Create a Scene with the root node
        Scene scene = new Scene(root, 300, 300);

        // Create a button and add it to the root node
        Button button = new Button("Click Me!");
        root.getChildren().add(button);
        // button.setCancelButton(true);


        // Set the Scene on the Stage
        primaryStage.setScene(scene);

        // Set the stage title and show it
        primaryStage.setTitle("JavaFX Scene Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}