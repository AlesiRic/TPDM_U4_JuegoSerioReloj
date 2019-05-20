package com.example.clowntoy.tpdm_u4_juegoserioreloj;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class BotonSeleccion {
    int minutos,horas,colorBg,colorText,top,bottom,left,right;

    String etiqueta;

    public BotonSeleccion(int color){
        minutos=horas=(int)((Math.random()*12)+1);
        switch(minutos){
            case 1:minutos=0;etiqueta=horas+":00";break;
            case 2:minutos=5;etiqueta=horas+":05";break;
            case 3:minutos=10;etiqueta=horas+":10";break;
            case 4:minutos=15;etiqueta=horas+":15";break;
            case 5:minutos=20;etiqueta=horas+":20";break;
            case 6:minutos=25;etiqueta=horas+":25";break;
            case 7:minutos=30;etiqueta=horas+":30";break;
            case 8:minutos=35;etiqueta=horas+":35";break;
            case 9:minutos=40;etiqueta=horas+":40";break;
            case 10:minutos=45;etiqueta=horas+":45";break;
            case 11:minutos=50;etiqueta=horas+":50";break;
            case 12:minutos=55;etiqueta=horas+":55";break;
            default:minutos=0;etiqueta=horas+":00";break;
        }
        switch(color){
            case 0:colorBg=Color.RED;colorText=Color.CYAN;break;
            case 1:colorBg=Color.BLUE;colorText=Color.YELLOW;break;
            case 3:colorBg=Color.GREEN;colorText=Color.MAGENTA;break;
            default:colorBg=Color.RED;colorText=Color.CYAN;break;
        }
    }
    public BotonSeleccion(int min,int hor,int color){
        minutos=min;
        horas=hor;
        switch(color){
            case 0:colorBg=Color.RED;colorText=Color.CYAN;break;
            case 1:colorBg=Color.BLUE;colorText=Color.YELLOW;break;
            case 3:colorBg=Color.GREEN;colorText=Color.MAGENTA;break;
            default:colorBg=Color.RED;colorText=Color.CYAN;break;
        }
    }

    public void dibujarBoton(Canvas c,Paint p,int x,int y){
        p.setColor(colorBg);
        p.setStyle(Paint.Style.FILL_AND_STROKE);
        c.drawRect(x,y,x+300,y+100,p);
        left=x;right=x+300;top=y;bottom=y+100;
        p.setColor(colorText);
        p.setTextSize(80);
        c.drawText(etiqueta,x+10,y+10,p);
    }

    public boolean isSelected(int x,int y){
        if(x>=left && x<=right){
            if(y>=top && y<=bottom){
                return true;
            }
        }
        return false;
    }

    public int getHora(){
        return horas;
    }

    public int getMinutos(){
        return minutos;
    }


}
