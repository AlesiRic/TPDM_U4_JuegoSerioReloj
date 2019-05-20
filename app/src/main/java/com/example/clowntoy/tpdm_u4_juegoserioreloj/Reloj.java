package com.example.clowntoy.tpdm_u4_juegoserioreloj;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Reloj {
    int minutos,horas,angMin,angHor;
    public Reloj(){
        minutos=(int)(Math.random()*12);
        horas=(int)((Math.random()*12)+1);

        switch(horas){
            case 0:angHor=270;break;
            case 1:angHor=300;break;
            case 2:angHor=330;break;
            case 3:angHor=0;break;
            case 4:angHor=30;break;
            case 5:angHor=60;break;
            case 6:angHor=90;break;
            case 7:angHor=120;break;
            case 8:angHor=150;break;
            case 9:angHor=180;break;
            case 10:angHor=210;break;
            case 11:angHor=240;break;
            default:angHor=0;break;
        }

        switch(minutos){
            case 0:minutos=0;angMin=270;angHor=angHor+0;break;
            case 1:minutos=5;angMin=300;angHor=angHor+2;break;
            case 2:minutos=10;angMin=330;angHor=angHor+5;break;
            case 3:minutos=15;angMin=0;angHor=angHor+7;break;
            case 4:minutos=20;angMin=30;angHor=angHor+10;break;
            case 5:minutos=25;angMin=60;angHor=angHor+12;break;
            case 6:minutos=30;angMin=90;angHor=angHor+15;break;
            case 7:minutos=35;angMin=120;angHor=angHor+17;break;
            case 8:minutos=40;angMin=150;angHor=angHor+20;break;
            case 9:minutos=45;angMin=180;angHor=angHor+22;break;
            case 10:minutos=50;angMin=210;angHor=angHor+25;break;
            case 11:minutos=55;angMin=240;angHor=angHor+27;break;
            default:minutos=0;angMin=0;angHor=angHor+0;break;
        }





    }

    public void pintarReloj(Canvas c,Paint p,int x,int y){



//Reloj cuerpo
        p.setColor(Color.WHITE);

        c.drawOval(x,y,x+700,y+700,p);
        p.setStrokeWidth(7);
//Indicador de minutos
        p.setColor(Color.GRAY);

        int xcenter=x+350;
        int ycenter=y+350;
        for(int i=0;i<360;i=i+30){
            double radAng=Math.toRadians(i);
            double xPunt=Math.cos(radAng);
            double yPunt=Math.sin(radAng);
            xPunt=xPunt*310;
            yPunt=yPunt*310;
            c.drawLine((float)(xcenter+xPunt)
                    ,(float)(ycenter+yPunt)
                    ,(float)(xcenter+xPunt+(20*Math.cos(radAng)))
                    ,(float)(ycenter+yPunt+(20*Math.sin(radAng))),p);
        }
//marco de reloj
        p.setStyle(Paint.Style.STROKE);
        p.setColor(Color.RED);
        c.drawOval(x,y,x+700,y+700,p);

        //numeros 12, 3, 6 y 9

        p.setColor(Color.GREEN);
        p.setTextSize(100);
        p.setStyle(Paint.Style.FILL_AND_STROKE);
        c.drawText("12",x+290,y+120,p);
        c.drawText("3",x+600,y+390,p);
        c.drawText("9",x+50,y+390,p);
        c.drawText("6",x+320,y+640,p);

        //minutero
        p.setColor(Color.BLACK);
        double radMin=Math.toRadians(angMin);
        double xFin=Math.cos(radMin);
        double yFin=Math.sin(radMin);
        xFin=xFin*300;
        yFin=yFin*300;
        c.drawLine(x+350,y+350,(float)(x+350+xFin),
                (float)(y+350+yFin),p);

        //manecilla de horas

        double radHor=Math.toRadians(angHor);
        double xFin2=Math.cos(radHor);
        double yFin2=Math.sin(radHor);
        xFin2=xFin2*150;
        yFin2=yFin2*150;
        c.drawLine(x+350,y+350,(float)(x+350+xFin2),
                (float)(y+350+yFin2),p);

        //circulo central de manecillas

        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.FILL);
        c.drawOval(x+335,y+335,x+365,y+365,p);
        p.setStyle(Paint.Style.STROKE);



    }

    public int getMinutos(){
        return minutos;
    }

    public int getHoras(){
        return horas;
    }

}
