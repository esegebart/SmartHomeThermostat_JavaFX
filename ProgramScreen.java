package operateScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ProgramScreen implements Initializable {

    @FXML
    public ComboBox timeOfDay;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeOfDay.getItems().removeAll(timeOfDay.getItems());
        timeOfDay.getItems().addAll("12:00am", "1:00am", "2:00am", "3:00am", "4:00am", "5:00am", "6:00am",
                "7:00am", "8:00am", "9:00am", "10:00am", "11:00am", "12:00pm", "1:00pm", "2:00pm", "3:00pm",
                "4:00pm", "5:00pm", "6:00pm", "7:00pm", "8:00pm", "9:00pm", "10:00pm", "11:00pm");
    }

    @FXML
    //location and resources will be automatically injected by the FXML loader
    private URL location;

    @FXML
    private ResourceBundle resources;

    //Public no-args constructor
    @FXML
    private void initialize(){

    }

    //declare variables for Program Screen GUI
    //initialize a variable to use for temp setting displayed on screen
    @FXML
    private TextField currentSetting;

    @FXML
    private String currentTemp = "72.0";

    @FXML
    private Button upCurrentSetting;

    @FXML
    private Button downCurrentSetting;

    @FXML
    private Button saveButton;

    @FXML
    private DatePicker dayOfWeek;

    @FXML
    private Button resetButton;

    @FXML
    private Button upDayOfWeek;

    @FXML
    private Button downDayOfWeek;

    @FXML
    private Button upTimeOfDay;

    @FXML
    private Button downTimeOfDay;


    //use event handler or up down button
    //increment double current by one/decrement by one
    //convert ct to string and assign to current temp
    //current setting append text with current temp
    //access the textfield by using the textfield name dot setText()
    //use && to determine the max and min
    @FXML
    private void changeCurrent(ActionEvent event){

        //parse current temp to double
        double ct = Double.parseDouble(currentTemp);

        if(event.getSource() == upCurrentSetting && ct < 90){
            ct++;
            currentTemp = String.valueOf(ct);
            currentSetting.setText(currentTemp);

        } else if(event.getSource() == downCurrentSetting && ct > 50){
            ct--;
            currentTemp = String.valueOf(ct);
            currentSetting.setText(currentTemp);
        }
    }

    @FXML
    public void printSettings(ActionEvent event){
        LocalDate date = dayOfWeek.getValue();
        System.out.println(date);

        System.out.println(timeOfDay.getValue());

        System.out.println(currentTemp);

    }

    @FXML
    private void changeHoliday(ActionEvent event) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();

            //Path to FXML file
            String fxmlDocPath = "C:\\Users\\elyse\\IdeaProjects\\U5A1_OperateScreen\\src\\operateScreen\\Holiday.fxml";

            FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

            //Create the Pane and all the details
            Pane root = (Pane) fxmlLoader.load(fxmlStream);

            Stage stage = new Stage();
            stage.setScene(new Scene(root, 1280, 800));
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
