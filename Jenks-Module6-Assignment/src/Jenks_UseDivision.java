public class Jenks_UseDivision {
    public static void main(String[] args) {
        Jenks_Division newCompany1 = new Jenks_InternationalDivision("Asia Division", 1284634, "China", "Mandarin");
        Jenks_Division newCompany2 = new Jenks_InternationalDivision("Africa Division", 2678349, "Ghana", "English");
        Jenks_Division newCompany3 = new Jenks_DomesticDivision("Northeast Division", 93468761, "Maine");
        Jenks_Division newCompany4 = new Jenks_DomesticDivision("South Central Division", 9682344, "Texas");

        newCompany1.display();
        newCompany2.display();
        newCompany3.display();
        newCompany4.display();
    }
}
