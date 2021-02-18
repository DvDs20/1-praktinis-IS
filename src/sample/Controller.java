package sample;

import backEnd.cesearCipher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public Button encryptButton;
    public TextArea secondTextField;
    public TextArea textField;
    public TextField shiftTextField;
    public Button decryptButton;
    public RadioButton withArrayButton;

    public void encryptButtonPressed(ActionEvent actionEvent) {

        if (withArrayButton.isSelected()){
            String text = textField.getText();
            int shift = Integer.parseInt(shiftTextField.getText());
            cesearCipher.encryptusingASCII(text, shift);
            String ciphertext = String.valueOf(cesearCipher.encrypt(text, shift));
            secondTextField.clear();
            secondTextField.setText(ciphertext);
        }
        else {
            String text = textField.getText();
            int shift = Integer.parseInt(shiftTextField.getText());

            String ciphertext = String.valueOf(cesearCipher.encrypt(text, shift));

            secondTextField.clear();
            secondTextField.setText(ciphertext);
        }

    }

    public void decryptButtonPressed(ActionEvent actionEvent) {
        String ciphertext = textField.getText();
        int shift = Integer.parseInt(shiftTextField.getText());

        String text = String.valueOf(cesearCipher.decrypt(ciphertext, shift));

        secondTextField.clear();
        secondTextField.setText(text);
    }
}
