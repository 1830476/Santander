package com.cajaSantander;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class App extends Application
{
    public static void main( String[] args )
    {

        launch(args);




    }

    @Override
    public void start(Stage stage) throws Exception {
        stage =(Stage) FXMLLoader.load(getClass().getResource("/fxml/tier1.fxml"));
        stage.show();
    }

}
