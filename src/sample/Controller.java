package sample;

import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Slider sliderLevel;



    public void btnStartOnClick(MouseEvent mouseEvent) {
        System.out.println("Start geklickt");
        sliderLevel.setId("slideLevel");
        System.out.println("Level ist: "+sliderLevel.getValue());
        ConfigGame game = new ConfigGame((int)sliderLevel.getValue());
    }
}
