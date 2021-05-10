package br.senai.sc.activity_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v){
        EditText editText1 = findViewById(R.id.et_text_1);
        EditText editText2 = findViewById(R.id.et_text_2);
        Toast.makeText( MainActivity.this, editText1.getText() + " " + editText2.getText(), Toast.LENGTH_LONG).show();
    }

    public void onClickBtnApagar(View v){
        EditText editText1 = findViewById(R.id.et_text_1);
        editText1.setText("");
        EditText editText2 = findViewById(R.id.et_text_2);
        editText2.setText("");
    }
}