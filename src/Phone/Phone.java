package Phone;

public class Phone {

   private String number;
   private String model;
   private String weight;

   public Phone(String number, String model, String weight) {
   this.number = number;
   this.model = model;
   this.weight = weight;
   }
   public Phone(String number, String model) {
   this.number = number;
   this.model = model;
   }
   public Phone() {

   }

   public void setNumber(String number) {
      this.number = number;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getWeight() {
      return weight;
   }

   public void setWeight(String weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return number + " " + model + " " + weight;
   }
   public void receiveCall(String name) {
      System.out.println("Calling: " + name);
   }

   public void receiveCall(String name, String number) {
      System.out.println(name + " is calling " + "\n" + "The number is: " + number);
   }
   public void getNumber() {
      System.out.println(number);
   }
   public void sendMessage() {

   }

}
