
package UI.javaFx_prictice;
/*
In JavaFX, the Group class is a container that is used to group multiple JavaFX nodes together. It is a part of the JavaFX scene graph and serves as a container for other JavaFX nodes, such as shapes, text, images, and other UI elements. The Group class allows you to treat multiple nodes as a single unit, making it easier to manipulate and manage them as a group.

Here are some key characteristics and uses of the Group class in JavaFX:

Grouping Nodes: You can add multiple nodes (e.g., shapes, text, images) to a Group using the getChildren() method. This way, you can create complex scenes by combining multiple visual elements into a single group.

Transformation: You can apply transformations to a Group, which will affect all of its child nodes. This can be useful for tasks like scaling, rotating, or translating a group of nodes as a whole.

Event Handling: Events can be handled at the Group level, which will then propagate to its child nodes. This allows you to define common event handlers for a group of nodes.

Clipping: You can apply clipping to a Group to restrict the visible area of its child nodes.

Here's a simple example of how to create a Group and add nodes to it in JavaFX:

 */
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class group1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a Group
        Group root = new Group();

        // Create some Circle nodes
        Circle circle1 = new Circle(50, 50, 30);
        Circle circle4 = new Circle(100,100, 60,Color.ALICEBLUE);
        Circle circle2 = new Circle(150, 150, 90);
        Circle circle3 = new Circle(200,200,120);

        // Set the fill color for the circles
        circle1.setFill(Color.RED);
        circle2.setFill(Color.BLUE);
        circle3.setFill(Color.ORANGE);
        circle4.setFill(Color.YELLOW);

        // Add the circles to the Group
        root.getChildren().addAll(circle1, circle4,circle2,circle3);

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);

        // Set the stage title and show it
        primaryStage.setTitle("JavaFX Group Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}