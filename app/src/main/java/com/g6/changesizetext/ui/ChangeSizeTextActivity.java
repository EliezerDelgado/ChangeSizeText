package com.g6.changesizetext.ui;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.g6.changesizetext.ChangeSizeApplication;
import com.g6.changesizetext.data.model.Message;
import com.g6.changesizetext.databinding.ActivityChangeSizeTextBinding;

import java.io.Serializable;

/**
 * Clase que pide al usuario un texto y un tamaño mediante el componente SeekBar.
 * Despues se inicializa un TextView @see {@link ViewMessageActivity#onCreate(Bundle)}
 */
public class ChangeSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeProject";
    ActivityChangeSizeTextBinding binding;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ChangeSizeTextActivity -> onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ChangeSizeTextActivity -> onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ChangeSizeTextActivity -> onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ChangeSizeTextActivity -> onResume()");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangeSizeTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btSend.setOnClickListener(view -> {
           //1. Crear objeto Bundle
           Bundle bundle = new Bundle();
           //2. Añadir mensaje al Bundle
            Message message = new Message(((ChangeSizeApplication)getApplication()).getUser(),binding.edMessage.getText().toString(),binding.skSige.getProgress());
            bundle.putSerializable("message", message);
            //3.Enviar Intent con el Bundle
            Intent intent = new Intent(this,ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
        Log.d(TAG,"ChangeSizeTextActivity -> onCreate()");
    }
}