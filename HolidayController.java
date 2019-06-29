package operateScreen;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class HolidayController implements Initializable {

    @FXML
    //location and resources will be automatically injected by the FXML loader
    private URL location;

    @FXML
    private ResourceBundle resources;

    //Public no-args constructor
    @FXML
    private void initialize(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private TextField dayOfTheWeek;

    @FXML
    private TextField holidayDay;

    @FXML
    private TextField holidayMonth;

    @FXML
    private TextField holidayYear;

    @FXML
    private Button upDayOfWeek;

    @FXML
    private Button downDayOfWeek;

    @FXML
    private Button upHolidayDay;

    @FXML
    private Button downHolidayDay;

    @FXML
    private Button upHolidayMonth;

    @FXML
    private Button downHolidayMonth;

    @FXML
    private Button upHolidayYear;

    @FXML
    private Button downHolidayYear;

    @FXML
    private Button upCurrentSetting;

    @FXML
    private Button downCurrentSetting;

    @FXML
    private Button holidaySave;

    @FXML
    private Button holidayReset;

    @FXML
    private Button holidayOperate;

    @FXML
    private TextField currentSetting;

    @FXML
    private String currentTemp = "72.0";

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


}
