package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML private Button button00;
    @FXML private Button button01;
    @FXML private Button button02;
    @FXML private Button button10;
    @FXML private Button button11;
    @FXML private Button button12;
    @FXML private Button button20;
    @FXML private Button button21;
    @FXML private Button button22;



    public void processclick(javafx.event.ActionEvent actionEvent) {
        String value = ((Button)actionEvent.getSource()).getId();
        if (value.equals("button00")&&Game.getBoard(0, 0).equals("0")) {button00.setText(Game.getCurrentplayer()); Game.setBoard(0, 0, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button01")&&Game.getBoard(0, 1).equals("0")) {button01.setText(Game.getCurrentplayer()); Game.setBoard(0, 1, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button02")&&Game.getBoard(0, 2).equals("0")) {button02.setText(Game.getCurrentplayer()); Game.setBoard(0, 2, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button10")&&Game.getBoard(1, 0).equals("0")) {button10.setText(Game.getCurrentplayer()); Game.setBoard(1, 0, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button11")&&Game.getBoard(1, 1).equals("0")) {button11.setText(Game.getCurrentplayer()); Game.setBoard(1, 1, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button12")&&Game.getBoard(1, 2).equals("0")) {button12.setText(Game.getCurrentplayer()); Game.setBoard(1, 2, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button20")&&Game.getBoard(2, 0).equals("0")) {button20.setText(Game.getCurrentplayer()); Game.setBoard(2, 0, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button21")&&Game.getBoard(2, 1).equals("0")) {button21.setText(Game.getCurrentplayer()); Game.setBoard(2, 1, Game.getCurrentplayer());Game.setCurrentplayer();}
        if (value.equals("button22")&&Game.getBoard(2, 2).equals("0")) {button22.setText(Game.getCurrentplayer()); Game.setBoard(2, 2, Game.getCurrentplayer()); Game.setCurrentplayer();}

            Game.getWon();


    }





}
