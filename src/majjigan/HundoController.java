package majjigan;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HundoController {
    @FXML
    private Pane myPane;
    @FXML
    private ImageView lakImg;
    @FXML
    private ImageView miscImg;
    @FXML
    private ImageView kartImg;
    @FXML
    private ImageView bikeImg;
    @FXML
    private ImageView charImg;
    @FXML
    private ImageView blueImg;
    @FXML
    private ImageView lightningImg;
    @FXML
    private ImageView powImg;
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
    @FXML
    private Button unlockList;
    private final Stage kernelStage = new Stage();

    public void turnOnIcons() {
        myPane.setBackground(new Background(new BackgroundFill(Color.valueOf("#000000"), new CornerRadii(0), new Insets(0))));
        lakImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/lakitu.png"))));
        miscImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/misc.png"))));
        kartImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/kart.png"))));
        bikeImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/bike.png"))));
        charImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/character.png"))));
        blueImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/blueshell.png"))));
        lightningImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/lightning.png"))));
        powImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/POW.png"))));
    }

    public void openUnlockList() {
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("Unlock Everything Graphic");

        ImageView imageView = new ImageView();
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/UnlockablesList.png")));
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
}



