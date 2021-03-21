package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GreeterActivity extends AppCompatActivity {


    EditText nameField;
    Button saveButton;

    static final String NAME_KEY = "name_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeter);

        nameField = findViewById(R.id.name_field);
        saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameField.getText().toString();

                Intent intent = new Intent(GreeterActivity.this, IntentActivity.class);
                intent.putExtra(NAME_KEY, name);
                startActivity(intent);

            }
        });
    }
}