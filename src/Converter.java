
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Screen;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.TextInputDialog;
import java.awt.Dimension;
import java.awt.*;
import java.util.Optional;
import javax.swing.*;
import java.util.Scanner;


public class Converter extends Application {


   @Override
    public void start(Stage primaryStage) throws Exception {
       Rectangle2D PrimaryScreenBounds = Screen.getPrimary().getVisualBounds();


       //JOptionpane starts
       JOptionPane inputValue = new JOptionPane("Enter your height in Cm");
       inputValue.setWantsInput(true);
       JDialog inputDialog = new JDialog();
       inputDialog = inputValue.createDialog("Convert from Cm to Ft");
       inputDialog.setLocation(50, 100);
       inputDialog.setVisible(true);
       String inputHeight =(String) inputValue.getInputValue();


       //JOptionpane Math
       double heightCm = Double.parseDouble(inputHeight);
       double heightIn = heightCm*0.39;
       int heightFt = (int) heightIn/12;
       int heightInleft = (int) heightIn%12;
       //JOptionpane Output
       JOptionPane.showMessageDialog(null, "Your height is " + heightFt + "feet and" + heightInleft
               + "inches");

       //FX Starts
       TextInputDialog textInputDialog = new TextInputDialog("140.5");
       textInputDialog.setTitle("Converter");
       textInputDialog.setHeaderText("Cm to Ft");
       textInputDialog.setContentText("Enter height in Cm");
       textInputDialog.setX(600);
       textInputDialog.setY(10);
       Optional<String> result = textInputDialog.showAndWait();

       //FX Math
       double fxCM = Double.parseDouble(result.get());
       double fxIn = fxCM*0.39;
       int fxFt = (int)fxIn/12;
       int fxInLeft = (int)fxIn%12;

       //FX output
       Alert alert = new Alert(AlertType.INFORMATION);
       alert.setTitle("Height Conversion");
       alert.setContentText("Your height is " + fxFt + "feet and " + fxInLeft + "inches ");
       alert.setX(100);
       alert.setY(500);
       alert.show();






   }
}
