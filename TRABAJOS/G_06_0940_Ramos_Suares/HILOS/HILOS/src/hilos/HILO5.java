package hilos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HILO5 extends Thread {
    
    @Override
    public void run()  //METODO RUN PARA EL HILO
    {
       try {
           String texto =" ";
           int numero1;
           int numero2;
           int resultado;
                System.out.println ("HILO 5 hace CALCULO5");
                
                String nombreFichero = "ARCHIVOS/CALCULO5.txt";
                //Declarar una variable BufferedReader
                BufferedReader br = null;
                
                //Crear un objeto BufferedReader al que se le pasa
                //   un objeto FileReader con el nombre del fichero
                br = new BufferedReader(new FileReader(nombreFichero));
                //Leer la primera línea, guardando en un String
                texto = br.readLine();
                //Repetir mientras no se llegue al final del fichero
                while(texto != null)
                {
               String[] array = texto.split(" ");
               numero1 = Integer.parseInt(array[0]);
               numero2 = Integer.parseInt(array[2]);
               
               
               if("*".equals(array[1]))//multiplicacion
               {
                 resultado = numero1*numero2;
                 System.out.println ("HILO 5 CALCULA : "+array[0]+"*"+array[2]+" = "+ resultado);
               }
               if("+".equals(array[1]))//suma
               {
                 resultado = numero1+numero2;
                 System.out.println ("HILO 5 CALCULA : "+array[0]+"+"+array[2]+" = "+ resultado);
               }
               if("-".equals(array[1]))//resta
               {
                 resultado = numero1-numero2;
                 System.out.println ("HILO 5 CALCULA : "+array[0]+"-"+array[2]+" = "+ resultado);
               }
               if("/".equals(array[1]))//división
               {
                 resultado = numero1/numero2;
                 System.out.println ("HILO 5 CALCULA : "+array[0]+"/"+array[2]+" = "+ resultado);
               }
               
               
                    texto = br.readLine();
                    //txt_vector.setText(texto);
                    
                    
                }} catch (FileNotFoundException ex) {
                Logger.getLogger(HILO2.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(HILO2.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }
        
}
