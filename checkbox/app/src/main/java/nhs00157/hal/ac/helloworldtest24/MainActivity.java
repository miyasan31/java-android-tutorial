package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.CheckBox;


public class MainActivity extends AppCompatActivity {
    private TextView _TextView;
    private int JavaCheck;
    private int EclipseCheck;
    private int AndroidCheck;
    private String checkMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView) findViewById(R.id.myTextView);
        JavaCheck = 0;
        EclipseCheck = 0;
        AndroidCheck = 0;
        checkMessage = "";
    }
    public void checkMethod(View myCheckBox) {
        CheckBox aCheckBox = (CheckBox)myCheckBox;
        String s = (String)aCheckBox.getText();
        if (s.equals("Java")){
            if (aCheckBox.isChecked()){
                JavaCheck = 1;
            }else{
                JavaCheck = 0;
            }
        }
        if (s.equals("Eclipse")){
            if (aCheckBox.isChecked()){
                EclipseCheck = 1;
            }else{
                EclipseCheck = 0;
            }
        }
        if (s.equals("Android")){
            if (aCheckBox.isChecked()){
                AndroidCheck = 1;
            }else{
                AndroidCheck = 0;
            }
        }
    }
    public void buttonMethod(View myButton) {
        if (JavaCheck == 1){
            checkMessage = "Java Checked\n";
        }else{
            checkMessage = "Java UnChecked\n";
        }
        if (EclipseCheck == 1){
            checkMessage = checkMessage + "Eclipse Checked\n";
        }else{
            checkMessage = checkMessage + "Eclipse UnChecked\n";
        }
        if (AndroidCheck == 1){
            checkMessage = checkMessage + "Android Checked";
        }else{
            checkMessage = checkMessage + "Android UnChecked";
        }
        _TextView.setText(checkMessage);
    }
}
