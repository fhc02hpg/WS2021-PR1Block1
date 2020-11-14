public class ArithmetischeOperatoren {

  public static void main(String[] args) {
    int a = 14;
    int b = 7;
    {
      System.out.println("a = " + a + ",b = " + b);
      //System.out.println("a = 9,b = 5");
      int result = a + b;
      System.out.println(a + " + " + b + " = " + result);
      result = a - b;
      System.out.println(a + " - " + b + " = " + result);
      System.out.println(a + " * " + b + " = " + (a * b));
      System.out.println(a + " / " + b + " = " + (a / b));
      System.out.println(a + " % " + b + " = " + (a % b));
      int x = 0;
      System.out.println(x);
    }
    char x = 'x';
    System.out.println(x);

    int n1 = 10;
    int n2 = 5;

    int n3 = n1++;
    //n1 = 11;
    System.out.println(n3);
    System.out.println(n1);

    n3 = --n2;




  }

  //...

}
