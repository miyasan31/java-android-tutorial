package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{
    private TextView _TextView;
    private EditText _mainEditText;
    private EditText _subEditText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView)findViewById(R.id.myTextView);
        _mainEditText = (EditText)findViewById(R.id.mainEditText);
        _subEditText = (EditText)findViewById(R.id.subEditText);
    }

    public void handleClick(View myButton) {
        String main = _mainEditText.getText().toString();
        String sub = _subEditText.getText().toString();
        String text = main + sub;
        _TextView.setText(text);
        _mainEditText.getEditableText().clear();
        _subEditText.getEditableText().clear();
    }

}
