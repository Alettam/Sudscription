package com.example.sudscription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick(View view) {
        TextView textView = findViewById(R.id.textView5);
        TextView textViewLogin = findViewById(R.id.LabelForLogin);
        TextView textViewEmail = findViewById(R.id.LabelForEmail);
        textView.setText("Подписка на рассылку успешно оформлена для пользователя " + textViewLogin.getText() +
                " на электронный адрес " + textViewEmail.getText());
        textView.setVisibility(1);
    }

    public void clean(View view) {
        TextView textViewLogin = findViewById(R.id.LabelForLogin);
        textViewLogin.setText("");
        TextView textViewEmail = findViewById(R.id.LabelForEmail);
        textViewEmail.setText("");


    }
}
