
package principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;


public class Hora extends Thread{
    private JLabel lbl;

    public Hora(JLabel lbl) {
        this.lbl = lbl;
    }
    
    public void run(){
        while(true){
            Date hoy = new Date();
            SimpleDateFormat a = new SimpleDateFormat("hh:mm:ss");
            lbl.setText(a.format(hoy));
            try{sleep(1000);}
            
            catch(Exception ex){
            }
        }
    }
    
   
          
    
}
