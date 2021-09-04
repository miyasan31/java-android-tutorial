package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handleClickShort(View myButton) {
        Toast myToast = Toast.makeText(this,
                "You just touched! SHORT", Toast.LENGTH_SHORT);
        myToast.show();
    }
    public void handleClickLong(View myButton) {
        Toast myToast = Toast.makeText(this,
                "You just touched! LONG", Toast.LENGTH_LONG);
        myToast.show();
    }

}
