package sg.edu.rp.c346.id22016439.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    Button btnPassInteger;
    Button btnPassChar;
    TextView btnPassDoub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //Event handling Step 2
            btnPassInteger = findViewById(R.id.buttonPassInt);
            btnPassChar = findViewById(R.id.buttonPassCha);
            btnPassDoub = findViewById(R.id.buttonPassDouble);

            //Event handling Step 3
            btnPassInteger.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, SecondAvtivity.class);
                    intent.putExtra("value", 1);
                    startActivity(intent);
                }
            });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassDoub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        }
}