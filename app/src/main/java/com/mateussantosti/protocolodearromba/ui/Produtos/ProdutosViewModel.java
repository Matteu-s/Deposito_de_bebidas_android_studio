package com.mateussantosti.protocolodearromba.ui.Produtos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProdutosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProdutosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}