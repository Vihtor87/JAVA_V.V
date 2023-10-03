/*
 * Написать программу, определяющую правильность расстановки скобок в выражении.
 * Пример 1: a+(d*3) - истина
 * Пример 2: [a+(1*3) - ложь
 * Пример 3: [6+(3*3)] - истина
 * Пример 4: {a}[+]{(d*3)} - истина
 * Пример 5: <{a}+{(d*3)}> - истина
 * Пример 6: {a+]}{(d*3)} - ложь
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class task2Brackets {
    public static void main(String[] args) {
        String str1 = "a+(d*3)";
        String str2 = "[a+(1*3)";
        String str3 = "[6+(3*3)]";
        String str4 = "{a}[+]{(d*3)}";
        String str5 = "<{a}+{(d*3)}>";
        String str6 = "{a+]}{(d*3)}";

        System.out.println(checkBracket(str1));
        System.out.println(checkBracket(str2));
        System.out.println(checkBracket(str3));
        System.out.println(checkBracket(str4));
        System.out.println(checkBracket(str5));
        System.out.println(checkBracket(str6));

    }

    public static Map<Character, Character> brackets() {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');
        return map;        
    }

    public static boolean checkBracket(String str) {
        Map<Character, Character> map = brackets();
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (map.containsValue(ch)) {
                stack.push(ch);
            } else if (map.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != map.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
