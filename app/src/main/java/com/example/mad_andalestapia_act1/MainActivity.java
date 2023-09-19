package com.example.mad_andalestapia_act1;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button increase;
    private Button decrease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);

        decrease.setOnClickListener(view -> {
            float currentSize=text.getTextSize();
            float newSize= currentSize - 2;
            text.setTextSize(newSize);
        });
        increase.setOnClickListener(view -> {
            float currentSize = text.getTextSize();
            float newSize=currentSize + 2;
            text.setTextSize(newSize);
        });

    }
}