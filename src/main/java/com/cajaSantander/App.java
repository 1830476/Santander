package com.cajaSantander;

public class App extends Application;
{
    public static void main( String[] args )
    {

        launch(args);




    }

    @Override
    public void start(Stage stage) throws
    Exception{
            stage=(Stage)
            FXMLLoader.load(getClass().getResource("/fxml/tier1.fxml"));
            stage.show();


    }
}
