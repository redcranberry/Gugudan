public class Gugudan {

    public static int[] calculate(int times) {
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    //        int[] time4=calculate(4);
    //        print(time4);
    //        int[] time5=calculate(5);
    //        print(time5);

    //        int[] result=calculate(2);
    //                
    //        for (int i = 0; i < result.length; i++) {
    //                    System.out.println(result[i]);            
    //        }

}
