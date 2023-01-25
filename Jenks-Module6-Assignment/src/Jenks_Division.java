public abstract class Jenks_Division {
    protected String companysDivisionName;
    protected int accountNumber;

    // Construct a default object
    protected Jenks_Division() {

    }

    // Construct a division object with companyDivisionName and accountNumber values
    protected Jenks_Division(String name, int acctNumb) {
        this.companysDivisionName = name;
        this.accountNumber = acctNumb;
    }

    // Return companysDivisionName
    public String getCompanysDivisionName() {
        return companysDivisionName;
    }

    // Set a new company division name
    public void setCompanysDivisionName(String companysDivisionName) {
        this.companysDivisionName = companysDivisionName;
    }

    // Return accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Set a new account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Abstract method display
    public abstract void display();
}
