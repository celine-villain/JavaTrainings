package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static MobilePhone myphone = new MobilePhone("Céline", "Huawei");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] myArray = getIntegers();
        //int[] sortedMyArray = sortIntegers(myArray);
        //printArray(sortedMyArray);

        //Scanner scanner = new Scanner (System.in);
        //System.out.println("Enter a number :");
//        int[] myArray = readIntegers(scanner.nextInt());
//        scanner.close();
//        int min = findMin(myArray);
//        System.out.println("Minimum of " + Arrays.toString(myArray) + " is " + min);

//        int[] myArray = {1,2,3,4,5};
//        System.out.println("My array : " + Arrays.toString(myArray)) ;
//        reverse(myArray);
//        System.out.println("My reversed array : " + Arrays.toString(myArray));

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("enter action :");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("shutting down!!!");
                    quit = true;
                    break;
                case 1:
                    myphone.printContact();
                    break;
                case 2:
                    myphone.addContact();
            }

        }


    }

    public static void startPhone ()  {
        System.out.println("Starting phone ...");
    }

    public static void printActions () {
        System.out.println("Available actions :");
        System.out.println("0 : shutdown\n" +
                           "1 : print contacts\n" +
                           "2 : add new contact\n" +
                           "3 : update contact\n" +
                           "4 : remove contact\n" +
                           "5 : query contact\n" +
                           "6 : print available actions");
        System.out.println("Chose your action :");
    }

    public static void addNewContact () {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number :");
        String phone = scanner.nextLine();
        myphone.addContact(new Contact(name, phone));
    }

    public static void updateContact ()  {
        System.out.println("enter the existing name :");
        String name = scanner.nextLine();
        if (myphone.queryContact())
        myphone.modifyContact();
    }

    public static void reverse(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            i++;
        };
    }

    public static int[] readIntegers(int count) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[count];
        int i = 0;
        System.out.println("Enter " + count + " numbers :");
        while (i < count) {
            myArray[i] = scan.nextInt();
            scan.nextLine();
            i++;
        }
        scan.close();
        return myArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        int i = 1;
        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        return min;
    }


    public static int[] getIntegers() {
        System.out.println("Enter a number :");
        Scanner scan = new Scanner(System.in);
        int[] myArrayOfIntegers = new int[5];
        int i = 0;
        while (i < myArrayOfIntegers.length) {
            myArrayOfIntegers[i] = scan.nextInt();
            scan.nextLine();
            i++;
        }
        scan.close();
        return myArrayOfIntegers;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = array;
        int i = 0;
        while (i < array.length) {
            for (int j = i; j < array.length; j++) {
                if (sortedArray[i] < sortedArray[j] && i != j) {
                    int tmp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
            i++;
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        System.out.println("My array :");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }
}
