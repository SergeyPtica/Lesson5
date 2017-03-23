/**
 * Created by Serg on 19.03.2017.
 */

class TestTax {
    public static void main (String[] args) {

        // following check if the all of arguments values passed from the command line
        if (args.length != 3) {
            System.out.println("Sample usage of the program: " +
                    "java TestTax 50000 NJ 2");
            System.exit(0);
        }

        //convert values to the proper data type
        double grossIncome = Double.parseDouble(args[0]);
        String state = args[1];
        int dependents = Integer.parseInt(args[2]);

        Tax t1 = new Tax(grossIncome, state, dependents);
        double hisTax = t1.calcTax();
        System.out.println("His tax in dollars: " + hisTax);
        Tax.convertToEuros(hisTax);
    }
}
