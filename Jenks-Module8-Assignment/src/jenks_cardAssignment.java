/*Scott Jenks
 * 2/12/2023
 * Module 8 - Select 4 random cards using JavaFX
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

public class jenks_cardAssignment extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a list of card numbers
        ArrayList<Integer> cards = getCards();
        // Create a HBox pane
        HBox pane = new HBox(15);
        pane.setPadding(new Insets(10, 10, 10, 10));

        // Add nodes (cards) to pane
        for (int i = 0; i < 4; i++) {
            pane.getChildren().add(new ImageView(new Image("image/card/" + cards.get(i) + ".png")));
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        // Set the stage title
        primaryStage.setTitle("Module 8");
        // Place the scene in the stage
        primaryStage.setScene(scene);
        // Display the stage
        primaryStage.show();
    }

    /** Returns a list with numbers 1-52 stored in random order */
    private ArrayList<Integer> getCards() {
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
