package hilos;

public class HILOS {

    public static void main(String[] args) {
        
        
        HILO1 mihilo1 = new HILO1();
        HILO2 mihilo2 = new HILO2();
        HILO3 mihilo3 = new HILO3();
        HILO4 mihilo4 = new HILO4();
        HILO5 mihilo5 = new HILO5();
        
        mihilo1.start(); //inicia hilo1
        mihilo2.start(); //inicia hilo2
        mihilo3.start(); //inicia hilo2
        mihilo4.start(); //inicia hilo2
        mihilo5.start(); //inicia hilo2
        
    }
   
}
