package StringMethods;

public class StringMethods {

    //Methods
    public static void main(String[] args) {

    getEndNumbers("3654-abc-7593-xyz-1e3u");
    System.out.println();
    getStartNumbers("5553-abc-7593-xyz-1e3u");
    System.out.println();
    split("5553-abc-7593-xyz-1e3u");
    System.out.println();
    getStringBuilder();
    System.out.println();
    isContainsABC("5553-abc-7593-xyz-1e3u");
    System.out.println();
    getShortestAndLongestWord("Archil is best Java teach I've ever had");
    System.out.println();
    getHello("Hello");

    }

    public static void getEndNumbers(String numbers) {
    System.out.println("Is number: " + numbers + " ends with: 1a2b?" + "\n" + numbers.endsWith("1a2b"));
    }
    public static void getStartNumbers(String numbers) {
        System.out.println("Is number: " + numbers + " starts with: 555?" + "\n" + numbers.startsWith("555"));
    }
    public static void split(String numbers) {
    String[] docNumber = numbers.split("-");
    for(String number: docNumber) {
        System.out.print(number);
    }
        System.out.println();
        System.out.println();
        System.out.println("The string with 2 first blocks with numbers: " + docNumber[0] + docNumber[2]);
        System.out.println();
        String num1 = (docNumber[1].replaceAll("abc", "***"));
        String num3 = (docNumber[3].replaceAll("xyz", "***"));
        System.out.println();
        System.out.println("The document number is: " + docNumber[0] + num1 +
                                docNumber[2] + num3 + docNumber[4]);
        System.out.println();

        String str1 = docNumber[1];
        String str2 = docNumber[3];
        char str3 = docNumber[4].charAt(1);
        char str4 = docNumber[4].charAt(3);
        String lowerCaseLetters = str1 + "/" + str2 + "/" + str3 + "/" + str4;
        System.out.println("The lower case letters are: " + lowerCaseLetters);


    }

    public static void getStringBuilder() {
        StringBuilder documentNumber = new StringBuilder("5553-abc-7593-xyz-1e3u");
        String num1 = documentNumber.substring(5, 8);
        String num2 = documentNumber.substring(14, 17);
        char num3 = documentNumber.charAt(19);
        char num4 = documentNumber.charAt(21);
        String docNumber = num1 + "/" + num2 + "/" + num3 + "/" + num4;
        System.out.println("Letters in upper case are: " + docNumber.toUpperCase());

    }

    public static void isContainsABC(String numbers) {
        String sequence = "ABC";
        System.out.println("Is number contains ABC? " + "\n" + "Answer: " +
                                     sequence.compareToIgnoreCase(sequence));
    }

    //Additional tasks
    //task#
    public static void getShortestAndLongestWord(String phrase) {
    String shortestWord = "";
    String longestWord = "";
    int shortestWordLength = 0;
    int longestWordLength = 100;
    String[] phraseOfWords = phrase.split(" ");
    for(String str: phraseOfWords) {
        if(phrase.length() > longestWordLength){
            longestWord = phrase;
            longestWordLength = phrase.length();
        } else if(phrase.length() < shortestWordLength){
            shortestWord = phrase;
            shortestWordLength = phrase.length();
        }
    }
        System.out.println("The shortest word is: " + shortestWord);
        System.out.println("The longest word is: " + longestWord);
    }

    //task#5
    public static void getHello(String str){
        String result = str.replaceAll("Hello", "HHeelllloo");
        System.out.println(result);
        }



    }









