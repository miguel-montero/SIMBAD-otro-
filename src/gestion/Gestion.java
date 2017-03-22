/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

/**
 *
 * @author Miguel
 */
import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.concurrent.TimeUnit;


public class Gestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException, ParseException {
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese N");
        int n=Integer.parseInt(lector.readLine());
        System.out.println("Ingrese M");
        int m=Integer.parseInt(lector.readLine());
        
        //System.out.println(n);
        //System.out.println(m);
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        
        System.out.println("Ingrese primera fecha en formato dd mm aaaa");
        String inputString1=lector.readLine();
        System.out.println("Ingrese segunda fecha en formato dd mm aaaa");
        String inputString2=lector.readLine();

        
        try {
        Date date1 = myFormat.parse(inputString1);
        Date date2 = myFormat.parse(inputString2);
        long diff = date2.getTime() - date1.getTime();
        System.out.println ("Has vivido: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
        } catch (ParseException e) {
         e.printStackTrace();
        }
        
      
  
        
       
       // reporteUnificado reporte = new reporteUnificado(n,m);
    }
    
}
