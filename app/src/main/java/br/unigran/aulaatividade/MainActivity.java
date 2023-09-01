package br.unigran.aulaatividade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void proximo(View v){
        Intent it = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        it.putExtra("title","titulo");
        startActivity(it);
    }
}