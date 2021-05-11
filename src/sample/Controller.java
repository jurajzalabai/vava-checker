package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller implements Initializable {

    @FXML
    private Button ButtonCheck;

    @FXML
    private CheckBox checkbox;

    @FXML
    private TextArea textArea;

    @FXML
    private TextField textField;

    @FXML
    private Button ButtonCheatSheet;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
public void cheat() {
    JOptionPane.showMessageDialog(null, "^\n" + "Start of string\n" +
            "\\A\n" + "Start of string\n" +
            "$\n" + "End of string\n" +
            "\\Z\n" +      "End of string\n" +
            "\\b\n" +  "Word boundary\n" +
            "\\B\n" +  "Not word boundary\n" +
            "\\<\n" +   "Start of word\n" +
            "\\>\n" +  "End of word");
}

    public void check(){
        Pattern p = Pattern.compile(textField.getText());
        Matcher m = p.matcher(textArea.getText());
        if (m.matches()){
            checkbox.setSelected(true);
            checkbox.setText("OK");
        }
        else {
            checkbox.setSelected(false);
            checkbox.setText("NG");
        }
    }
}
