public class Jenks_InternationalDivision extends Jenks_Division {
    private String countryName;
    private String languageSpoken;

    // Create default international division
    public Jenks_InternationalDivision() {

    }

    // Create international division with country, language spoken and supperclass
    // values
    public Jenks_InternationalDivision(String name, int acctNumb, String country, String language) {
        super(name, acctNumb);
        this.countryName = country;
        this.languageSpoken = language;
    }

    // Return the countrys name
    public String getCountryName() {
        return countryName;
    }

    // Set a new country name
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // Return the language spoken
    public String getLanguageSpoken() {
        return languageSpoken;
    }

    // Set a new language spoken
    public void setLanguageSpoken(String languageSpoken) {
        this.languageSpoken = languageSpoken;
    }

    // Display method
    public void display() {
        System.out.println("The name of the company's international division is " + companysDivisionName + ".");
        System.out.println("The account number of the " + companysDivisionName + " is " + accountNumber + ".");
        System.out.println("The location of the " + companysDivisionName + " is " + countryName + ".");
        System.out.println("The people in " + countryName + " speak " + languageSpoken + ".\n");
    }
}
