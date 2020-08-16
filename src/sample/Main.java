package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
                static Stage window;
                static Parent root;

    static {
        try {
            root = FXMLLoader.load(Main.class.getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Scene game = new Scene(root, 900, 900);


                public Main() throws IOException {
                }

                @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;


        primaryStage.setTitle("Tic Tac Toe");

        window.setScene(game);
        primaryStage.show();
        Game.game();











    }

    public static void setChangeScene(String player) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setVgap(100);


        Scene winscreen = null;

           Label wintext = new Label();
           wintext.setText("Player "+player+" won");
           wintext.setFont(Font.font(70));

           Button restart = new Button();
           restart.setText("New Game");
       restart.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               window.setScene(game);
               window.show();
               Game.game();
           }
       });



           grid.add(wintext, 1, 1);
           grid.add(restart, 1, 2);
            winscreen = new Scene(grid,900, 900);


        window.setScene(winscreen);
        window.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
