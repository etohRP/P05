package sg.edu.rp.c346.id22016439.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

TextView Q1;
TextView Q2;
Button RevealQ1;
Button RevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Q1 = findViewById(R.id.textViewQ1);
        Q2 = findViewById(R.id.textViewQ2);
        RevealQ1 = findViewById(R.id.buttonRevealQ1);
        RevealQ2 = findViewById(R.id.buttonRevealQ2);

        RevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"This word has the same pronunciation even after removing 4 letters from it",Toast.LENGTH_LONG).show();
            }
        });

        RevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this,"How do you make 1 disappear?",Toast.LENGTH_LONG).show();
            }
        });
    }
}