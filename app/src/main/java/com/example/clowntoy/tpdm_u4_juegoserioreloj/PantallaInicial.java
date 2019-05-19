package com.example.clowntoy.tpdm_u4_juegoserioreloj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class PantallaInicial extends View {

    public PantallaInicial(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas c) {
        Paint p=new Paint();
        p.setColor(Color.BLUE);
        p.setTextSize(40);
        c.drawText("TIME OUT!!",(float)(getWidth()*0.15),(float)(getHeight()*0.55),p);
        p.setColor(Color.GRAY);
        p.setTextSize(20);
        c.drawText("Toque para iniciar",(float)(getWidth()*0.1),(float)(getHeight()*0.8),p);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()){
            case MotionEvent.ACTION_DOWN:return true;
            default:break;
        }
        return false;
    }
}
