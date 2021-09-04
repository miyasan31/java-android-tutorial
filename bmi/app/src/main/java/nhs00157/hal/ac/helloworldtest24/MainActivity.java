package nhs00157.hal.ac.helloworldtest24;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText heightEditText;
    private EditText weightEditText;
    private TextView resultTextView;
    private TextView judgeTextView;
    private TextView justTextView;
    private TextView differenceTextView;
    float heightInt;
    float _heightInt;
    float weightInt;
    float bmiInt;
    String bmiStr;
    String justWeightStr;
    String differenceWeightStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightEditText = (EditText)findViewById(R.id.edit_height);
        weightEditText = (EditText)findViewById(R.id.edit_weight);
        resultTextView = (TextView)findViewById(R.id.result_value);
        judgeTextView = (TextView)findViewById(R.id.result_judge);
        justTextView = (TextView)findViewById(R.id.just_weight);
        differenceTextView = (TextView)findViewById(R.id.difference_weight);

    }

    public void buttonMethod(View btn_calc) {
        heightInt = Float.parseFloat(heightEditText.getText().toString());
        weightInt = Float.parseFloat(weightEditText.getText().toString());

        _heightInt = heightInt / 100;
        bmiMethod();
        justWeightMethod();
    }

    public void bmiMethod() {
        float heightintW = _heightInt * _heightInt;
        bmiInt = weightInt / heightintW;
        bmiStr = String.format("%.5f",bmiInt);
        resultTextView.setText("BMI　：　" + bmiStr);

        if (bmiInt < 18.5) {
            judgeTextView.setText(R.string.result_judge_0);
        } else if (bmiInt < 25.0) {
            judgeTextView.setText(R.string.result_judge_1);
        } else {
            judgeTextView.setText(R.string.result_judge_2);
        }
    }

    public void justWeightMethod() {
        float justWeight = _heightInt * _heightInt * 22;
        justWeightStr = String.format("%.5f",justWeight);
        justTextView.setText("標準体重　：　" + justWeightStr);

        float differenceWeight = justWeight - weightInt;
        differenceWeightStr = String.format("%.5f",differenceWeight);
        if (differenceWeight >= 0) {
            differenceTextView.setText("標準体重まであと ： +" + differenceWeightStr);
        } else {
            differenceTextView.setText("標準体重まであと ： -" + differenceWeightStr);
        }
    }
}