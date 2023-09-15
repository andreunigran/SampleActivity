package br.unigran.aulaatividade;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

TextUtils.
    setContentView(R.layout.activity_main);
    }

    ActivityResultLauncher <Intent>chamaActivity
            = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    if(result.getResultCode()==RESULT_OK){
                    ((Button)findViewById(R.id.idProximo)).setText(
                           data.getStringExtra("retorno"));
                    }
                }
            });
    public void proximo(View v) {
        Intent it = new Intent(MainActivity.this, SegundaActivity.class);
        // Intent it = new Intent( MediaStore.ACTION_IMAGE_CAPTURE);
        it.putExtra("title", "titulo");
        chamaActivity.launch(it);

    }

   }