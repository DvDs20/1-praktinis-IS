package sample;

import backEnd.cesearCipher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import javax.swing.*;

public class Controller {

    public Button encryptButton;
    public TextArea secondTextField;
    public TextArea textField;
    public TextField shiftTextField;
    public Button decryptButton;
    public Button copyButton;
    DropShadow shadow = new DropShadow();

    public void encryptButtonPressed(ActionEvent actionEvent) throws Exception {

        try {
            String text = textField.getText();
            int shift = Integer.parseInt(shiftTextField.getText());

            String ciphertext = String.valueOf(cesearCipher.encrypt(text, shift));
            secondTextField.clear();
            secondTextField.setText(ciphertext);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }

    }

    public void decryptButtonPressed(ActionEvent actionEvent) throws Exception {
        try {
            String ciphertext = textField.getText();
            int shift = Integer.parseInt(shiftTextField.getText());

            String text = String.valueOf(cesearCipher.decrypt(ciphertext, shift));
            secondTextField.clear();
            secondTextField.setText(text);
        }
        catch (Exception exception) {
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }

    }

    public void copyButtonPressed(ActionEvent actionEvent) {
        String copyText = secondTextField.getText();

        final Clipboard clipboard = Clipboard.getSystemClipboard();
        final ClipboardContent content = new ClipboardContent();
        content.putString(copyText);
        clipboard.setContent(content);
    }


}
