// Author: Lord Saiyan (Joao Victor)
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
  
    
    public static void main(String args[]) throws Exception
    {
        // Executa a aplicação.
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{

//Carrega o arquivo FXML do SceneBuilder
   FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("gui.fxml"));
   Parent root = fxmlloader.load();
   Scene tela = new Scene(root);

//Define o icone para a aplicação
    Image image = new Image("facebook_icon.png");
    primaryStage.getIcons().add(image);
    


    //Nomeia o titulo da janela
    primaryStage.setTitle("Facebook");
    primaryStage.setScene(tela);
    primaryStage.show();

    }


}
