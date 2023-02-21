/*Scott Jenks
 * 2/21/2023
 * Module 11 - Create a program that displays a cirlcle, a rectangle or Ellispse based on radio button selected and checkbox for filling the figure
 */

import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Ellipse;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class jenks_FiguresSelection extends Application {
    // Create a circle
    protected Circle circle = new Circle(50);
    // Create a Rectangle
    protected Rectangle rectangle = new Rectangle();
    // Crate an Ellipse
    protected Ellipse ellipse = new Ellipse();

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Set Circle properties
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        // Set Rectangle properties
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);
        rectangle.setWidth(150);
        rectangle.setHeight(100);
        // Set Ellipse properties
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);
        ellipse.setRadiusX(100);
        ellipse.setRadiusY(50);

        // Create a hbox to hold buttons
        HBox paneForButtons = new HBox(5);
        paneForButtons.setAlignment(Pos.CENTER);
        RadioButton radioButtonCircle = new RadioButton("Circle");
        RadioButton radioButtonRectangle = new RadioButton("Rectangle");
        RadioButton radioButtonEllipse = new RadioButton("Ellipse");

        // Create a toggle group for shapes
        ToggleGroup group = new ToggleGroup();
        radioButtonCircle.setToggleGroup(group);
        radioButtonRectangle.setToggleGroup(group);
        radioButtonEllipse.setToggleGroup(group);

        // Create a check box
        CheckBox checkBoxFill = new CheckBox("Fill");

        // Place buttons in the hbox
        paneForButtons.getChildren().addAll(radioButtonCircle,
                radioButtonRectangle, radioButtonEllipse, checkBoxFill);

        // Create a stack pane to hold the shapes
        StackPane paneForShapes = new StackPane();
        paneForShapes.setStyle("-fx-border-color: Black");

        // Create a border pane to hold nodes
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        pane.setCenter(paneForShapes);

        // Create and register handlers
        radioButtonCircle.setOnAction(e -> {
            if (radioButtonCircle.isSelected()) {
                paneForShapes.getChildren().clear();
                paneForShapes.getChildren().add(circle);
            }
        });

        radioButtonRectangle.setOnAction(e -> {
            if (radioButtonRectangle.isSelected()) {
                paneForShapes.getChildren().clear();
                paneForShapes.getChildren().add(rectangle);
            }
        });

        radioButtonEllipse.setOnAction(e -> {
            if (radioButtonEllipse.isSelected()) {
                paneForShapes.getChildren().clear();
                paneForShapes.getChildren().add(ellipse);
            }
        });

        checkBoxFill.setOnAction(e -> {
            if (checkBoxFill.isSelected()) {
                circle.setStroke(randomColor());
                circle.setFill(randomColor());
                rectangle.setStroke(randomColor());
                rectangle.setFill(randomColor());
                ellipse.setStroke(randomColor());
                ellipse.setFill(randomColor());
            } else {
                circle.setFill(Color.WHITE);
                rectangle.setFill(Color.WHITE);
                ellipse.setFill(Color.WHITE);
            }
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 150);
        // Set the stage title
        primaryStage.setTitle("Jenks - Module 11");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }

    public Paint randomColor() {
        Random random = new Random();
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        return Color.rgb(red, green, blue);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
