import java.io.IOException;

public class OperationWithInt {
    public static String multiplication(String a, String b) throws IOException {
        try {
            Main.num = b;
            int q = Integer.parseInt(a);
            if (q < 0 && q > 10) {
                throw new IOException("Введено значение не по условию, 0<int<10");
            }
            for (int i = 0; i < q; i++) {
                Main.num = Main.num + b;
                i++;
            }
        }
        catch (NumberFormatException e) {

            throw new NumberFormatException("Введено значение не по условию, второй аргумент должен быть int");

        }
        return Main.num;
    }


    public static String division(String a, String b) throws IOException {

        try {
            int q = Integer.parseInt(a);
            int length = b.length();
            if (length < 0 && length > 10) {
                throw new IOException("Введено значение не по условию, 0<int<10");
            }

            int rez = length / q;
            Main.num = b.substring(0, rez);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Введено значение не по условию, второй аргумент должен быть int");


        }

        return Main.num;
    }


    public static String addition(String a, String b) {
        Main.num = a + b;
        return Main.num;
    }


    public static String subtraction(String a, String b) {
        Main.num = a.replace(b, "");
        return Main.num;
    }
}
