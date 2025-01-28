public class MixMatch {

    public static void   main(String[] args){
        String varString = "hello world ";
        char varchar = 'A';
        short varshort = 32000;
        int varInt = 7;
        long varLong = 12345679L;
        float varfloat = 3.13f;
        double vardouble = 3.15;
        boolean varboolean = false;


        System.out.println(varString + ",answer ");
        System.out.println(varchar + ",answer ");
        System.out.println(varshort + ",answer ");
        System.out.println(varInt + ",answer ");
        System.out.println(varLong + ",answer ");
        System.out.println(varfloat + ",answer ");
        System.out.println(vardouble  + ",answer ");
        System.out.println(varboolean + " ,answer ");


        System.out.println("Mixing variables: " + varInt + ", " + varchar + ", " + vardouble + ", " + varboolean);


    }
}