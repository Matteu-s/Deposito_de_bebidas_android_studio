package com.mateussantosti.protocolodearromba;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity{
    // EditText ed1,ed2; Comentario porque nao consegui fazer a caixa, se conseguir so apagar  o comentario
    Button b1 , b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
// Lembrar de colocar o edtText da caixa de teste e sincronizar com o ed1 e ed2 acima Ta na aula 3
//         no caso ed1 = findViewById(R.id.(valor que colocar, pode ser user, usario, tanto faz));
//         mesma coisa aqui ed2 = findViewById(R.id(valor));

        b1 = findViewById(R.id.btnl);
        b2 = findViewById(R.id.btnl);


        b2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();

            }
        });


    }

    public void Login(){
//        String user = ed1.getText() .toString(); Tirar do comentario quando resolver os de cima
//        String pass = ed2.getText() .toString(); Tirar do comentario quando resolver os de cima
//               if(user.equals("")|| pass.equals("")){
//               Toast.makeText( context this, text "Digite as Informações Corretas", Toast.LENGHT_SHORT).show();

//        }else_if(user.equals="Joao")&& pass.equals("123")}{
//         Toast.makeText( context this, text"Seja Bem Vindo", Toast.LENGHT_SHORT).show();
//        }else{
//              Toast.makeTexte(context thias, text"Login ou senha incorreto", Toast.LENGHT_SHORT).show();
//    comentado porque nao fiz essa parte, nao consegui no layout, mas a parte de codigo é pra bater
    }
}
