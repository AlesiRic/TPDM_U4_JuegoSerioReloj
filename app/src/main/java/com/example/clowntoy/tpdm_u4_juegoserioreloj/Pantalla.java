package com.example.clowntoy.tpdm_u4_juegoserioreloj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Pantalla extends View {

    public Pantalla(Context context) {
        super(context);
    }


    public void onDraw(Canvas c){
        Paint p=new Paint();
        Reloj r=new Reloj();
        r.pintarReloj(c,p,200,200);
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.FILL_AND_STROKE);
        p.setTextSize(100);
        c.drawText("Puntaje: ",50,100,p);
    }

}
