import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BookTicketController {

    @FXML
    private TextField AddressTextFild;

    @FXML
    private Button CancelButton;

    @FXML
    private TextField DateTextFild;

    @FXML
    private TextField EmailTextFild;

    @FXML
    private TextField MobileNOTextFild;

    @FXML
    private TextField NoPersonTextFild;

    @FXML
    private Button ProcessButton;

    @FXML
    void Cancel(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("Registration");
        MainBorderpane.setCenter(view);
    }

    @FXML
    void ProcessToPayment(ActionEvent event) {

        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("BookingConfirmation");
        MainBorderpane.setCenter(view);

}


}