package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class AnimacaoAlpha extends Activity {
    private boolean visivel = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View view) {
        ImageView img = findViewById(R.id.img);
        ObjectAnimator a = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.fade_out);
        a.setTarget(img);
        animar(a);
    }
    public void onClickAnimarAPI(View view) {
        ImageView img = findViewById(R.id.img);
        ObjectAnimator a = ObjectAnimator.ofFloat(img, "alpha", 1f, 0f);
        animar(a);
    }
    private void animar(ObjectAnimator anim) {
        anim.setDuration(2000);
        if(visivel) {
            anim.start();
        } else {
            // Apenas reverte a animação
            anim.reverse();
        }
        // Inverte o flag para na próxima vez utilizar a animação inversa
        visivel = !visivel;
    }
}
