package br.unigran.aulaatividade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Button b = findViewById(R.id.idVoltar);
       b.setText(
               getIntent().getStringExtra("title")
       );
    }
    public void voltar(View v){
        onBackPressed();
    }
}