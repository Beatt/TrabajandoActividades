package com.example.calculadora;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	private EditText edtTxtNumero1, edtTxtNumero2;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		edtTxtNumero1 = (EditText) findViewById(R.id.edtxtNumero1);
		edtTxtNumero2 = (EditText) findViewById(R.id.edtxtNumero2);
		
		(findViewById(R.id.btnEnviar)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Resultado.class);
				intent.putExtra("numero1", edtTxtNumero1.getText().toString());
				intent.putExtra("numero2", edtTxtNumero2.getText().toString());
				startActivity(intent);
			}
			
		});
		
	}//Fin onCreate
	
}// Fin class MainActivity