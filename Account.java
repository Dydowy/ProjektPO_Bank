// Klasa podstawowa
// Abstrakcyjna
public abstract class Account {
    private String firstName;
    private String lastName;
    private String pesel;
    private String accountNumber;
    private double saveMoney;
    // numer konta
    private int accountNumber;

    // saldo
    protected double balance; 

    // podstawowy konstruktor
    public Account() {

    }

    public Account(String firstName, String lastName, String pesel, String accountNumber, double saveMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // metody pobierające
    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    // Abstract
    /**
     * Funkcja do składowania pieniędzy na koncie dopóki
     * parametr amount(ilośc) > 0 
     * 
     * Dodanie opłaty tranzakcyjnej do sprawdzanego konta
     * 
     * @wartość parametru amount do zapisania
     */
    public abstract void deposit(double amount); 

    /**
     * Funkcja do zabierania środków z konta dopóki
     *  1. Wartość do wypłaty musi być > 0
     *  2. Wartośc do wypłaty musi być <= stanowi konta
     * 
     * @pwartość parametru amount do wypłacenia
     */    
    public abstract void withdraw(double amount); 
}
