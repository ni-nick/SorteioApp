package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal;
    TextView textViewresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = findViewById(R.id.editTextinicial);
        editTextfinal = findViewById(R.id.editTextfinal);
        textViewresultado = findViewById(R.id.textViewresultados);
    }

    public void sortear(View view) {

        Button button = (Button) view;
        button.setText("Sorteado");

        int inicial = Integer.parseInt(editTextinicial.getText().toString());
        int fim = Integer.parseInt(editTextfinal.getText().toString());


        Random rand = new Random();
            int numsortidos = rand.nextInt((fim - inicial) + 1) + inicial;
            textViewresultado.setText(Integer.toString(numsortidos));



    }
}