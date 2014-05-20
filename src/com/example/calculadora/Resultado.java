package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Resultado extends Activity {

	private TextView txtResultado;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad_2);	
		
		txtResultado = (TextView) findViewById(R.id.txtResultado);
		
		Bundle parametros = getIntent().getExtras();
		String numero1 = parametros.getString("numero1");
		String numero2 = parametros.getString("numero2");
		
		StringBuilder sb = new StringBuilder();
		sb.append(txtResultado.getText());
		sb.append("\n" + numero1 + " y " + numero2 + " es: " + 
				(Integer.parseInt(numero1) + Integer.parseInt(numero2)));
		txtResultado.setText(sb.toString());
		
		(findViewById(R.id.btnRegresar)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
	}//Fin OnCreate
	
}//Fin class Resultado
