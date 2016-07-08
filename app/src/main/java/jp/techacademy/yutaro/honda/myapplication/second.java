package jp.techacademy.yutaro.honda.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        double data1 = intent.getDoubleExtra("VALUE1", 0.0);
        double data2 = intent.getDoubleExtra("VALUE2", 0.0);
        int type = intent.getIntExtra("TYPE", 1);

        TextView textView = (TextView) findViewById(R.id.textView);

        if (type == 1) {
            textView.setText(String.valueOf(data1 + data2));
        } else if (type == 2) {
            textView.setText(String.valueOf(data1 - data2));
        } else if (type == 3) {
            textView.setText(String.valueOf(data1 * data2));
        } else if (type == 4)
            textView.setText(String.valueOf(data1 / data2));

    }
}