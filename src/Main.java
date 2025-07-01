import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Objective 1:
        Write a program that takes an array (not an ArrayList) of integers,
        performs some simple transformations on the array, and outputs the results.
        This program should not use any of Java's built in methods to simply achieve these tasks!
         */
        int[] num = inputNumbers();
        num = reverseArr(num);
        System.out.println("The largest number is: " + max(num));
        System.out.println("The smallest number is: " + min(num));
        System.out.println("The sum of the numbers is: " + sum(num));
        if (containsEvenNumber(num)){
            System.out.println("The numbers entered contains an even number");
        } else {
            System.out.println("The numbers don't contain an even number");
        }
        /*
        Objective 2:
        Write a program that takes a sentence as input and reverses the order of characters in each word
         while maintaining the original order of words.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse: ");
        System.out.println(reverseWordsInSentence(scanner.nextLine()));
    }
    public static int[] inputNumbers(){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0 ; i < 5 ; i++){
            num[i] = Integer.parseInt(scanner.next());
        }
        System.out.println(Arrays.toString(num));
        return num;
    }
    public static int[] reverseArr(int[] arr){
        int[] reverseArr = new int[arr.length];
        for (int i = 0; i < reverseArr.length; i++) {
            reverseArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseArr));
        return reverseArr;
    }
    public static int max(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean containsEvenNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                return true;
            }
        }
        return false;
    }
    /*
    Requirements:
    Prompt the user to input a sentence (a string with multiple words separated by spaces).
    Use a StringBuilder to reverse each word individually.
    Print the modified sentence with each word’s characters reversed, but the word order kept the same.
     */
    public static String reverseWordsInSentence(String sentence){
        String[] wordsInSentence = sentence.split(" ");
        StringBuilder[] sb = new StringBuilder[wordsInSentence.length];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder(wordsInSentence[i]);
            sb[i].reverse();
            wordsInSentence[i] = sb[i].toString();
        }
        return String.join(" ",wordsInSentence);
    }
}