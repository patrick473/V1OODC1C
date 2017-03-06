package week4.les2.opdracht1;/**
 * Created by patrick on 3/6/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Helloworld extends Application
        implements EventHandler<ActionEvent> {
    @Override
    public void start(Stage primaryStage) {

        // defining objects
        Button btn = new Button();
        btn.setText("'Hello World'");

        Button btn2 = new Button();
        btn2.setText("'Hello Warld'");

        Label label = new Label();
        label.setText("text");
        ;


        //actis voor buttons
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                label.setText("appel");

            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                label.setText("appels");

            }
        });;
        VBox root = new VBox();
        root.setPrefWidth(100.0);
        root.getChildren().addAll(btn,btn2,label);


        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handle(ActionEvent event) {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}