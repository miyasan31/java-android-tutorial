package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity{
    private TextView _TextView;
    private TextView _TextView1;
    private String checkMessage;
    private String checkMessage1;
    private int Android;
    private int BlackBerry;
    private int iPhone;
    private int Google;
    private int Microsoft;
    private int Apple;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView)findViewById(R.id.myTextView);
        _TextView1 = (TextView)findViewById(R.id.myTextView1);
        Android = 0;
        BlackBerry = 0;
        iPhone = 0;
        Google = 0;
        Microsoft = 0;
        Apple = 0;
        checkMessage = "";
        checkMessage1 = "";
    }

    public void radioMethod(View myRadioButton) {
        RadioButton _RadioButton = (RadioButton)myRadioButton;
        String s = (String)_RadioButton.getText();
        if (s.equals("Android")){
            Android = 1;
            BlackBerry = 0;
            iPhone = 0;
        }
        if (s.equals("BlackBerry")){
            Android = 0;
            BlackBerry = 1;
            iPhone = 0;
        }
        if (s.equals("iPhone")){
            Android = 0;
            BlackBerry = 0;
            iPhone = 1;
        }
    }

    public void radioMethod1(View myRadioButton) {
        RadioButton _RadioButton = (RadioButton)myRadioButton;
        String s = (String)_RadioButton.getText();
        if (s.equals("Google")){
            Google = 1;
            Microsoft = 0;
            Apple = 0;
        }
        if (s.equals("Microsoft")){
            Google = 0;
            Microsoft = 1;
            Apple = 0;
        }
        if (s.equals("Apple")){
            Google = 0;
            Microsoft = 0;
            Apple = 1;
        }
    }

    public void handleClick(View myButton) {
        checkMessage = "";
        checkMessage1 = "";
        if (Android == 0 && BlackBerry == 0 && iPhone == 0){
            checkMessage = "non selected";
        }
        if (Google == 0 && Microsoft == 0 && Apple == 0) {
            checkMessage1 = "non selected";
        }
        if (Android == 1){
            checkMessage = "Android Checked";
        }
        else if (BlackBerry == 1){
            checkMessage = checkMessage + "BlackBerry Checked";
        }
        else if (iPhone == 1){
            checkMessage = checkMessage + "iPhone Checked";
        }
        if (Google == 1){
            checkMessage1 = "Google Checked";
        }
        else if (Microsoft == 1){
            checkMessage1 = checkMessage1 + "Microsoft Checked";
        }
        else if (Apple == 1){
            checkMessage1 = checkMessage1 + "Apple Checked";
        }
        _TextView.setText(checkMessage);
        _TextView1.setText(checkMessage1);
    }

}
