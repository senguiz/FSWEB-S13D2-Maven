package org.example;

public class Main {
    public static void main(String[] args) {

        isPalindrome(-1221);
        isPalindrome(707);
        isPalindrome(11212);

        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5) ;
        isPerfectNumber(-1);

        numberToWords(123);
        numberToWords(1010);
        numberToWords(-12);
    }

    public static boolean isPalindrome(int number) {
        String num = Integer.toString(number);
        num = num.replaceAll("-","");
        String[] array = num.split("");

        int i = 0;
        int j = array.length-1;
            while(j>i) {
                if (!(array[i].equals(array[j]))) {
                    return false;
                }
                i=i+1;
                j=j-1;
            }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        int toplam = 0;
            for(int i = 1 ; i< number ; i++){
                if(number % i == 0 ){
                    toplam +=i;
                }
            }
            if(toplam == number){
                return true;
            }
        return false;
        }

    public static String numberToWords(int number) {

    String sayi = Integer.toString(number);
    String[] numbers = sayi.split("");
    String result ="";
    if(number < 0){
        return "Invalid Value";


    }
    for(String num : numbers){
        switch (num) {
            case "0":
                result = result + "Zero" + " ";
            break;
            case "1":
                result = result + "One"+ " ";
                break;
            case "2":
                result = result + "Two"+ " ";
                break;
            case "3":
                result = result + "Three"+ " ";
                break;
            case "4":
                result = result + "Four"+ " ";
                break;
            case "5":
                result = result + "Five"+ " ";
                break;
            case "6":
                result = result + "Six"+ " ";
                break;
            case "7":
                result = result + "Seven"+ " ";
                break;
            case "8":
                result = result + "Eight"+ " ";
                break;
            case "9":
                result = result + "Nine"+ " ";
                break;
            default:
                System.out.println("");
                break;
        }
    }
    return result;
    }








}
