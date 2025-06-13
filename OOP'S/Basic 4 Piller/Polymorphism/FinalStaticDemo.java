class Bank {
    static String bankName = "State Bank of Java";
    static double interestRate = 6.5;
    static int customerCount = 0;
    final String IFSC = "SBJ0001234";  // constant value

    String accHolder;
    double balance;

    // Constructor
    Bank(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
        customerCount++; // static counter
    }

    final void accountDetails() { // final method can't be overridden
        System.out.println("----- Account Info -----");
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accHolder);
        System.out.println("Balance: " + balance);
        System.out.println("IFSC: " + IFSC);
    }

    static void showTotalCustomers() { // static method
        System.out.println("Total customers: " + customerCount);
    }
}

public class FinalStaticDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("Shubham", 5000);
        Bank b2 = new Bank("Aarav", 8000);

        b1.accountDetails();
        b2.accountDetails();

        // Static method call — no object needed
        Bank.showTotalCustomers();
    }
}


//https://chatgpt.com/share/684ba820-ce2c-800e-988f-638141cd7706   all doubt about final and static