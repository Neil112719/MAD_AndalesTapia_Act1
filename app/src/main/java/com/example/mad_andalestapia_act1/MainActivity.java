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
                ContextCompat.getColor(this,R.color.blue),
                ContextCompat.getColor(this,R.color.yellow),
                ContextCompat.getColor(this,R.color.black),
                ContextCompat.getColor(this,R.color.light_coral),
                ContextCompat.getColor(this,R.color._light_green),
                ContextCompat.getColor(this,R.color.dark_red),
                ContextCompat.getColor(this,R.color.dark_orange),
                ContextCompat.getColor(this,R.color.khaki),
                ContextCompat.getColor(this,R.color.brown),
                ContextCompat.getColor(this,R.color.purple),
                
        };

        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextSize(30);
            }
        });
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setTextSize(60);
            }
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