public class Distance {

  public static double km2Landmiles(double km) {
    double miles = km * 0.6214;
    return miles;
  }

  /*public static void km2LandmilesOutput(double km) {
    double miles = km * 0.6214;
  }*/

  public static double landmiles2km(double lm) {
    return lm / 0.6214;
  }

  public static void main(String[] args) {

    double km1 = 100;
    double m1 = km2Landmiles(km1);
    System.out.println(km1 + " KM sind "+m1+ " Landmeilen");
    System.out.println(km1 + " KM sind "+km2Landmiles(km1)+ " Landmeilen");

    double m2 = 0.6214;
    double km2 = landmiles2km(m2);
    System.out.println(m2+ " Landmeilen sind "+km2+ " KM");

    boolean km1GreaterKm2 = km1 > km2;
    System.out.println(km1GreaterKm2);
    boolean km2GreaterKm1 = km2 > km1;
    System.out.println(km2GreaterKm1);

    boolean result = km1GreaterKm2 || km2GreaterKm1 && km1 == km2;



    int a = 100;
    int b = 100;

    String s1 = new String("ich bin text");
    String s2 = new String("ich bin text");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));








  }



}
