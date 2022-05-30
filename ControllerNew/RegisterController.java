import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private Button CancelTextFild;

    @FXML
    private TextField FristNameTextFild;

    @FXML
    private TextField LastNameTextFild;

    @FXML
    private TextField PasswardTextFild;

    @FXML
    private Button SignupButton;

    @FXML
    private TextField conforimTextFild;

    @FXML
    private TextField loginTextFild;

    @FXML
    void cancel(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("login");
        MainBorderpane.setCenter(view);
    }

    @FXML
    void signUp(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("BookTicket");
        MainBorderpane.setCenter(view);

    }



}

