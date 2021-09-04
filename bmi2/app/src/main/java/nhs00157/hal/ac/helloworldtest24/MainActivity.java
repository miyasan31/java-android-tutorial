package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText heightEditText;
    private EditText weightEditText;

    float heightInt;
    float weightInt;

    float bmiInt;
    String bmiStr;


    float justbmiInt;
    String justbmiStr;

    float waweight;
    float rweight;
    String rweightStr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightEditText = (EditText)findViewById(R.id.edit_height);
        weightEditText = (EditText)findViewById(R.id.edit_weight);
    }

    public void buttonMethod(View btn_calc) {
        heightInt = Float.parseFloat(heightEditText.getText().toString());
        weightInt = Float.parseFloat(weightEditText.getText().toString());
        bmiMethod();

        Intent result_act = new Intent(MainActivity.this, Result.class);
        result_act.putExtra("BMI", bmiInt);
        result_act.putExtra("JUSTWEIGHT", waweight);
        result_act.putExtra("GOODWEIGHT", rweight);
        startActivity(result_act);
    }

    public void bmiMethod() {
        heightInt = heightInt / 100;
        float heightIntdub = heightInt * heightInt;
        bmiInt = weightInt / heightIntdub;
        bmiStr = String.format("%.5f",bmiInt);


        waweight = heightInt * heightInt * 22;
        rweight = waweight - weightInt;
        rweightStr = String.format("%.5f",rweight);

    }
}
