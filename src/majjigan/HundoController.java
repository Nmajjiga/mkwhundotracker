package majjigan;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.input.KeyEvent;
import java.util.Objects;


public class HundoController extends Application {
    @FXML
    private Pane myPane;
    @FXML
    private ImageView lakImg = new ImageView();
    @FXML
    private ImageView miscImg = new ImageView();
    @FXML
    private ImageView kartImg = new ImageView();
    @FXML
    private ImageView bikeImg = new ImageView();
    @FXML
    private ImageView charImg = new ImageView();
    @FXML
    private ImageView blueImg = new ImageView();
    @FXML
    private ImageView lightningImg = new ImageView();
    @FXML
    private ImageView powImg = new ImageView();
    @FXML
    private Text bikeCounter;
    @FXML
    private Text kartCounter;
    @FXML
    private Text miscCounter;
    @FXML
    private Text characterCounter;
    @FXML
    private Text blueShellCounter;
    @FXML
    private Text lightningCounter;
    @FXML
    private Text POWCounter;
    @FXML
    private Text fallCounter;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HundoFXML.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("MKW 100% Tracker");
        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/wheel.png"))));

        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public void turnOnIcons() {
        System.out.println("Turning on Icons!");
        myPane.setBackground(new Background(new BackgroundFill(Color.color(0, 0, 0), new CornerRadii(0), new Insets(0))));
        lakImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/lakitu.png"))));
        miscImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/misc.png"))));
        kartImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/kart.png"))));
        bikeImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/bike.png"))));
        charImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/character.png"))));
        blueImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/blueshell.png"))));
        lightningImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/lightning.png"))));
        powImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/POW.png"))));
    }

    public void openUnlockList() {
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("Unlock Everything Graphic");

        ImageView imageView = new ImageView();
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/UnlockablesList.png")));

        imageView.setImage(image);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 500, 850);
        popupStage.setScene(scene);
        imageView.fitWidthProperty().bind(popupStage.widthProperty());
        imageView.fitHeightProperty().bind(popupStage.heightProperty());
        popupStage.showAndWait();
    }

    public void increaseBikeCount() {
        if (Integer.parseInt(bikeCounter.getText()) >= 8) {
            bikeCounter.setText("9");
            return;
        }
        int i = Integer.parseInt(bikeCounter.getText()) + 1;
        bikeCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseBikeCount() {
        if (Integer.parseInt(bikeCounter.getText()) <= 0) {
            bikeCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(bikeCounter.getText()) - 1;
        bikeCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetBike() {
        bikeCounter.setText("0");
    }

    public void increaseKartCount() {
        if (Integer.parseInt(kartCounter.getText()) >= 8) {
            kartCounter.setText("9");
            return;
        }
        int i = Integer.parseInt(kartCounter.getText()) + 1;
        kartCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseKartCount() {
        if (Integer.parseInt(kartCounter.getText()) <= 0) {
            kartCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(kartCounter.getText()) - 1;
        kartCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetKart() {
        kartCounter.setText("0");
    }

    public void increaseCharacterCount() {
        if (Integer.parseInt(characterCounter.getText()) >= 13) {
            characterCounter.setText("14");
            return;
        }
        int i = Integer.parseInt(characterCounter.getText()) + 1;
        characterCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseCharacterCount() {
        if (Integer.parseInt(characterCounter.getText()) <= 0) {
            characterCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(characterCounter.getText()) - 1;
        characterCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetCharacter() {
        characterCounter.setText("0");
    }

    public void increaseBlueShellCount() {
        int i = Integer.parseInt(blueShellCounter.getText()) + 1;
        blueShellCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseBlueShellCount() {
        if (Integer.parseInt(blueShellCounter.getText()) <= 0) {
            blueShellCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(blueShellCounter.getText()) - 1;
        blueShellCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetBlueShell() {
        blueShellCounter.setText("0");
    }

    public void increaseMiscCount() {
        int i = Integer.parseInt(miscCounter.getText()) + 1;
        miscCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseMiscCount() {
        if (Integer.parseInt(miscCounter.getText()) <= 0) {
            miscCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(miscCounter.getText()) - 1;
        miscCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetMisc() {
        miscCounter.setText("0");
    }

    public void increaseLightningCount() {
        int i = Integer.parseInt(lightningCounter.getText()) + 1;
        lightningCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseLightningCount() {
        if (Integer.parseInt(lightningCounter.getText()) <= 0) {
            lightningCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(lightningCounter.getText()) - 1;
        lightningCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetLightning() {
        lightningCounter.setText("0");
    }

    public void increasePOWCount() {
        int i = Integer.parseInt(POWCounter.getText()) + 1;
        POWCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreasePOWCount() {
        if (Integer.parseInt(POWCounter.getText()) <= 0) {
            POWCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(POWCounter.getText()) - 1;
        POWCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetPOW() {
        POWCounter.setText("0");
    }

    public void increaseFallCount() {
        int i = Integer.parseInt(fallCounter.getText()) + 1;
        fallCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void decreaseFallCount() {
        if (Integer.parseInt(fallCounter.getText()) <= 0) {
            fallCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(fallCounter.getText()) - 1;
        fallCounter.setText(String.valueOf(Integer.valueOf(i)));
    }
    public void resetFalls() {
        fallCounter.setText("0");
    }

    public void hotkeyNewCount(KeyEvent e) {
        if (e.getCode() == KeyCode.Q) {
            increaseBikeCount();
        }
        if (e.getCode() == KeyCode.W) {
            increaseKartCount();
        }
        if (e.getCode() == KeyCode.E) {
            increaseCharacterCount();
        }
        if (e.getCode() == KeyCode.R) {
            increaseBlueShellCount();
        }
        if (e.getCode() == KeyCode.T) {
            increaseLightningCount();
        }
        if (e.getCode() == KeyCode.Y) {
            increasePOWCount();
        }
        if (e.getCode() == KeyCode.U) {
            increaseMiscCount();
        }
        if (e.getCode() == KeyCode.I) {
            increaseFallCount();
        }
    }
}



