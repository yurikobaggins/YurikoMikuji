package com.yurikobaggins.yurikomikuji;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Random random = new Random();
        String unsei = "";
        switch (random.nextInt(5)) {
            case 0:
                unsei = "大吉";
                break;
            case 1:
                unsei = "吉";
                break;
            case 2:
                unsei = "中吉";
                break;
            case 3:
                unsei = "小吉";
                break;
            case 4:
                unsei = "末吉";
                break;
            case 5:
                unsei = "凶";
                break;

        }

        TextView unseiTextView = findViewById(R.id.unseiTextView);

        unseiTextView.setText(unsei);

    }
}
