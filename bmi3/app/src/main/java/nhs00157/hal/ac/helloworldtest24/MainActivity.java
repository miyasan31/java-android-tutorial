package nhs00157.hal.ac.helloworldtest24;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    private EditText heightEditText;
    private EditText weightEditText;
    private EditText ageEditText;

    float heightInt;
    float weightInt;

    float bmiInt;
    String bmiStr;

    float waweight;
    float rweight;
    String rweightStr;

    int age;

    float kaupFloat;
    String kaupString;
    float rohereFloat;
    String rohereStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightEditText = (EditText)findViewById(R.id.edit_height);
        weightEditText = (EditText)findViewById(R.id.edit_weight);
        ageEditText = (EditText)findViewById(R.id.edit_age);
    }

    public void buttonMethod(View btn_calc) {
        heightInt = Float.parseFloat(heightEditText.getText().toString());
        weightInt = Float.parseFloat(weightEditText.getText().toString());
        age = Integer.parseInt(ageEditText.getText().toString());
        if(age <= 5){
            kaupMethod();
            Intent result_act = new Intent(MainActivity.this, Result.class);
            result_act.putExtra("KAUP", kaupFloat);
            result_act.putExtra("AGE", age);
            startActivity(result_act);
        }else if(age <=15){
            rohereMethod();
            Intent result_act = new Intent(MainActivity.this, Result.class);
            result_act.putExtra("ROHERE", rohereFloat);
            result_act.putExtra("AGE", age);
            startActivity(result_act);
        }else{
            bmiMethod();
            Intent result_act = new Intent(MainActivity.this, Result.class);
            result_act.putExtra("BMI", bmiInt);
            result_act.putExtra("GOODWEIGHT", rweight);
            result_act.putExtra("AGE", age);
            startActivity(result_act);
        }
    }

    public void kaupMethod(){
        heightInt = heightInt / 100;
        float heightintdub = heightInt * heightInt;
        kaupFloat = weightInt / heightintdub;
        kaupString = String.format("%.5f", kaupFloat);
    }

    public void rohereMethod(){
        heightInt = heightInt / 100;
        float heightinttri = heightInt * heightInt * heightInt;
        rohereFloat = weightInt / heightinttri * 10;
        rohereStr = String.format("%.5f", rohereFloat);
    }

    public void bmiMethod() {
        heightInt = heightInt / 100;
        float heightintdub = heightInt * heightInt;
        bmiInt = weightInt / heightintdub;
        bmiStr = String.format("%.5f",bmiInt);

        waweight = heightInt * heightInt * 22;
        rweight = waweight - weightInt;
        rweightStr = String.format("%.5f",rweight);

    }
}
