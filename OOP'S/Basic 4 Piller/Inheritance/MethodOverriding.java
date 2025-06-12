class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

// Child classes overriding the method
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.5;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate());

        b = new HDFC();
        System.out.println("HDFC Interest Rate: " + b.getInterestRate());

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate());


    }
}
