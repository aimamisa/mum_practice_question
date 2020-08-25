public class Centered {

    public static void main(String[] args) {
        int[] a = {};
        int i = isCentered(a);

        System.out.println(i);
    }
	
    public static int isCentered(int[] a) {
        //array should contains odd numbers of elements.
        if(a.length % 2 != 0) {
            
            for (int i = 0; i < a.length; i++){
                //only one element is centred itself.
                if (a.length == 1)
                    break;
    
                //finding the value of central element
                centerVal = a[a.length / 2];
    
                if(centerVal >= a[i]){
                    sum = 0;
                    break;
                }
            }
        }
        else {
            sum = 0;
        }
    
        return rtnval;
    }
}