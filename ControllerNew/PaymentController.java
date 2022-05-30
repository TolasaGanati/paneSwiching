import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PaymentController {

    @FXML
    private Button Cancel;

    @FXML
    private TextField EnterCardHolderName;

    @FXML
    private TextField EnterCardNo;

    @FXML
    private TextField MM;

    @FXML
    private Button PaymentAndBook;

    @FXML
    private TextField yyyy;

    @FXML
    void Cancel(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("BookingConfirmation");
        MainBorderpane.setCenter(view);
    }

    @FXML
    void PaymentAndBook(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("BookingConfirmation");
        MainBorderpane.setCenter(view);
    }

}
