package com.g6.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.g6.changesizetext.ChangeSizeApplication;
import com.g6.changesizetext.R;
import com.g6.changesizetext.data.model.Message;
import com.g6.changesizetext.databinding.ActivityViewMessageBinding;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en ChangeSizeTextActivity.
 * Se configura el componente TextView con un texto y un tamaño de fuente.
 * @author Eliezer DR
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeProject";
    ActivityViewMessageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //1. Recoge Intent
        Intent intent = getIntent();
        //2.Recoge el mensage
        Message message = (Message) intent.getExtras().getSerializable("message");
        //3.Actualiza la vista
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());
        /*
        * Todas las Activity tienen acceso a la información de la clase
        * Apllication desde el método getAplication. Se debe realizar
         */
        Log.d(TAG,((ChangeSizeApplication)getApplication()).getUser().toString());
    }
}