package cn.huaming;

public class TypeTransTest {

  public static void main(String[] args) {
    String s = "ff,xx";
    String num = "11,22";
    String kk = "11,dsljfd";
    String one = ",11";

    String[] split = one.split(",");
    System.out.println(split);

    Double value = Double.valueOf(s);

  }

}
