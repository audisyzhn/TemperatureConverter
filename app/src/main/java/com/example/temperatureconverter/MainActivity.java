package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText txtCelcius;
    TextView txtKelvin, txtFr, txtReamure;
    protected float txtC, txtR, txtF, txtK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCelcius = (EditText) findViewById(R.id.txtCelcius);
        txtKelvin = (TextView) findViewById(R.id.txtKelvin);
        txtFr = (TextView) findViewById(R.id.txtFr);
        txtReamure = (TextView) findViewById(R.id.txtReamure);
        Button btnConvert = (Button) findViewById(R.id.btnConvert);
        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        txtC = Float.parseFloat(txtCelcius.getText().toString());

        if (view.getId() == R.id.btnConvert) {
            txtF = (txtC * 9/5) + 32;
            txtK = (txtC) + 273;
            txtR = (float) (0.8 * txtC);

            txtFr.setText(txtF + " ");
            txtKelvin.setText(txtK + " ");
            txtReamure.setText(txtR + " ");
        }
    }
}
