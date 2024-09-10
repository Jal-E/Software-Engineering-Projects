public class Main {
    public static void main(String[] args) {
        // Create objects for each type of employee
        SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee mahnaz = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        // Display details of each employee
        joe.display();
        System.out.println();

        stephanie.display();
        System.out.println();

        mary.display();
        System.out.println();

        nicole.display();
        System.out.println();

        renwa.display();
        System.out.println();

        mike.display();
        System.out.println();

        mahnaz.display();
    }
}
