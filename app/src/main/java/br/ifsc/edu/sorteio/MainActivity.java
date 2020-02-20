package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

        int inicial = Integer.parseInt(editTextinicial.getText().toString());

        textViewresultado.setText(Integer.toString(inicial));
    }
}
