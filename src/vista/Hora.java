/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 * Cálulo de la hora en tiempo real haciendo uso de la clase Thread
 * @author admin
 */
public class Hora extends Thread {

    private final JLabel lbl;
    //Creación de instancia para el formato de la hora
    Calendar calendar = GregorianCalendar.getInstance();
    
    //Condición para el cálculo de AM_PM
    String amPm = calendar.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";

    /**
     * Método constructor
     * @param lbl Hora que se establecerá en la GUI
     */
    public Hora(JLabel lbl) {
        this.lbl = lbl;
    }
    
    
    /**
     * Método run para el hilo del tiempo
     */
    @Override
    public void run(){
        //Establecimiento de la hora
        calendar.roll(Calendar.HOUR, 0);
        while(true){
            Date date = new Date();
            //HORA
            SimpleDateFormat sdf1 = new SimpleDateFormat("hh:");
            //MINUTOS y SEGUNDOS
            SimpleDateFormat sdf2 = new SimpleDateFormat("mm:ss");
            //Escribir hora en la etiqueta recibida por el constructor
            lbl.setText(sdf1.format(calendar.getTime())+sdf2.format(date)+" "+amPm);
            
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){}
        }
    }
}
