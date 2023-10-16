public class Bank {
    public Loan[] loans = new Loan[100];

    public Bank() {
        for (int i = 0; i < loans.length; i++) {
            loans[i] = null;
        }
    }

    public void addLoan(Loan loan) {
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] == null) {
                loans[i] = loan;
                break;
            }
        }
    }

    public boolean remove(Loan loan) {
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] == loan) {
                loans[i] = null;
                return true;
            }
        }
        return false;
    }

    public Loan[] find(String name) {
        Loan[] result = new Loan[100];
        int index = 0;
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] != null && loans[i].getName().equals(name)) {
                result[index++] = loans[i];
            }
        }
        return result;
    }

    public Loan[] find(String name, double minAmount) {
        Loan[] result = new Loan[100];
        int index = 0;
        for (int i = 0; i < loans.length; i++) {
            if (loans[i] != null && loans[i].getName().equals(name) && loans[i].getAmount() >= minAmount) {
                result[index++] = loans[i];
            }
        }
        return result;
    }

    public void printInFile(String fileName) {
        try {
            java.io.PrintWriter file = new java.io.PrintWriter(fileName);
            for (int i = 0; i < loans.length; i++) {
                if (loans[i] != null) {
                    file.println("\n\n\nBank account:");
                    file.println("ID: " + loans[i].getId());
                    file.println("Amount: " + String.format("%.2f", loans[i].getAmount()));
                    file.println("Name: " + loans[i].getName());
                }
            }
            file.close();
        } catch (java.io.FileNotFoundException e) {
            try {
                java.io.File file = new java.io.File(fileName);
                file.createNewFile();
                printInFile(fileName);
            } catch (java.io.IOException e2) {
                System.exit(0);
            }
        }
    }
}
