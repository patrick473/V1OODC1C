package practica.practicum9;/**
 * Created by patrick on 3/7/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BoekingenApp extends Application {
    private Hotel hotel = new Hotel("avondrust");
    private ArrayList<KamerType> kamerTypenLijst = new ArrayList<KamerType>(hotel.getKamerTypen());
    private LocalDate today = LocalDate.now();
    private  LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);


    @Override
    public void start(Stage primaryStage) {
        // defining objects
        Button reset = new Button("reset");
        Button boek = new Button("boek");
        Label titel = new Label("Voer uw gegevens in!");
        Label naamLabel = new Label("Naam:");
        Label adresLabel = new Label("adres:");
        Label aankomstdatumLabel = new Label("aankomstdatum:");
        Label vertrekdatumLabel = new Label("vertrekdatum:");
        Label kamertypeLabel = new Label("kamertype:");
        TextField naamText = new TextField();
        TextField adresText = new TextField();
        DatePicker aankomstdatum = new DatePicker();
        DatePicker vertrekdatum = new DatePicker();
        ComboBox<KamerType> kamertype = new ComboBox<KamerType>();
        Pane spacer = new Pane();
        for( KamerType i : kamerTypenLijst){
            kamertype.getItems().add(i);
        }
        aankomstdatum.setValue(today);
        vertrekdatum.setValue(tomorrow);

        boek.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (!naamText.getText().trim().equals("")){
                    if(!adresText.getText().trim().equals("")){
                        if(aankomstdatum.getValue().isAfter(today)){
                           if(vertrekdatum.getValue().isAfter(aankomstdatum.getValue())){
                               if(kamertype.getValue() != null){
                                   KamerType gekozen = kamertype.getValue();
                    hotel.voegBoekingToe(aankomstdatum.getValue(),vertrekdatum.getValue(),naamText.getText(),adresText.getText(),kamertype.getValue() );
                    System.out.println(hotel);
                    titel.setText("Boeking succesvol");
                    naamText.setText(null);
                    adresText.setText(null);
                    aankomstdatum.setValue(today);
                    vertrekdatum.setValue(tomorrow);
                    kamertype.setValue(null);
                               }
                               else{
                                   titel.setText("je bent de kamertype vergeten");
                                   return;
                               }
                           }
                           else{
                               titel.setText("vertrekdatum is voor de aankomstdatum");
                               return;
                           }

                        }
                        else{
                            titel.setText("aankomstdatum is in het verleden");
                            return;
                        }
                    }
                    else{
                        titel.setText("Je bent het adres vergeten");
                        return;
                    }
                }
                else{
                    titel.setText("je ben je naam vergeten");
                    return;
                }
            }

        });
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                naamText.setText(null);
                adresText.setText(null);
                aankomstdatum.setValue(today);
                vertrekdatum.setValue(tomorrow);
                kamertype.setValue(null);

            }
        });

        titel.setPrefWidth(300);
        naamLabel.setPrefWidth(130);
        adresLabel.setPrefWidth(130);
        aankomstdatumLabel.setPrefWidth(130);
        vertrekdatumLabel.setPrefWidth(130);
        kamertypeLabel.setPrefWidth(130);
        adresText.setPrefWidth(190);
        aankomstdatum.setPrefWidth(190);
        vertrekdatum.setPrefWidth(190);
        kamertype.setPrefWidth(190);
        naamText.setPrefWidth(190);
        spacer.setPrefWidth(220);
        reset.setAlignment(Pos.BOTTOM_RIGHT);
        boek.setAlignment(Pos.BOTTOM_RIGHT);





        FlowPane root = new FlowPane();
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(10);
        root.setHgap(10);
        root.getChildren().addAll(titel);
        root.getChildren().addAll(naamLabel,naamText);
        root.getChildren().addAll(adresLabel,adresText);
        root.getChildren().addAll(aankomstdatumLabel,aankomstdatum);
        root.getChildren().addAll(vertrekdatumLabel,vertrekdatum);
        root.getChildren().addAll(kamertypeLabel,kamertype);
        root.getChildren().addAll(spacer,reset,boek);

        Scene scene = new Scene(root,350,250);
        primaryStage.setTitle("Tweepersoonsboekingen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

   Application.launch(args);


}}
