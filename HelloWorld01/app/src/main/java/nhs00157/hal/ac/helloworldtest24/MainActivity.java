package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private TextView aTextView;
    int count;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aTextView = (TextView)findViewById(R.id.myTextView);
        aTextView.setText("Push myButton");
    }

    public void handlePlusClick(View plusBottun) {
        count++;
        aTextView.setText(String.format("Pushed %d times", count));
    }

    public void handleMinusClick(View minusButton) {
        count--;
        aTextView.setText(String.format("Pushed %d times", count));
    }

}