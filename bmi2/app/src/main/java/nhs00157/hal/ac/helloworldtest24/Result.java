package nhs00157.hal.ac.helloworldtest24;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


public class Result extends AppCompatActivity {

    private TextView resultTextView;
    private TextView judgeTextView;
    private TextView goodTextView;
    private TextView justTextView;
    float bmiInt;
    String bmiStr;
    float goodInt;
    String goodStr;
    float justInt;
    String justStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        resultTextView = (TextView)findViewById(R.id.result_value);
        judgeTextView = (TextView)findViewById(R.id.result_judge);
        goodTextView = (TextView)findViewById(R.id.good_weight);
        justTextView = (TextView)findViewById(R.id.just_weight);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            bmiInt = extras.getFloat("BMI");
            goodInt = extras.getFloat("GOODWEIGHT");
            justInt = extras.getFloat("JUSTWEIGHT");
            handleJudgeMethod();
        }
    }

    public void handleJudgeMethod() {
        if(bmiInt < 18.5){
            judgeTextView.setText(R.string.result_judge_0);
        }else if(bmiInt < 25.0) {
            judgeTextView.setText(R.string.result_judge_1);
        }else{
            judgeTextView.setText(R.string.result_judge_2);
        }

        bmiStr = String.format("%.5f",bmiInt);
        resultTextView.setText(bmiStr);

        justStr = String.format("%.5f",justInt);
        justTextView.setText(justStr);

        goodStr = String.format("%.5f",goodInt);
//        goodTextView.setText(goodStr);

        if (goodInt >= 0) {
            goodTextView.setText("標準体重まであと ： +" + goodStr);
        } else {
            goodTextView.setText("標準体重まであと ： " + goodStr);
        }

    }

    public void buttonMethod(View btn_reset){
        Intent reset_act = new Intent(Result.this, MainActivity.class);
        startActivity(reset_act);
    }
}

