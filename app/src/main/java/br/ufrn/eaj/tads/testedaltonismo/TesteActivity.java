package br.ufrn.eaj.tads.testedaltonismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class TesteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        Bundle params = getIntent().getExtras();
        int imagem = params.getInt("imagem");
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        if(imagem == 1) {
            imageView.setImageResource(R.drawable.teste1);
        }else if (imagem == 2){
            imageView.setImageResource(R.drawable.teste2);
        } else{
            imageView.setImageResource(R.drawable.teste3);
        }

    }

    public void button_ok(View v){
        EditText resposta = (EditText) findViewById( R.id.resposta);
        String digite = resposta.getText().toString();
        Intent intent = new Intent( ) ;
        intent.putExtra( "digite", digite);
        setResult( RESULT_OK, intent );
        finish();

    }

    public void button_cancela(View v){
        setResult(RESULT_CANCELED, null);
        finish();
    }
}
