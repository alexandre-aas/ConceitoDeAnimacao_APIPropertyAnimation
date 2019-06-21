package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class AnimatorListenerApagarTela extends Activity implements View.OnClickListener {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button btOk = findViewById(R.id.btLogin);
        btOk.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // Simular login aqui... Se login ok, aplicar a animação e trocar de tela
        final ViewGroup layout = findViewById(R.id.layLogin);
        ValueAnimator animacao = ObjectAnimator.ofFloat(layout, "alpha", 1f, 0f);
        animacao.setDuration(2000);
        animacao.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                finish();
            }
        });
        animacao.start();
    }
}
