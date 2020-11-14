public class MethodDemo {

  public static String buildWeatherText(String weather, String emotion) {
    String result = "Today it is "+weather+" "+emotion;

    //...

    return result;
  }

  public static void main(String[] args) {
    String output = buildWeatherText("sunny",":) :)");
    System.out.println(output);
    System.out.println(buildWeatherText("rainy",":-("));

    String w = "windy";
    String e = ":-|";
    System.out.println(buildWeatherText(w,e));
  }

}
