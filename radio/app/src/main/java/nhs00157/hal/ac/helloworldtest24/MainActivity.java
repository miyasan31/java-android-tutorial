package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity{
    private TextView _TextView;
    private TextView _TextView1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView)findViewById(R.id.myTextView);
        _TextView1 = (TextView)findViewById(R.id.myTextView1);
    }

    public void radioMethod(View myRadioButton) {
        RadioButton _RadioButton = (RadioButton)myRadioButton;
        String s = (String)_RadioButton.getText();
        _TextView.setText(String.format("%s Selected", s));
    }


    public void radioMethod1(View myRadioButton) {
        RadioButton _RadioButton = (RadioButton)myRadioButton;
        String s = (String)_RadioButton.getText();
        _TextView1.setText(String.format("%s Selected", s));
    }

}
