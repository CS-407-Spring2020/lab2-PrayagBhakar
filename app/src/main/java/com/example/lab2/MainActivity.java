package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void cickFxn(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        Double dollars = Double.parseDouble(myTextField.getText().toString());

        // 1 dollar = 0.77 pounds
        Double pounds = dollars * 0.77;

        goToActivity2(pounds);

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void goToActivity2(Double d) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("pounds", d);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
