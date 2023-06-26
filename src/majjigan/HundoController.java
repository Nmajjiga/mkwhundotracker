package majjigan;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
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
    private ImageView unlockablesImg;
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
        unlockablesImg.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("/sprites/UnlockablesList.png"))));
    }
    public void increaseBikeCount() {
        if (Integer.parseInt(bikeCounter.getText()) >= 8) {
            bikeCounter.setText("9");
            return;
        } else if (Integer.parseInt(bikeCounter.getText()) < 0) {
            bikeCounter.setText("0");
            return;
        }
        int bike = Integer.parseInt(bikeCounter.getText()) + 1;
        bikeCounter.setText(String.valueOf(Integer.valueOf(bike)));
    }
}



