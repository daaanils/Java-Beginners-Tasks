import java.util.Scanner;

public class caseStudy {

    static void get_rate_drop_factor () {
        System.out.print("Please enter rate in ml/hr: ");
        ml_hour = in.nextDouble();
        System.out.print("Please enter the tubing's drop factor in drops/ml: ");
        drops_ml = in.nextDouble();

    }

    static double fig_drops_min (double ml_hour, double drops_ml) {
        return ml_hour * drops_ml / minute;

    }

    static void get_num_rate_hours () {
        System.out.print("Please enter the number of hours: ");
        num_hours = in.nextDouble();
        
    }

    static double fig_ml_hr (double num_hours) {
        return num_liters / num_hours;
        
    }

    static void get_kg_units_conc () {
        System.out.print("Please enter the rate in mg/kg/hr: ");
        mg_kg_hr = in.nextDouble();
        System.out.print("Please enter patient weight in kg: ");
        kg = in.nextDouble();
        System.out.print("Please enter concentration in mg/ml: ");
        mg_ml = in.nextDouble();
    }

    static double by_weight (double mg_kg_hr, double kg, double mg_ml) {
        return mg_kg_hr * kg * mg_ml;
    }

    public static void get_units_conc () {
        System.out.print("Please enter rate in units/r: ");
        units_hr = in.nextDouble();
        System.out.print("Please enter concentration in units/ml: ");
        units_ml = in.nextDouble();
    }

    static double by_units (double units_hr, double units_ml) {
        return units_hr / units_ml;

    }

    static void quit_program () {
        System.out.println("END OF PROGRAM");
    }

    static void get_problem () {
        System.out.println("\t\tINTRAVENOUS RATE ASSISTANT\n");
        System.out.println("Please enter the number of the problem you wish to solve.\n");
        System.out.println("\tGIVEN A MEDICAL ORDER IN\t\t\tCALCULATE IN\n");
        System.out.println("(1)\tml/hr & tubing drop factor\t\t\tdrops/min");
        System.out.println("(2)\t1L for n hr\t\t\t\t\tml/hr");
        System.out.println("(3)\tmg/kg/hr & concentration in mg/ml\t\tml/hr");
        System.out.println("(4)\tunits/hr & concentration in units/ml\t\tml/hr");
        System.out.println("(5)\tQUIT\n");
        System.out.print("Problem =>  ");
        x = in.nextInt();
    }

    static Scanner in = new Scanner(System.in);
    static double answer;
    static double ml_hour;
    static double drops_ml;
    static double minute = 60;
    static double num_liters = 1000;
    static double mg_kg_hr;
    static double kg;
    static double mg_ml;
    static double units_hr;
    static double units_ml;
    static int x;
    static int end = 5;
    static double num_hours;




    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        
        while (x != end) {
        get_problem();

            switch (x) {
                case 1: 
                    get_rate_drop_factor();
                    answer = fig_drops_min(ml_hour, drops_ml);
                    System.out.print("The drop rate per minute is: " + Math.round(answer) +"\n\n");
                    break;
                case 2:
                    get_num_rate_hours();
                    answer = fig_ml_hr(num_liters);
                    System.out.print("The rate in milliliters per hour is: "+ Math.round(answer) +"\n\n");
                    break;
                case 3:
                    get_kg_units_conc();
                    answer = by_weight(mg_kg_hr, kg, mg_ml);
                    System.out.print("The rate in milliliters per hour is: "+ Math.round(answer) +"\n\n");
                    break;
                case 4:
                    get_units_conc();
                    answer = by_units(units_hr, units_ml);
                    System.out.print("The rate in milliliters per hour is: "+ Math.round(answer) +"\n\n");
                    break;
                case 5:
                    end = 5;
                    quit_program();
                    break;
                default:
                System.out.println("\nInvalid Input\n\n");


                
            }
        }




   }



    
}
