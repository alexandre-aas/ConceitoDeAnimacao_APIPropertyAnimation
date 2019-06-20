package com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.R;

public class ConceitoAnimatorSet extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacao_layout);
    }
    public void onClickAnimarXML(View view) {
        ImageView img = findViewById(R.id.img);
        AnimatorSet lista = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.animator_set);
        lista.setTarget(img);
        animar(lista);
    }
    public void onClickAnimarAPI(View view) {
        ImageView img = (ImageView) findViewById(R.id.img);
        float y = img.getY();
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(img, "alpha", 1f, 0f);
        ObjectAnimator translateAnim = ObjectAnimator.ofFloat(img, "y", y, img.getHeight()*2);
        // Fazemos o reverse manual aqui
        alphaAnim.setRepeatCount(1);
        alphaAnim.setRepeatMode(Animation.REVERSE);
        translateAnim.setRepeatCount(1);
        translateAnim.setRepeatMode(Animation.REVERSE);
        AnimatorSet lista = new AnimatorSet();
        lista.playTogether(translateAnim, alphaAnim);
        animar(lista);
    }
    private void animar(AnimatorSet lista) {
        lista.setDuration(2000);
        lista.start();
    }
}
