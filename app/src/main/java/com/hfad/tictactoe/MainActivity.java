package com.hfad.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onSubmit(View view) {
        Intent intent = new Intent(this, PlayGame.class);
        EditText nameText = (EditText) findViewById(R.id.name);
        String username = nameText.getText().toString();
        intent.putExtra(EXTRA_NAME, username);
        startActivity(intent);
    }
}