package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.DatePicker;
import android.app.DatePickerDialog;


public class MainActivity extends AppCompatActivity{
    private TextView _TextView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView)findViewById(R.id.myTextView);
    }


    public void handleClick(View myButton) {
        MyListener listener = new MyListener();
        DatePickerDialog myDPDialog = new DatePickerDialog(this, listener, 2021, 6, 18);
        myDPDialog.show();
    }

    public class MyListener
        implements DatePickerDialog.OnDateSetListener {
        public void onDateSet(DatePicker v,int year, int month, int day) {
            _TextView.setText(String.format("Year=%d, Month=%d, Day=%d", year, month, day));
        }
    }
}
