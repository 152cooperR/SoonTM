public class Soon {

    public static void main(String args[]){

        String input = "Soon™";
        /*
        double output;
        double S = 19;
        double o = 15;
        double n = 14;
        double T = 20;
        double M = 13;
        */
        double output;
        int S = 19;
        int o = 15;
        int n = 14;
        int T = 20;
        int M = 13;
        // The numbers above are figured using the theory that A = 1 & Z = 26

        double Soon = S * o * o * n;

        double TM = T * M;

        output = Math.pow(Soon , TM);

        int outputToInt = (int) output;


        int SoonTM = outputToInt;

        int SoonTMinSeconds = SoonTM;
        int SoonTMinMinutes = (SoonTM * 60);
        int SoonTMinHours = SoonTM * 120;
        int SoonTMinDays = SoonTM;
        int SoonTMinMonths = SoonTM;
        int SoonTMinYears = SoonTM;


        System.out.println("It will take " + (SoonTMinSeconds) + " seconds to reach " + input);
        System.out.println("It will take " + (SoonTMinMinutes) + " minutes to reach " + input);
        System.out.println("It will take " + SoonTMinHours + " hours to reach " + input);
        System.out.println("It will take " + SoonTMinDays + " days to reach " + input);
        System.out.println("It will take " + SoonTMinMonths + " months to reach " + input);
        System.out.println("It will take " + SoonTMinYears + " year(s) to reach " + input);

    }

}