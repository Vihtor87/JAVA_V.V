/*
 * Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
 * Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task3Stake {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 3, 7};
        addStakeFillPrint(array);
        addQueuePrint(array);
        
    }

    public static void addStakeFillPrint(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(stack);
    }

    public static void addQueuePrint (int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        System.out.println(queue);
    }
}
