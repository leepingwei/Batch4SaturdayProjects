package project7.groupSolution.bankAccount;

public class Account {
    /*
        Create a static method name is deposit
        parameters are two int(int amountAccount1 , int amountToAdd)
        return type is int
        add amountToAdd to amountAccount1
     */
    public static int deposit(int amountAccount1 , int amountToAdd){
        return amountAccount1 + amountToAdd;
    }

    /*
         Create a static method name is withDraw
         parameters are two int(int amountAccount1 , int withdrawAmount)
         return type is int
         remove the withdrawAmount from the  accountAmount1
     */
    public static int withDraw(int amountAccount1 , int withdrawAmount){
        return amountAccount1 - withdrawAmount;
    }

    /*
        Create a static method name is transferOtherUser
        Parameters are 2 objects of User class (User  sendingUser , User receivingUser) and an int (transferAmount)
        Return type is String
        if the transferAmount is greater than amountAccount1 variable of the object sendingUser
        Then return "The balance is not enough for this transaction."
       if the transferAmount is smaller than or equal to amountAccount1 variable of the object sendingUser
            Remove 2 percent from the transferAmount
            remove the transferAmount from the sendingUser amountAccount1( you need to use withDraw method)
            add the transferAmount to the receivingUser  amountAccount1 (you need to use deposit method)
        Then return "Transaction is completed successfully"
        For example:
        SendingUser amountAccount1 is 1000 dollar
        receiving user amountAccount1 is 200 dollar
        transferAmount 100
        After the transaction SendingUser amountAccount1 should bee 900 dollar
        After the transaction receivingUser amountAccount1 should be 298 dollar
     */
    public static String transferOtherUser(User sendingUser, User receivingUser, int transferAmount){
        if(transferAmount > sendingUser.amountAccount1){
            return "The balance is not enough for this transaction.";
        }else{
            sendingUser.amountAccount1 = withDraw(sendingUser.amountAccount1, transferAmount);
            transferAmount -= (transferAmount * 0.02);
            receivingUser.amountAccount1 = deposit(receivingUser.amountAccount1, transferAmount);
            return "Transaction is completed successfully";
        }
    }

    /*
       Create a static method name is transferToOwnAccount
       parameter is a User object (User user)and an int transferAmount
       return type is String
       if the transferAmount is greater than amountAccount1 of the user
        return "The balance is not enough for this transaction"
       if the transferAmount is smaller than or equal to amountAccount1 of the user
        Remove 1 percent from the transferAmount
          remove the transferAmount from amountAccount1 of the user (use withDraw method)
          add transferAmount to amountAccount2 of the user (use deposit method)
        return "Transaction is completed successfully"
        For example:
         amountAccount1 is 1000 dollar
         amountAccount2 is 200 dollar
        transferAmount 100
        After the transaction, amountAccount1 should be 900 dollar
        After the transaction, amountAccount2 should be 299 dollar
     */
    public static String transferToOwnAccount(User user, int transferAmount){
        if(transferAmount > user.amountAccount1){
            return "The balance is not enough for this transaction";
        }else{
            user.amountAccount1 = withDraw(user.amountAccount1, transferAmount);
            transferAmount -= transferAmount * 0.01;
            user.amountAccount2 = deposit(user.amountAccount2, transferAmount);
            return "Transaction is completed successfully";
        }
    }
}














