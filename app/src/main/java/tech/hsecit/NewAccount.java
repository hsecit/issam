package tech.hsecit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewAccount extends AppCompatActivity {

    Button entr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        entr = findViewById(R.id.entrepriseBtn);

        entr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewAccount.this,Enterprise.class);
                startActivity(intent);
            }
        });
    }
}