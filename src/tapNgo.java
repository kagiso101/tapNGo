public class tapNgo {

    public static int balance = 0;

    //pay method which takes in the amount user wants to pay
    public  static  int pay(int payAmount){
    if(balance != 0){
        if(payAmount < balance){
            balance -= payAmount;
            System.out.println("Successfully deducted : "  + "R" + payAmount);
        }else{
            System.out.println("Insufficient balance for the transaction");
        }
      }
    else{
        System.out.println("Low Funds!");
       }
        return balance;

    }

    //deposit method  to put money into the card
    public static int deposit(int amount){

       if(amount > 0) {
           balance += amount;
           System.out.println("Deposit was successful!");

       }else {
           System.out.println("Enter an Amount greater than 0!");
       }
       return balance;
    }

    public static int getBalance(){
        System.out.println("Your balance is: " + "R" + balance);
        return balance;
    }

    //getBalance method which shows money in the card
    public static void main(String[] args){
        tapNgo run = new tapNgo();
        run.deposit(1000);
        run.pay(650);
        run.getBalance();




    }
}
