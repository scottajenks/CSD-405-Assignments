/*Scott Jenks
 * 2/15/2023
 * Module 10 - Select 4 random cards using JavaFX and refresh button
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;

public class jenks_cardAssignmentButton extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a Boarder pane
        BorderPane bPane = new BorderPane();
        bPane.setPadding(new Insets(5, 5, 5, 5));

        // Create a HBox pane
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(10, 10, 10, 10));
        getCards(hBox);

        // Create Button
        Button button = new Button("Refresh");
        // Process event
        button.setOnAction(e -> getCards(hBox));

        // Place nodes in BoarderPane
        bPane.setTop(hBox);
        bPane.setBottom(button);
        BorderPane.setAlignment(button, Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(bPane);
        // Set the stage title
        primaryStage.setTitle("Module 10");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }

    /** Returns a list with numbers 1-52 stored in random order */
    private void getCards(HBox pane) {
        pane.getChildren().clear();

        // Create a deck of cards
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        // Shuffle
        java.util.Collections.shuffle(cards);

        // Add cards
        for (int i = 0; i < 4; i++) {
            pane.getChildren().add(new ImageView(new Image("image/card/" + cards.get(i) + ".png")));
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
