/*Scott Jenks
 * 2/3/23
 * Module 7 - JavaFX Research Paper
 */

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class jenks_FlowPane_GridPane extends Application {

    Scene flowPaneScene, gridPanScene;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // FlowPane Scene
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setHgap(5);
        pane.setVgap(10);

        pane.getChildren().addAll(new Label("FirstName:"), new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        Button button1 = new Button("Go to GridPane");
        button1.setOnAction(e -> primaryStage.setScene(gridPanScene));
        pane.getChildren().add(button1);
        flowPaneScene = new Scene(pane, 300, 125);

        // GridPane Scene
        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(10, 10, 10, 10));
        pane1.setHgap(5);
        pane1.setVgap(10);

        pane1.add(new Label("First Name:"), 0, 0);
        pane1.add(new TextField(), 1, 0);
        pane1.add(new Label("MI:"), 0, 1);
        pane1.add(new TextField(), 1, 1);
        pane1.add(new Label("Last Name:"), 0, 2);
        pane1.add(new TextField(), 1, 2);
        Button button2 = new Button("Add Name");
        Button button3 = new Button("Go to FlowPane");
        button3.setOnAction(e -> primaryStage.setScene(flowPaneScene));
        pane1.add(button2, 1, 3);
        pane1.add(button3, 0, 3);
        GridPane.setHalignment(button2, HPos.RIGHT);
        GridPane.setHalignment(button3, HPos.LEFT);
        gridPanScene = new Scene(pane1);

        primaryStage.setTitle("FlowPane & GridPane Example");
        primaryStage.setScene(flowPaneScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
