package com.s.d.a.a.conceitodeanimacao_apipropertyanimation;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.AnimacaoAlpha;
import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.AnimacaoRotate;
import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.AnimacaoScale;
import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.AnimacaoTranslate;
import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.ConceitoAnimatorSet;
import com.s.d.a.a.conceitodeanimacao_apipropertyanimation.animacoes.ConceitoValueAnimator;

public class MainActivity extends ListActivity {

    private static final String[] ops = new String[] {
            "Alpha - ValueAnimator",
            "Alpha - ObjectAnimator",
            "Rotate - ObjectAnimator",
            "Scale - ObjectAnimator",
            "Translate - ObjectAnimator",
            "AnimatorSet",
            "AnimationListener",
            "Sair" };
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        int layout = android.R.layout.simple_list_item_1;
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, layout,ops);
        this.setListAdapter(adaptador);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, ConceitoValueAnimator.class));
                break;
            case 1:
                startActivity(new Intent(this, AnimacaoAlpha.class));
                break;
            case 2:
                startActivity(new Intent(this, AnimacaoRotate.class));
                break;
            case 3:
                startActivity(new Intent(this, AnimacaoScale.class));
                break;
            case 4:
                startActivity(new Intent(this,  AnimacaoTranslate.class));
                break;
            case 5:
                startActivity(new Intent(this, ConceitoAnimatorSet.class));
                break;
            case 6:
                //startActivity(new Intent(this, ExemploAnimatorListenerApagarTela.class));
                break;
            default:
                finish();
        }
    }
}
