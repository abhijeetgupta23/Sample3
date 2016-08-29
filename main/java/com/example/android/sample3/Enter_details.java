package com.example.android.sample3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;


public class Enter_details extends AppCompatActivity {

    ArrayList<String> namelist0 = new ArrayList();
    ArrayList<String> namelist1 = new ArrayList();
    ArrayList<String> namelist2 = new ArrayList();

    ArrayList<String> namelist3 = new ArrayList();

    ArrayList<String> namelist4 = new ArrayList();

    ArrayList<String> namelist5 = new ArrayList();





    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_details);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"Business Developers", "Content Writers", "App Developers","Web Developers","Graphic Designers","Social Media Managers"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        com.rengwuxian.materialedittext.MaterialEditText n = (com.rengwuxian.materialedittext.MaterialEditText) findViewById(R.id.name);
        String dept = dropdown.getSelectedItem().toString();

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent main = new Intent(Enter_details.this, MainActivity.class);

                // Start the new activity
                startActivity(main);
            }
        } );
    }



}

