package sg.edu.rp.c346.id22016439.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class C206 extends AppCompatActivity {
    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c206);
        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCreds);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentReceived = getIntent();

        String code = intentReceived.getStringExtra("code");
        tvCode.setText("Module Code: " +code);

        String name = intentReceived.getStringExtra("name");
        tvCode.setText("Module Name: " +name);

        int year = intentReceived.getIntExtra("year", 0);
        tvYear.setText("Academic Year: " +year);

        int sem = intentReceived.getIntExtra("sem", 0);
        tvSem.setText("Academic Year: " +sem);

        int cred = intentReceived.getIntExtra("credit", 0);
        tvSem.setText("Credits: " +cred);

        String venue = intentReceived.getStringExtra("venue");
        tvCode.setText("Module Name: " +venue);
    }
}