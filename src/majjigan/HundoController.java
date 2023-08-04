package majjigan;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Objects;

public class HundoController extends Application {
    @FXML
    private Text kartCounter;
    @FXML
    private Text bikeCounter;
    @FXML
    private Text miscCounter;
    @FXML
    private Text miscUnlocksCounter;
    @FXML
    private Text characterCounter;
    @FXML
    private Text blueShellCounter;
    @FXML
    private Text lightningCounter;
    @FXML
    private Text fallCounter;
    @FXML
    private ImageView babyLuigi;
    private int isImageGreyBL = 0;
    @FXML
    private ImageView babyDaisy;
    private int isImageGreyBD = 0;
    @FXML
    private ImageView toadette;
    private int isImageGreyFT = 0;
    @FXML
    private ImageView dryBones;
    private int isImageGreyDBones = 0;
    @FXML
    private ImageView birdo;
    private int isImageGreyBirdo = 0;
    @FXML
    private ImageView bowserJr;
    private int isImageGreyBJ = 0;
    @FXML
    private ImageView daisy;
    private int isImageGreyDaisy = 0;
    @FXML
    private ImageView diddyKong;
    private int isImageGreyDiddy = 0;
    @FXML
    private ImageView rosa;
    private int isImageGreyRosa = 0;
    @FXML
    private ImageView kingBoo;
    private int isImageGreyKB = 0;
    @FXML
    private ImageView funky;
    private int isImageGreyFK = 0;
    @FXML
    private ImageView dryBowser;
    private int isImageGreyDB = 0;
    @FXML
    private ImageView miiA;
    private int isImageGreymii1 = 0;
    @FXML
    private ImageView miiB;
    private int isImageGreymii2 = 0;
    @FXML
    private ImageView titan;
    private int isImageGreyTitan = 0;
    @FXML
    private ImageView cheep;
    private int isImageGreyCheep = 0;
    @FXML
    private ImageView falcon;
    private int isImageGreyFalcon = 0;
    @FXML
    private ImageView quacker;
    private int isImageGreyQuacker = 0;
    @FXML
    private ImageView magi;
    private int isImageGreyMagi = 0;
    @FXML
    private ImageView bubbleBike;
    private int isImageGreyBBike = 0;
    @FXML
    private ImageView bloop;
    private int isImageGreyBloop = 0;
    @FXML
    private ImageView daytripper;
    private int isImageGreyDaytripper = 0;
    @FXML
    private ImageView bDasher;
    private int isImageGreyBDash = 0;
    @FXML
    private ImageView zip;
    private int isImageGreyZip = 0;
    @FXML
    private ImageView sneak;
    private int isImageGreySneak = 0;
    @FXML
    private ImageView dolphin;
    private int isImageGreyDolphin = 0;
    @FXML
    private ImageView pirahna;
    private int isImageGreyPirahna = 0;
    @FXML
    private ImageView jetsetter;
    private int isImageGreyJetsetter = 0;
    @FXML
    private ImageView honeyCoupe;
    private int isImageGreyHoney = 0;
    @FXML
    private ImageView starBike;
    private int isImageGreyStar = 0;
    @FXML
    private ImageView spear;
    private int isImageGreySpear = 0;
    @FXML
    private ImageView phantom;
    private int isImageGreyPhantom = 0;
    @FXML
    private ImageView bikes50;
    private int isImageGreyBikes50 = 0;
    @FXML
    private ImageView karts100;
    private int isImageGreyKarts100 = 0;
    @FXML
    private ImageView mirror;
    private int isImageGreyMirror = 0;
    @FXML
    private ImageView congratsDisplay;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("HundoFXMLWithTracker.fxml"));
        Parent root = loader.load();

        primaryStage.getIcons().add(new Image(Objects.requireNonNull(getClass().getResourceAsStream("wheel.png"))));
        primaryStage.setTitle("MKW 100% Tracker");

        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);

        primaryStage.show();
    }

    public void initialize() {
        congratsDisplay.setVisible(false);
    }

    public void babyLuigi(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBL == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(babyLuigi);
                increaseCharacterCount();
                isImageGreyBL = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBL == 1) {
                resetGreyscale(babyLuigi);
                decreaseCharacterCount();
                isImageGreyBL = 0;
            }
        }
        checkForHundo();
    }

    public void babyDaisy(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBD == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(babyDaisy);
                increaseCharacterCount();
                isImageGreyBD = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBD == 1) {
                resetGreyscale(babyDaisy);
                decreaseCharacterCount();
                isImageGreyBD = 0;
            }
        }
        checkForHundo();
    }

    public void dryBones(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDBones == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(dryBones);
                increaseCharacterCount();
                isImageGreyDBones = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDBones == 1) {
                resetGreyscale(dryBones);
                decreaseCharacterCount();
                isImageGreyDBones = 0;
            }
        }
        checkForHundo();
    }

    public void toadette(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyFT == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(toadette);
                increaseCharacterCount();
                isImageGreyFT = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyFT == 1) {
                resetGreyscale(toadette);
                decreaseCharacterCount();
                isImageGreyFT = 0;
            }
        }
        checkForHundo();
    }

    public void babyBowser(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBJ == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(bowserJr);
                increaseCharacterCount();
                isImageGreyBJ = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBJ == 1) {
                resetGreyscale(bowserJr);
                decreaseCharacterCount();
                isImageGreyBJ = 0;
            }
        }
        checkForHundo();
    }

    public void birdo(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBirdo == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(birdo);
                increaseCharacterCount();
                isImageGreyBirdo = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBirdo == 1) {
                resetGreyscale(birdo);
                decreaseCharacterCount();
                isImageGreyBirdo = 0;
            }
        }
        checkForHundo();
    }

    public void daisy(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDaisy == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(daisy);
                increaseCharacterCount();
                isImageGreyDaisy = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDaisy == 1) {
                resetGreyscale(daisy);
                decreaseCharacterCount();
                isImageGreyDaisy = 0;
            }
        }
        checkForHundo();
    }

    public void diddy(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDiddy == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(diddyKong);
                increaseCharacterCount();
                isImageGreyDiddy = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDiddy == 1) {
                resetGreyscale(diddyKong);
                decreaseCharacterCount();
                isImageGreyDiddy = 0;
            }
        }
        checkForHundo();
    }

    public void rosa(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyRosa == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(rosa);
                increaseCharacterCount();
                isImageGreyRosa = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyRosa == 1) {
                resetGreyscale(rosa);
                decreaseCharacterCount();
                isImageGreyRosa = 0;
            }
        }
        checkForHundo();
    }

    public void kingboo(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyKB == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(kingBoo);
                increaseCharacterCount();
                isImageGreyKB = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyKB == 1) {
                resetGreyscale(kingBoo);
                decreaseCharacterCount();
                isImageGreyKB = 0;
            }
        }
        checkForHundo();
    }

    public void funky(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyFK == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(funky);
                increaseCharacterCount();
                isImageGreyFK = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyFK == 1) {
                resetGreyscale(funky);
                decreaseCharacterCount();
                isImageGreyFK = 0;
            }
        }
        checkForHundo();
    }

    public void dryBowser(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDB == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(dryBowser);
                increaseCharacterCount();
                isImageGreyDB = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDB == 1) {
                resetGreyscale(dryBowser);
                decreaseCharacterCount();
                isImageGreyDB = 0;
            }
        }
        checkForHundo();
    }

    public void mii1(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreymii1 == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(miiA);
                increaseCharacterCount();
                isImageGreymii1 = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreymii1 == 1) {
                resetGreyscale(miiA);
                decreaseCharacterCount();
                isImageGreymii1 = 0;
            }
        }
        checkForHundo();
    }

    public void mii2(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreymii2 == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(miiB);
                increaseCharacterCount();
                isImageGreymii2 = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreymii2 == 1) {
                resetGreyscale(miiB);
                decreaseCharacterCount();
                isImageGreymii2 = 0;
            }
        }
        checkForHundo();
    }

    public void titan(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyTitan == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(titan);
                increaseKartCount();
                isImageGreyTitan = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyTitan == 1) {
                resetGreyscale(titan);
                decreaseKartCount();
                isImageGreyTitan = 0;
            }
        }
        checkForHundo();
    }

    public void cheep(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyCheep == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(cheep);
                increaseKartCount();
                isImageGreyCheep = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyCheep == 1) {
                resetGreyscale(cheep);
                decreaseKartCount();
                isImageGreyCheep = 0;
            }
        }
        checkForHundo();
    }

    public void falconBlue(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyFalcon == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(falcon);
                increaseKartCount();
                isImageGreyFalcon = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyFalcon == 1) {
                resetGreyscale(falcon);
                decreaseKartCount();
                isImageGreyFalcon = 0;
            }
        }
        checkForHundo();
    }

    public void superBlooper(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBloop == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(bloop);
                increaseKartCount();
                isImageGreyBloop = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBloop == 1) {
                resetGreyscale(bloop);
                decreaseKartCount();
                isImageGreyBloop = 0;
            }
        }
        checkForHundo();
    }

    public void daytripper(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDaytripper == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(daytripper);
                increaseKartCount();
                isImageGreyDaytripper = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDaytripper == 1) {
                resetGreyscale(daytripper);
                decreaseKartCount();
                isImageGreyDaytripper = 0;
            }
        }
        checkForHundo();
    }

    public void bDasher2(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBDash == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(bDasher);
                increaseKartCount();
                isImageGreyBDash = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBDash == 1) {
                resetGreyscale(bDasher);
                decreaseKartCount();
                isImageGreyBDash = 0;
            }
        }
        checkForHundo();
    }

    public void prowler(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyPirahna == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(pirahna);
                increaseKartCount();
                isImageGreyPirahna = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyPirahna == 1) {
                resetGreyscale(pirahna);
                decreaseKartCount();
                isImageGreyPirahna = 0;
            }
        }
        checkForHundo();
    }

    public void jetsetter(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyJetsetter == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(jetsetter);
                increaseKartCount();
                isImageGreyJetsetter = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyJetsetter == 1) {
                resetGreyscale(jetsetter);
                decreaseKartCount();
                isImageGreyJetsetter = 0;
            }
        }
        checkForHundo();
    }

    public void honeycoupe(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyHoney == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(honeyCoupe);
                increaseKartCount();
                isImageGreyHoney = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyHoney == 1) {
                resetGreyscale(honeyCoupe);
                decreaseKartCount();
                isImageGreyHoney = 0;
            }
        }
        checkForHundo();
    }

    public void quacker(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyQuacker == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(quacker);
                increaseBikeCount();
                isImageGreyQuacker = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyQuacker == 1) {
                resetGreyscale(quacker);
                decreaseBikeCount();
                isImageGreyQuacker = 0;
            }
        }
        checkForHundo();
    }

    public void magikrusier(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyMagi == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(magi);
                increaseBikeCount();
                isImageGreyMagi = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyMagi == 1) {
                resetGreyscale(magi);
                decreaseBikeCount();
                isImageGreyMagi = 0;
            }
        }
        checkForHundo();
    }

    public void jetBike(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBBike == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(bubbleBike);
                increaseBikeCount();
                isImageGreyBBike = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBBike == 1) {
                resetGreyscale(bubbleBike);
                decreaseBikeCount();
                isImageGreyBBike = 0;
            }
        }
        checkForHundo();
    }

    public void zipzip(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyZip == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(zip);
                increaseBikeCount();
                isImageGreyZip = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyZip == 1) {
                resetGreyscale(zip);
                decreaseBikeCount();
                isImageGreyZip = 0;
            }
        }
        checkForHundo();
    }

    public void sneakster(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreySneak == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(sneak);
                increaseBikeCount();
                isImageGreySneak = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreySneak == 1) {
                resetGreyscale(sneak);
                decreaseBikeCount();
                isImageGreySneak = 0;
            }
        }
        checkForHundo();
    }

    public void dolphinBike(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyDolphin == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(dolphin);
                increaseBikeCount();
                isImageGreyDolphin = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyDolphin == 1) {
                resetGreyscale(dolphin);
                decreaseBikeCount();
                isImageGreyDolphin = 0;
            }
        }
        checkForHundo();
    }

    public void shootingStar(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyStar == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(starBike);
                increaseBikeCount();
                isImageGreyStar = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyStar == 1) {
                resetGreyscale(starBike);
                decreaseBikeCount();
                isImageGreyStar = 0;
            }
        }
        checkForHundo();
    }

    public void spear(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreySpear == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(spear);
                increaseBikeCount();
                isImageGreySpear = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreySpear == 1) {
                resetGreyscale(spear);
                decreaseBikeCount();
                isImageGreySpear = 0;
            }
        }
        checkForHundo();
    }

    public void phantom(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyPhantom == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(phantom);
                increaseBikeCount();
                isImageGreyPhantom = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyPhantom == 1) {
                resetGreyscale(phantom);
                decreaseBikeCount();
                isImageGreyPhantom = 0;
            }
        }
        checkForHundo();
    }

    public void bikes50(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyBikes50 == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(bikes50);
                increaseMiscCounter();
                isImageGreyBikes50 = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyBikes50 == 1) {
                resetGreyscale(bikes50);
                decreaseMiscCounter();
                isImageGreyBikes50 = 0;
            }
        }
        checkForHundo();
    }

    public void karts100(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyKarts100 == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(karts100);
                increaseMiscCounter();
                isImageGreyKarts100 = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyKarts100 == 1) {
                resetGreyscale(karts100);
                decreaseMiscCounter();
                isImageGreyKarts100 = 0;
            }
        }
        checkForHundo();
    }

    public void mirrorMode(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            if (isImageGreyMirror == 0) {
                //Set character count to be plus 1 and the image to be greyscaled
                greyscale(mirror);
                increaseMiscCounter();
                isImageGreyMirror = 1;
            }
        }
        if (event.getButton() == MouseButton.SECONDARY) {
            if (isImageGreyMirror == 1) {
                resetGreyscale(mirror);
                decreaseMiscCounter();
                isImageGreyMirror = 0;
            }
        }
        checkForHundo();
    }

    public void openUnlockList() {
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setTitle("Unlock Everything Graphic");

        ImageView imageView = new ImageView();
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("UnlockablesList.png")));

        imageView.setImage(image);
        imageView.setPreserveRatio(true);

        VBox root = new VBox(10);
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(imageView);

        Scene scene = new Scene(root, 300, 625);
        popupStage.setScene(scene);
        imageView.fitWidthProperty().bind(popupStage.widthProperty());
        imageView.fitHeightProperty().bind(popupStage.heightProperty());
        popupStage.showAndWait();
    }

    public void hotkeyNewCount(KeyEvent e) {
        if (e.getCode() == KeyCode.DIGIT1) {
            increaseBlueShellCount();
        }
        if (e.getCode() == KeyCode.DIGIT2) {
            increaseLightningCount();
        }
        if (e.getCode() == KeyCode.DIGIT3) {
            increaseMiscCount();
        }
        if (e.getCode() == KeyCode.DIGIT4) {
            increaseFallCount();
        }
        if (e.getCode() == KeyCode.Q) {
            decreaseBlueShellCount();
        }
        if (e.getCode() == KeyCode.W) {
            decreaseLightningCount();
        }
        if (e.getCode() == KeyCode.E) {
            decreaseMiscCount();
        }
        if (e.getCode() == KeyCode.R) {
            decreaseFallCount();
        }
    }

    private void increaseCharacterCount() {
        int i = Integer.parseInt(characterCounter.getText()) + 1;
        characterCounter.setText(String.valueOf(i));
    }

    private void increaseKartCount() {
        int i = Integer.parseInt(kartCounter.getText()) + 1;
        kartCounter.setText(String.valueOf(i));
    }

    private void increaseBikeCount() {
        int i = Integer.parseInt(bikeCounter.getText()) + 1;
        bikeCounter.setText(String.valueOf(i));
    }

    private void decreaseCharacterCount() {
        if (Integer.parseInt(characterCounter.getText()) < 0) {
            characterCounter.setText("0");
        }
        int i = Integer.parseInt(characterCounter.getText()) - 1;
        characterCounter.setText(String.valueOf(i));
    }

    private void decreaseKartCount() {
        if (Integer.parseInt(kartCounter.getText()) < 0) {
            kartCounter.setText("0");
        }
        int i = Integer.parseInt(kartCounter.getText()) - 1;
        kartCounter.setText(String.valueOf(i));
    }

    private void decreaseBikeCount() {
        if (Integer.parseInt(bikeCounter.getText()) < 0) {
            bikeCounter.setText("0");
        }
        int i = Integer.parseInt(bikeCounter.getText()) - 1;
        bikeCounter.setText(String.valueOf(i));
    }

    private void increaseMiscCounter() {
        int i = Integer.parseInt(miscUnlocksCounter.getText()) + 1;
        miscUnlocksCounter.setText(String.valueOf(i));
    }

    private void decreaseMiscCounter() {
        if (Integer.parseInt(miscUnlocksCounter.getText()) < 0) {
            miscUnlocksCounter.setText("0");
        }
        int i = Integer.parseInt(miscUnlocksCounter.getText()) - 1;
        miscUnlocksCounter.setText(String.valueOf(i));
    }

    public void increaseBlueShellCount() {
        int i = Integer.parseInt(blueShellCounter.getText()) + 1;
        blueShellCounter.setText(String.valueOf(i));
    }

    public void decreaseBlueShellCount() {
        if (Integer.parseInt(blueShellCounter.getText()) <= 0) {
            blueShellCounter.setText("0");
            return;
        }
        int i = Integer.parseInt(blueShellCounter.getText()) - 1;
        blueShellCounter.setText(String.valueOf(i));
    }

    public void resetBlueShellCount() {
        blueShellCounter.setText(String.valueOf(0));
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

    public void resetFallCount() {
        fallCounter.setText("0");
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

    public void checkForHundo() {
        if (Integer.parseInt(characterCounter.getText()) == 14) {
            if (Integer.parseInt(bikeCounter.getText()) == 9) {
                if (Integer.parseInt(kartCounter.getText()) == 9) {
                    if (Integer.parseInt(miscUnlocksCounter.getText()) == 3) {
                        congratsDisplay.setVisible(true);
                    }
                }
            }
        } else {
            congratsDisplay.setVisible(false);
        }
    }

    public void resetMiscCount() {
        miscCounter.setText("0");
    }

    private void greyscale(ImageView imageView) {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(-0.60); // Set saturation to -1.0 to make it grayscale
        imageView.setEffect(colorAdjust);
    }

    private void resetGreyscale(ImageView imageView) {
        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setBrightness(0.0); // Set saturation to -1.0 to make it grayscale
        imageView.setEffect(colorAdjust);
    }
}


