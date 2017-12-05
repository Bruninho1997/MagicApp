package com.example.bruno.magicar;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResposta;

    double fundo=55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text2 = "Por : Bruno Henrique";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text2, duration);
        toast.show();
        MudarFundo2();
        limpar2();

    }


    public void MudarFundo(View view) {
        MudarFundo2();

    }


    public void MudarFundo2() {


        //this.finish();
        double numero = Math.random() * 5;
        double valorAleatorio = Math.round(numero);

        View view;
        view = findViewById(R.id.principal);

        if (fundo>10) {
            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==5)
        {
            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==4)
        {

            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==3)
        {

            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==2)
        {

            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==1)
        {

            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundopreto);
            }
            fundo = valorAleatorio;
        }

        if (fundo==0)
        {

            if (valorAleatorio == 1) {
                view.setBackgroundResource(R.drawable.fundoazul);
            }
            if (valorAleatorio == 2) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            if (valorAleatorio == 3) {
                view.setBackgroundResource(R.drawable.fundovermelho);
            }
            if (valorAleatorio == 4) {
                view.setBackgroundResource(R.drawable.fundolaranja);
            }
            if (valorAleatorio == 5) {
                view.setBackgroundResource(R.drawable.fundomarrom);
            }
            if (valorAleatorio == 0) {
                view.setBackgroundResource(R.drawable.fundoverde);
            }
            fundo = valorAleatorio;
        }

        //Context context = getApplicationContext();
        //CharSequence text = ""+ valorAleatorio;
        //int duration = Toast.LENGTH_SHORT;
        //Toast toast = Toast.makeText(context, text, duration);
        //toast.show();

    }


    public void limpar(View view) {


        limpar2();

    }

    public void limpar2() {
        String text = "Pergunte algo sobre o futuro";

        txtResposta = (TextView) findViewById(R.id.txtresposta);
        txtResposta.setText(String.format(text));


    }

    public void GerarResposta(View view) {
        int k;
        //for (k=0; k<900; k++)
            GerarResposta2();
    }

    public void GerarResposta2()
    {
        String text = " ";
        int x;
        txtResposta = (TextView) findViewById(R.id.txtresposta);
        txtResposta.setText(String.format(text));
        for (x = 0; x <= 1570; x++) {

            double numero = Math.random() * 19;
            double valorAleatorio = Math.round(numero);

            if (valorAleatorio == 1) {
                text = "Certamente!";
                //txtResposta.setText(String.format("a"));
            }
            if (valorAleatorio == 2) {
                text = "Sem dúvida!";
                //txtResposta.setText(String.format("b"));
            }

            if (valorAleatorio == 3) {
                text = "Definitivamente sim!";
                //txtResposta.setText(String.format("c"));
            }

            if (valorAleatorio == 4) {
                text = "Pode contar com isso!";
                //txtResposta.setText(String.format("d"));
            }

            if (valorAleatorio == 5) {
                text = "Como eu vejo, sim!";
                //txtResposta.setText(String.format("e"));
            }

            if (valorAleatorio == 0) {
                text = "Provavelmente!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 6) {
                text = "Boa perspectiva! ";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 7) {
                text = "Os sinais indicam que sim";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 8) {
                text = "Sim!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 9) {
                text = "Pergunte de novo mais tarde!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 10) {
                text = "Pergunte novamente!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 11) {
                text = "Melhor não lhe dizer agora!";
                //txtResposta.setText(String.format("f"));
            }
            if (valorAleatorio == 12) {
                text = "Não posso prever agora!";
                //txtResposta.setText(String.format("f"));
            }
            if (valorAleatorio == 13) {
                text = "Calma, pergunte novamente!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 14) {
                text = "Não conte com isso!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 15) {
                text = "Minha resposta é NÃO!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 16) {
                text = "Minhas fontes dizem não!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 17) {
                text = "A perspectiva não é boa!";
                //txtResposta.setText(String.format("f"));
            }

            if (valorAleatorio == 18) {
                text = "Muito incerto!";
                //txtResposta.setText(String.format("f"));
            }






            txtResposta.setText(String.format(text));


        }

    }

}
