import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

public class control {

    @FXML
    private Button btnlogin;

    @FXML
    private Button btncreate;

    @FXML
    private Label createpage;

    @FXML
    private Label recover;

    @FXML
    private PasswordField password;

    @FXML
    private TextField user;

     //Criação do Alert
    Alert alert = new Alert(AlertType.NONE);

         //Método para o login de usuário
    @FXML
    void login(ActionEvent event) {

       String name = user.getText();
       String pass = password.getText();
       
       //Verifica se foi dado uma entrada inválida 
       if(name.equals("") || pass.equals("")){

        alert.setAlertType(AlertType.ERROR);
        alert.setTitle("Erro ao efetuar o login");
        alert.setHeaderText("Erro durante o login");
        alert.setContentText("Insira seu login e sua senha corretamente e tente novamente");
        alert.show();
        System.out.println("Erro ao efetuar o login");

        //verifica se o login foi bem sucedido
       }else
       {

       alert.setAlertType(AlertType.CONFIRMATION);
       alert.setTitle("Bem-vindo(a)");
       alert.setHeaderText("Seja Bem-vindo(a) "+name+"!");
       alert.setContentText("Desfrute de uma experiência única no Facebook.");

       alert.show();
       System.out.println("Login bem sucedido! \nSeja bem-vindo(a) "+name+"!");
       user.setText("");
       password.setText("");



       }
    

    }

     //Método para a criação de uma nova conta
    @FXML
    void createacc(ActionEvent event) {
  
    alert.setAlertType(AlertType.CONFIRMATION);
    alert.setTitle("Criar nova conta");
    alert.setHeaderText("Deseja criar uma nova conta?");
    alert.setContentText("Você será redirecionado para a página de cadastro.");
    alert.show();
    System.out.println("Escolheu criar uma nova conta.");

    } 

     //Método para a recuperação de senha do usuário
    @FXML
    void recoverpass(MouseEvent event) {

     alert.setAlertType(AlertType.WARNING);
     alert.setTitle("Aviso de redirecionamento");
     alert.setHeaderText("Você será redirecionado para a página de recuperação de senha.");
     alert.setContentText("Após recuperar sua senhe volte para a página de login.");
     alert.show();
     System.out.println("Escolheu recuperar a senha.");

    }

    @FXML
    void createapage(MouseEvent event) {

     alert.setAlertType(AlertType.WARNING);
     alert.setTitle("Criação de conta comercial");
     alert.setHeaderText("Você será redirecionado para a pagina de criação de contas comerciais.");
     alert.setContentText("Você está sendo redirecionado.");
     alert.show();
     System.out.println("Escolheu criar uma conta comercial.");


    } 

}
