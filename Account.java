import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;


public class Account {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        int ch = 1;

        Debit debit = new Debit();
        Credit credit = new Credit();

        while (ch != 0){
            System.out.println("1. Add Debit");
            System.out.println("2. Add Credit");
            System.out.println("3. Get Income");
            System.out.println("4. Get Expense");
            System.out.println("5. Check Balance");
            System.out.println("0. Exit Program");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            var accountName = "Umar";
            switch (ch){
                case 0:
                    System.out.println("PROGRAM ENDED");
                    break;
                case 1:
                    Scanner dsc = new Scanner(System.in);
                    System.out.print("Add Debit Amount : ");
                    var amount = dsc.nextInt();
                    debit.addDebit(amount);
                    break;
                case 2:
                    Scanner disc = new Scanner(System.in);
                    System.out.print("Add Credit Amount : ");
                    var amounts = disc.nextInt();
                    credit.addCredit(amounts);
                    break;
                case 3:
                    var creditList = credit.getCredit();
                    var dataListCredit = "Total Expense \n S.No AccountName Credit total \n";
                    var totalAmountCredit = 0;
                    for (int i = 0;i< creditList.size();i++){
                        totalAmountCredit += creditList.get(i);
                        dataListCredit += "  " + i + "    " + accountName + "     " + creditList.get(i) + "   " + totalAmountCredit + " \n";
                    }
                    System.out.print(dataListCredit);
                    break;
                case 4:
                    var debitList = debit.getDebit();
                    var dataListDebit = "Total Expense \n S.No AccountName Debit total \n";
                    var totalAmountDebit = 0;
                    for (int i = 0;i< debitList.size();i++){
                        totalAmountDebit += debitList.get(i);
                        dataListDebit += "  " + i + "    " + accountName + "     " + debitList.get(i) + "   " + totalAmountDebit + " \n";
                    }
                    System.out.print(dataListDebit);
                    break;
                case 5:
                    var _debitList = debit.getDebit();
                    var _creditList = credit.getCredit();
                    var openingBalance = 0;
                    for (int i = 0;i< _debitList.size();i++){
                        openingBalance -= _debitList.get(i);
                    }
                    for (int i = 0;i< _creditList.size();i++){
                        openingBalance += _creditList.get(i);
                    }
                    System.out.print("Balance :" + openingBalance + "\n");
                    break;
            }
        }
    }
}
