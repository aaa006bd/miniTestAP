package uni.kiel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] test = "Hello Kiel University Java Mini Test".split(" ");
        QuickSort.sort(test);
        System.out.println(Arrays.toString(test));
        LinkedList newList = fromArray(test);
        System.out.println(newList.toString());
        String[] arrFromList = newList.toArray();
        for (String x:
             arrFromList) {
            System.out.println(x);
        }
        newList.addSorted("Ops");
        System.out.println(newList.toString());

        System.out.println(menu());
        System.out.println("\n Enter an option: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

    }
    public static String menu(){
        String menu = "1. Sort array Elements (Insertion Sort/ quick Sort)\n" +
                "2. Array to Linked List\n" +
                "3. Linked List to Array\n" +
                "4. Sortedly Insert a value in Linked List\n" +
                "5. Delete a value from Linked list (Delete anyone if multiple occurances)\n" +
                "6. Exit";
        return menu;
    }
    public static LinkedList fromArray(String[] arr){
        LinkedList list = new LinkedList();
        for (int i = 0; i < arr.length; i++) {
            list.addToTail(arr[i]);
        }
        return list;
    }
}
