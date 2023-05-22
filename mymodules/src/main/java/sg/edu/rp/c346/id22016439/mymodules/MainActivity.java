package sg.edu.rp.c346.id22016439.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346pass;
    TextView c206pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346pass = findViewById(R.id.c346tv);
        c206pass = findViewById(R.id.c206tv);

        c346pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C346.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

        c206pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, C206.class);
                intent.putExtra("code", "C206");
                intent.putExtra("name", "SoftWare Development");
                intent.putExtra("year", "2020");
                intent.putExtra("semester", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("venue", "E63A");
                startActivity(intent);
            }
        });

    }
}