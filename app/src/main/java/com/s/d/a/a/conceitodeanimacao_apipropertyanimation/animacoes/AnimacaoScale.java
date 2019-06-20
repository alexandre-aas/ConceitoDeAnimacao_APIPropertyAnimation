package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class AnimacaoScale extends Activity {
    private boolean flag = true;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View view) {
        onClickAnimarAPI(view);
    }
    public void onClickAnimarAPI(View view) {
        ImageView img = findViewById(R.id.img);
        PropertyValuesHolder anim1 = PropertyValuesHolder.ofFloat("scaleX", 1, 0);
        PropertyValuesHolder anim2 = PropertyValuesHolder.ofFloat("scaleY", 1, 0);
        ObjectAnimator a = ObjectAnimator.ofPropertyValuesHolder(img, anim1, anim2);
        animar(a);
    }
    private void animar(ObjectAnimator anim) {
        anim.setDuration(2000);
        if(flag) {
            anim.start();
        } else {
            // Apenas reverte a animação
            anim.reverse();
        }
        // Inverte o flag para na próxima vez utilizar a animação inversa
        flag = !flag;
    }
}
