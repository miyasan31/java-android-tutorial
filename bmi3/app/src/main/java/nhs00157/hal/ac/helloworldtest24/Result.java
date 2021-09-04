package nhs00157.hal.ac.helloworldtest24;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class Result extends AppCompatActivity {

    private TextView resultTextView;
    private TextView judgeTextView;
    private TextView goodTextView;
    private TextView indexTextView;

    float bmiInt;
    String bmiStr;

    float kaupFloat;
    String kaupStr;
    int age;

    float rohereFloat;
    String rohereStr;

    float goodInt;
    String goodStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        resultTextView = (TextView)findViewById(R.id.result_value);
        judgeTextView = (TextView)findViewById(R.id.result_judge);
        goodTextView = (TextView)findViewById(R.id.good_weight);
        indexTextView = (TextView)findViewById(R.id.result_index);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            age = extras.getInt("AGE");

            bmiInt = extras.getFloat("BMI");
            goodInt = extras.getFloat("GOODWEIGHT");

            kaupFloat = extras.getFloat("KAUP");

            rohereFloat = extras.getFloat("ROHERE");

            if(age <= 5){
                kpMethod();
            }else if(age <= 15){
                rohMethod();
            }else{
                peroperoMethod();
            }
        }
    }

    public void kpMethod(){
        indexTextView.setText(R.string.result_msg2);

        if(age < 1){
            if (kaupFloat < 16){
                judgeTextView.setText(R.string.result_judge_0);
            }else if(kaupFloat < 18){
                judgeTextView.setText(R.string.result_judge_1);
            }else {
                judgeTextView.setText(R.string.result_judge_2);
            }
        }else if(age < 2){
            if (kaupFloat < 15.5){
                judgeTextView.setText(R.string.result_judge_0);
            }else if(kaupFloat < 17.5){
                judgeTextView.setText(R.string.result_judge_1);
            }else {
                judgeTextView.setText(R.string.result_judge_2);
            }
        }else if(age < 3){
            if (kaupFloat < 15){
                judgeTextView.setText(R.string.result_judge_0);
            }else if(kaupFloat < 17){
                judgeTextView.setText(R.string.result_judge_1);
            }else {
                judgeTextView.setText(R.string.result_judge_2);
            }
        }else{
            if (kaupFloat < 14.5){
                judgeTextView.setText(R.string.result_judge_0);
            }else if(kaupFloat < 16.5){
                judgeTextView.setText(R.string.result_judge_1);
            }else {
                judgeTextView.setText(R.string.result_judge_2);
            }
        }

        kaupStr = String.format("%.5f",kaupFloat);
        resultTextView.setText(kaupStr);

    }

    public void rohMethod(){
        indexTextView.setText(R.string.result_msg3);

        if (rohereFloat < 115){
            judgeTextView.setText(R.string.result_judge_0);
        }else if(rohereFloat < 145){
            judgeTextView.setText(R.string.result_judge_1);
        }else {
            judgeTextView.setText(R.string.result_judge_2);
        }

        rohereStr = String.format("%.5f",rohereFloat);
        resultTextView.setText(rohereStr);
    }

    public void peroperoMethod() {
        indexTextView.setText(R.string.result_msg);

        if(bmiInt < 18.5){
            judgeTextView.setText(R.string.result_judge_0);
        }else if(bmiInt < 25.0) {
            judgeTextView.setText(R.string.result_judge_1);
        }else{
            judgeTextView.setText(R.string.result_judge_2);
        }

        bmiStr = String.format("%.5f",bmiInt);
        resultTextView.setText(bmiStr);

        goodStr = String.format("%.5f",goodInt);
        goodTextView.setText(goodStr);

    }

    public void buttonMethod(View btn_reset){
        Intent reset_act = new Intent(Result.this, MainActivity.class);
        startActivity(reset_act);
    }
}