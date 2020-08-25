public class Dual {

    public static void main(String[] args) {
        int[] a = {};
        int i = isDual(a);

        System.out.println(i);
    }
	
    public static int isDual(int[] a) {
        int rtnval = 1;
    
        if (a.length > 0) {
    
            //should be even
            if (a.length % 2 == 0) {
                for (int i = 2; i < a.length; i = i + 2) {
                    if (a[0] + a[1] != a[i] + a[i + 1]) {
                        rtnval = 0;
                        break;
                    }
                }
            }
            else {
                rtnval = 0;
            }
        }
    
        return rtnval;
    }
}