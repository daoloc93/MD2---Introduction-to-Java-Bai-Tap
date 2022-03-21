import java.util.Scanner;

public class DocSoThanhChu {

    public static void main(String[] args) {
//        String soThanhChu = "";
//        String hangTram = "";
//        String hangChuc = "";
//        String hangDonVi = "";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 0 and 999:");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        String hundredsInWords = "";
        String tensInWords = "";
        String onesInWords = "";
        String inWords = "";


        if (number == 0) {
            inWords = "zero";
        } else if (number > 10 && number < 20) {
            switch (number) {
                case 11:
                    inWords = "eleven";
                    break;
                case 12:
                    inWords = "twelve";
                    break;
                case 13:
                    inWords = "thirteen";
                    break;
                case 14:
                    inWords = "fourteen";
                    break;
                case 15:
                    inWords = "fifteen";
                    break;
                case 16:
                    inWords = "sixteen";
                    break;
                case 17:
                    inWords = "seventeen";
                    break;
                case 18:
                    inWords = "eighteen";
                    break;
                case 19:
                    inWords = "nineteen";
                    break;
            }
        } else {
            switch (hundreds) {
                case 1:
                    hundredsInWords = "one hundreds and ";
                case 2:
                    hundredsInWords = "two hundreds and ";
                    break;
                case 3:
                    hundredsInWords = "three hundreds and ";
                    break;
                case 4:
                    hundredsInWords = "four hundreds and ";
                case 5:
                    hundredsInWords = "five hundreds and ";
                    break;
                case 6:
                    hundredsInWords = "six hundreds and ";
                    break;
                case 7:
                    hundredsInWords = "seven hundreds and ";
                    break;
                case 8:
                    hundredsInWords = "eight hundreds and ";
                    break;
                case 9:
                    hundredsInWords = "nine hundreds and ";
                    break;
            }

            switch (tens) {
                case 2:
                    tensInWords = "twenty ";
                    break;
                case 3:
                    tensInWords = "thirty ";
                    break;
                case 4:
                    tensInWords = "forty ";
                case 5:
                    tensInWords = "fifty ";
                    break;
                case 6:
                    tensInWords = "sixty ";
                    break;
                case 7:
                    tensInWords = "seventy ";
                    break;
                case 8:
                    tensInWords = "eighty ";
                    break;
                case 9:
                    tensInWords = "ninety ";
                    break;
            }

            switch (ones) {
                case 1:
                    onesInWords = "one";
                    break;
                case 2:
                    onesInWords = "two";
                    break;
                case 3:
                    onesInWords = "three";
                    break;
                case 4:
                    onesInWords = "four";
                    break;
                case 5:
                    onesInWords = "five";
                    break;
                case 6:
                    onesInWords = "six";
                    break;
                case 7:
                    onesInWords = "seven";
                    break;
                case 8:
                    onesInWords = "eight";
                    break;
                case 9:
                    onesInWords = "nine";
                    break;
            }
        }
        inWords = hundredsInWords + tensInWords + onesInWords;
        System.out.println("In words: " + inWords);
    }
}

