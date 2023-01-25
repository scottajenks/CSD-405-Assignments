public class Jenks_DomesticDivision extends Jenks_Division {
    private String stateName;

    // Create default domestic division
    public Jenks_DomesticDivision() {

    }

    // Create domestic division with state and superclass values
    public Jenks_DomesticDivision(String name, int acctNumb, String state) {
        super(name, acctNumb);
        this.stateName = state;
    }

    // Return the states name
    public String getStateName() {
        return stateName;
    }

    // Set a new state name
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    // Display method
    public void display() {
        System.out.println("The name of the company's division is " + companysDivisionName + ".");
        System.out.println("The account number of the " + companysDivisionName + " is " + accountNumber + ".");
        System.out.println("The location of the " + companysDivisionName + " is in " + stateName + ".\n");
    }
}