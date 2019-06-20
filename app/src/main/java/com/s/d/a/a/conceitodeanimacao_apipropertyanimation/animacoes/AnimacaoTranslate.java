package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class AnimacaoTranslate extends Activity {
    private boolean flag = true;
    private ObjectAnimator objAnimator;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        ObjectAnimator a = (ObjectAnimator) AnimatorInflater.loadAnimator(this,R.animator.mover_baixo);
        a.setTarget(img);
        animar(a);
    }
    public void onClickAnimarAPI(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        objAnimator = ObjectAnimator.ofFloat(img, "y", img.getHeight()/2, img.getHeight() * 2);
        animar(objAnimator);
    }
    private void animar(ObjectAnimator anim) {
        anim.setDuration(2000);
        if (flag) {
            anim.start();
        } else {
            // Apenas reverte a animação
            anim.reverse();
        }
        // Inverte o flag para na próxima vez utilizar a animação inversa
        flag = !flag;
    }
}
