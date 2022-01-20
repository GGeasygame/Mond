package ch.ictbz.mond.mond;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private RadioButton daysRadioButton;
    @FXML
    private RadioButton hoursRadioButton;
    @FXML
    private TextField speedTextField;
    @FXML
    private TextField outputTimeTextField;

    public void onButtonCalculateTravelDistance() {
        if (!speedTextField.getText().matches("\\d+")) return;

        Mondreise mondreise = new Mondreise(Integer.parseInt(speedTextField.getText()));

        String output = "";
        if (daysRadioButton.isSelected()) {
            output = String.valueOf(mondreise.getTravelDurationDays());
        } else {
            output = String.valueOf(mondreise.getTravelDurationHours());
        }

        outputTimeTextField.setText(output);
    }

}