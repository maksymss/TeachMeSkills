package Phone;

public class Main {
    public static void main(String[] args) {
        Phone[] phones =
                {
                        new Phone("347-563-8746", "iPhone 12", "230 g"),
                        new Phone("347-933-5777", "iPhone 13", "250 g"),
                        new Phone("347-583-9772", "iPhone 14", "311 g")
                };
        for(Phone telephones: phones) {
            System.out.println(telephones);
        }
        System.out.println();
        phones[0].receiveCall("Mark");
        phones[1].receiveCall("John");
        phones[2].receiveCall("Maksym");

        System.out.println();
        phones[0].receiveCall("Mark", "347-563-8746");
        phones[1].receiveCall("John", "347-933-5777");
        phones[2].receiveCall("Maksym", "347-583-9772");

        System.out.println();
        phones[0].getNumber();
        phones[1].getNumber();
        phones[2].getNumber();

    }

}
