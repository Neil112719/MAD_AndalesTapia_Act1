package com.example.mad_andalestapia_act1;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private Button increase;
    private Button decrease;
    private Button color;
    private int currentColorIndex=0;
    private int[] colorArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);
        color = findViewById(R.id.color);
        colorArray = new int[]{
                ContextCompat.getColor(this,R.color.purple_200),
                ContextCompat.getColor(this,R.color.purple_500),
                ContextCompat.getColor(this,R.color.teal_200),
        };

        decrease.setOnClickListener(view -> {
            text.setTextSize(20);
        });
        increase.setOnClickListener(view -> {
            text.setTextSize(40);
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentColorIndex = (currentColorIndex + 1) % colorArray.length;
                text.setTextColor(colorArray[currentColorIndex]);
            }
        });
    }
}