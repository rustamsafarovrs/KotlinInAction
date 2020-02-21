/**
 * @author Rustam Safarov(RS)
 * created at 21.02.2020
 */
public class test {
    public static void main(String[] args) {
        String[] a = "12.345-6.А".split(".");
        for (String s : a) {
            System.out.println(s);
        }
    }

}
