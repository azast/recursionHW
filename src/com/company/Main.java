package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 8, 9, 8, 1};
        System.out.println(isPalindrome(array, 0, array.length - 1));
    }

    //HOMEWORK 5
    public static boolean isPalindrome(int[] array, int a, int b){
        if(array.length > 1){
            if( a <= b) {
            if(array[a] != array[b]){
                return false;
                }
            else {
                isPalindrome(array, a + 1, b - 1);
                }
            }
        }
        else{
            return true;
        }
        return true;
    }
}