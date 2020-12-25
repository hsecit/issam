package tech.hsecit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Enterprise extends AppCompatActivity {

    Spinner sexe ,age,abbones,category,situation_familial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterprise);
        sexe = findViewById(R.id.spinner1);
        age = findViewById(R.id.spinner2);
        abbones= findViewById(R.id.spinner3);
        category = findViewById(R.id.spinner4);
        situation_familial = findViewById(R.id.spinner5);

        String[] items1 ={"Sexe", "Home","Femme"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        sexe.setAdapter(adapter1);


        String[] items2 ={"Age" , "18-25","26-30","31-50"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        age.setAdapter(adapter2);


        String[] items3 ={ "nbr Abonnee" , "10K-100K","100K-500K","500K-1M"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        abbones.setAdapter(adapter3);


        String[] items4 ={"categories" , "Beauty","Modals"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        category.setAdapter(adapter4);


        String[] items5 ={"situation familiallle" , "celebataire","mariee"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
        situation_familial.setAdapter(adapter5);




    }
}