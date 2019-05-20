package com.example.clowntoy.tpdm_u4_juegoserioreloj;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Pantalla extends View {

    Reloj r;
    BotonSeleccion[] opcion;

    public Pantalla(Context context) {
        super(context);
        r=new Reloj();
        opcion=new BotonSeleccion[3];
        int opcionCorrecta=(int)Math.random()*3;
        for (int i=0;i<3;i++){
            if(i==opcionCorrecta){
                opcion[i]=new BotonSeleccion(r.getMinutos(),r.getHoras(),i);
            }else{
                opcion[i]=new BotonSeleccion(i);
            }
        }
    }


    public void onDraw(Canvas c){
        Paint p=new Paint();
        r.pintarReloj(c,p,200,200);
        p.setColor(Color.BLACK);
        p.setStyle(Paint.Style.FILL_AND_STROKE);
        p.setTextSize(100);
        c.drawText("Puntaje: ",50,100,p);
        int y=1000;
        for(int i=0;i<3;i++){
            opcion[i].dibujarBoton(c,p,200,y);
            y=y+200;
        }

    }

}
