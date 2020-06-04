package com.mateussantosti.protocolodearromba.ui.produtos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.mateussantosti.protocolodearromba.R;

public class produtosFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
                ViewModelProviders.of(this).get(produtosViewModel.class);
        View root = inflater.inflate(R.layout.fragment_produtos, container, false);
        return root;
    }

}

