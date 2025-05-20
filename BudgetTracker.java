import java.util.ArrayList;



public class BudgetTracker {
    public static void main(String[] args) {
    BudgetTracker tracker = new BudgetTracker();
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    int choice;

    do {
        System.out.println("\n--- Budget Tracker Menu ---");
        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. Show Balance");
        System.out.println("4. Show All Incomes");
        System.out.println("5. Show All Expenses");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter income amount: ");
                double income = scanner.nextDouble();
                tracker.addIncome(income);
                break;
            case 2:
                System.out.print("Enter expense amount: ");
                double expense = scanner.nextDouble();
                tracker.addExpense(expense);
                break;
            case 3:
                System.out.println("Current balance: " + tracker.getBalance());
                break;
            case 4:
                tracker.printIncomes();
                break;
            case 5:
                tracker.printExpenses();
                break;
            case 0:
                System.out.println("Exiting... Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 0);

    scanner.close();
}

    private ArrayList<Double> expenses;
    private ArrayList<Double> incomes;
    private double balance;

    public BudgetTracker() {
        expenses = new ArrayList<Double>();
        incomes = new ArrayList<Double>();
        balance = 0;
    }

    public void addExpense(double expense) {
        expenses.add(expense);
        balance -= expense;
    }

    public void addIncome(double income) {
        incomes.add(income);
        balance += income;
    }

    public double getBalance() {
        return balance;
    }

    public void printExpenses() {
        System.out.println("Expenses: ");
        for (double expense : expenses) {
            System.out.println(expense);
        }
    }

    public void printIncomes() {
        System.out.println("Incomes: ");
        for (double income : incomes) {
            System.out.println(income);
        }
    }
}