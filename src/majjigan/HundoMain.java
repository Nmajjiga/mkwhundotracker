package majjigan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HundoMain extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Sets up first window
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HundoFXML.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("MKW 100% Tracker");
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);

        primaryStage.show();
    }
}
