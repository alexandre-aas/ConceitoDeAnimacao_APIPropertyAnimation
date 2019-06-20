package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class ConceitoValueAnimator extends Activity {
    private boolean visivel = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View view) {
        final ImageView img = findViewById(R.id.img);
        // Animação genérica de 1 até 0
        ValueAnimator a = (ValueAnimator) AnimatorInflater.loadAnimator(this,R.animator.animator_1_para_0);
        a.setTarget(img);
        a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                // Fica ouvindo os valores durante a animação
                Float valor = (Float) animation.getAnimatedValue();
                // Altera o alpha
                img.setAlpha(valor);
            }
        });
        animar(a);
    }
    public void onClickAnimarAPI(View view) {
        final ImageView img = (ImageView) findViewById(R.id.img);
        // Animação genérica de 1 até 0
        ValueAnimator a = ValueAnimator.ofFloat(1, 0);
        a.setTarget(img);
        a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator animation) {
                // Fica ouvindo os valores durante a animação
                Float valor = (Float) animation.getAnimatedValue();
                // Altera o alpha
                img.setAlpha(valor);
            }
        });
        animar(a);
    }
    private void animar(ValueAnimator anim) {
        anim.setDuration(2000);
        if (visivel) {
            anim.start();
        } else {
            // Apenas reverte a animação
            anim.reverse();
        }
        // Inverte o flag para na próxima vez utilizar a animação inversa
        visivel = !visivel;
    }
}
