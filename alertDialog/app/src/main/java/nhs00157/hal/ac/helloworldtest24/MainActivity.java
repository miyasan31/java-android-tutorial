package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity{
    private TextView _TextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _TextView = (TextView)findViewById(R.id.myTextView);
    }

    public void handleClick(View myButton) {
        AlertDialog.Builder myBuilder = new AlertDialog.Builder(this);
        myBuilder.setTitle("My Alert Dialog");
        myBuilder.setMessage("Are you really sure?");
        MyListener listener = new MyListener();
        myBuilder.setPositiveButton("Yes", listener);
        myBuilder.setNeutralButton("Maybe", listener);
        myBuilder.setNegativeButton("No", listener);
        myBuilder.setCancelable(true);
        AlertDialog myAlertDialog = myBuilder.create();
        myAlertDialog.show();
    }


    public class MyListener
    implements android.content.DialogInterface.OnClickListener {
        public void onClick(DialogInterface v, int i) {
            _TextView.setText(String.format("You selected %d", i));
        }
    }

}
