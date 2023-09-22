/*
 *  Дано четное число N (>0) и символы c1 и c2.
 * Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
 */
public class task1 {

    public static void main(String[] args) {

        long s = System.currentTimeMillis();

        String result = charsStr(1000, 'A', 'B');
        System.out.println(result);
        String resultSb = charsStrSb(1000, 'B', 'A');
        System.out.println(resultSb);

        System.out.println(System.currentTimeMillis() - s);
    }

    public static String charsStr(int len, char c1, char c2) {
        String res = "";
        for (int i = 0; i < len / 2; i++) {
            res += Character.toString(c1) + Character.toString(c2);
        }
        return res;
    }

    public static String charsStrSb(int len, char c1, char c2) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len / 2; i++) {
            res.append(c1);
            res.append(c2);
        }
        return res.toString();
    }
}
