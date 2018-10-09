package ATMSource;
import java.util.Scanner;



public class ATMSource {

    private static void transfer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int pin;
    int withdraw;
    int deposit;
    static int transfer;
    int checkBalance;
    String accountName;
   static String check = "Transaction";
   
    
    public int getpin(){return pin;}
    public void setpin(int pin){this.pin = pin;}
    


        public static void main(String[] args){
            
            int pin;
            
            ATMSource ATMMachine = new ATMSource();
            ATMMachine.setpin(1759);
            
            int balance = 5000, withdraw, deposit;
            
            Scanner setpin = new Scanner(System.in);
            System.out.println("Enter your pin");
            pin = setpin.nextInt();
            
            if (pin == ATMMachine.pin)
                System.out.println("#Proceed with your transaction");
            else {
                System.out.println("Invalid pin try again");
                System.exit(0);
            }
            Scanner in = new Scanner(System.in);
            while(check == "Transaction")
            {
                
                System.out.println("Welcome to Automated Teller Machine");
                System.out.println("#Choose 1 for Withdraw");
                System.out.println("#Choose 2 for Deposit");
                System.out.println("#Choose 3 for Transfer");
                System.out.println("#Choose 4 for Check Balance");
                System.out.println("#Choose 5 for EXIT");
                System.out.print("#Choose the operation you want to perform:");
                int selections = in.nextInt();
               
                switch(selections)
                {
                    case 1:
                        System.out.print("Enter the amount you want to withdraw:");
                        withdraw = in.nextInt();
                        if(balance >= withdraw)
                        {
                            balance = balance - withdraw;
                            System.out.println("\nYour request is processing\n");
                            System.out.println("Collect your cash");
                        }
                        else
                        {
                            System.out.println("\nInsufficient Balance\n");
                            System.out.println("If your wish to continue\nChoose any of the options to continue\n");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.print("Enter the amount you want to deposite:");
                        deposit = in.nextInt();
                        balance = balance + deposit;
                        System.out.println("\nYour transaction is processing\n");
                        System.out.println("\nYour Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 3:
                        System.out.print("Enter the amount you want to transfer:");
                        transfer = in.nextInt();
                        if(balance >= transfer)
                        {
                            balance = balance - transfer;
                            System.out.println("\nYour request is processing\n");
                            System.out.println("Collect your cash");
                        }
                        else
                        {
                            System.out.println("\nInsufficient Balance\n");
                            System.out.println("If your wish to continue\nChoose any of the options to continue\n");
                        }
                        System.out.println("");
                        break;
                        
                    case 4:    
                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;

                    case 5:
                        System.exit(0);
                }
            }
       
        }

   
}




