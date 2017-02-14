
package pe.egcc.genioapp.controller;

import pe.egcc.genioapp.service.MyMath;

public class GenioController {

    public long factorial(int num) {
        return MyMath.factorial(num);
    }
    
    public int[] fibonacci(int num1) {
        return MyMath.fibonacci(num1);
    }
    public boolean esprimo(int num1) {
        return MyMath.esprimo(num1);
    }
    public int mcd(int num1,int num2) {
        return MyMath.mcd(num1,num2);
    }   
    public int mcm(int n1, int n2) {
        return MyMath.mcm(n1,n2);
    }
}
