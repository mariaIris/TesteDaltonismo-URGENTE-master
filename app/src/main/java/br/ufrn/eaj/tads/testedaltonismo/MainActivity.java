package br.ufrn.eaj.tads.testedaltonismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 1);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void onClick2(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 2);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void onClick3(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();
        params.putInt("imagem", 3);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void verifica(View v){
        Intent intent = new Intent(MainActivity.this, TesteActivity.class);
        Bundle params = new Bundle();

        int resposta1 = 0, resposta2 = 0, resposta3 = 0;
        TextView  resultado;
        if (resposta1==0 || resposta2 ==0 || resposta3==0){
            Toast.makeText( MainActivity.this, "REALIZE O TESTE",Toast.LENGTH_LONG ).show();
        }else{
            resultado = (TextView) findViewById( R.id.resultado);
            resposta1 = Integer.valueOf( resultado.getText().toString());
            resposta2 = Integer.valueOf( resultado.getText().toString() );
            resposta3 = Integer.valueOf(resultado.getText().toString());

            if(resposta1 == 2 && resposta2 == 29 && resposta3 == 74){
                resultado.setText("Visão Normal!");
            }else{
                resultado.setText( "Procure o mais rápido possivel um OFTOMOLOGISTA!" );
            }
        }

    }


    public void onActitivyResult(int requestCode, int resultCode, Intent intent){
        if(requestCode == 1)
            if(resultCode == RESULT_OK){
                TextView textView5_res_1 = findViewById( R.id.textView5_res_1 );
                textView5_res_1.setText( intent.getStringExtra("digite") );
        }else if(requestCode == 2){
            if(resultCode == RESULT_OK) {
                TextView Resposta_2 = findViewById( R.id.textView6_res_2 );
                Resposta_2.setText( intent.getStringExtra( "digite" ) );

            }else {
                if(resultCode == RESULT_OK) {
                TextView Resposta_3 = findViewById( R.id.textView7_res_3 );
                Resposta_3.setText( intent.getStringExtra( "digite" ) );

                }
            }
        }
    }
}