public class prog {
    public static void main(String[] args) {
        int Minutes_Spent = 148;
        float Total_pages = 991;
        float pages_read = 28;

        // try{
        //     pages_read = Integer.valueOf(args[0]);
        // } catch(Error e) {

        //     Minutes_Spent = 110;
        // }
        
        System.out.println(pages_read);
        float Percent_Complete = (pages_read/Total_pages) * 100;
        float Remaining_Percent = 100 - Percent_Complete;
        float RateOfCompletion_Percent_per_Minutes = Percent_Complete/Minutes_Spent;
        float TimeToComplete = Remaining_Percent/RateOfCompletion_Percent_per_Minutes;

        System.out.println("Percent Complete: " + Percent_Complete + "%");
        
        System.out.println("Remaining Percent: " + Remaining_Percent + "%");
        System.out.println("Rate of Completion in percent per minute: " + RateOfCompletion_Percent_per_Minutes);

        System.out.println("Time to complete:" + TimeToComplete/60 + " hours");
        System.out.println("Time to complete:" + TimeToComplete + " minutes");
        



    }
}
