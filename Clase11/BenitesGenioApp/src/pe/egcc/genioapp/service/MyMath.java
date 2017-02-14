package pe.egcc.genioapp.service;

public final class MyMath {

  private MyMath() {
  }

  public static long factorial(int n) {
    long f = 1;
    while (n > 1) {
      f *= n--;
    }
    return f;
  }

  public static int mcd(int n1, int n2) {
    int mcd = 0;
    int a = Math.max(n1, n2);
    int b = Math.min(n1, n2);
    do {
      mcd = b;
      b = a % b;
      a = mcd;
    } while (b != 0);
    return mcd;
  }

  public static int mcm(int n1, int n2) {
    int mcm = 0;
    int a = Math.max(n1, n2);
    int b = Math.min(n1, n2);
    mcm = (a / mcd(a, b)) * b;
    return mcm;
  }

  public static int[] fibonacci(int n) {
    int[] repo = new int[n];
    repo[0] = 0;
    repo[1] = 1;
    for(int i=2; i < n; i++){
      repo[i] = repo[i-1] + repo[i-2];
    }
    return repo;
  }

  public static boolean esprimo(int n) {
    int contador = 2;
    boolean primo = true;
    while ((primo) && (contador != n)) {
      if (n % contador == 0) {
        primo = false;
      }
      contador++;
    }
    return primo;
  }
}
