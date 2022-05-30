import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BookingConfirmationController {

    @FXML
    private Button Cancel;

    @FXML
    private Button Confirm;

    @FXML
    void Cancel(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("BookTicket");
        MainBorderpane.setCenter(view);
    }

    @FXML
    void Confirm(ActionEvent event) {
        PaneSwicher swicher = new PaneSwicher();
        Pane view = swicher.getPane("Payment");
        MainBorderpane.setCenter(view);
    }

}
