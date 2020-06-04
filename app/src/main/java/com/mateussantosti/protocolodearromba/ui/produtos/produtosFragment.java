package com.mateussantosti.protocolodearromba.ui.produtos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.mateussantosti.protocolodearromba.R;

public class ProdutosFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
                ViewModelProviders.of(this).get(ProdutosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_produtos, container, false);
        return root;
    }
}

class produtoRefrigerante extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_produtos);
    }
    public void proximaTela(View view){
        Intent intent = new Intent(this, produtoRefrigerante.class);
        startActivity(intent);
    }
}