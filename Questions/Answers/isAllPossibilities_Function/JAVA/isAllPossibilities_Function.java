public class AllPossiblity {

    public static void main(String[ ] args) {
        int[ ] a = { };
        int i = isAllPossibilities(a);

        System.out.println(i);
    }
	
    public static int isAllPossibilities(int[ ] a) {
    	int rtncnt = 0;
    	
    	for(int i = 0; i < a.length; i++){
    		rtncnt = 0;
    		
    		for(int j = 0; j < a.length; j++){
    			if(a[i] == j){
    				rtncnt++;
    			}
    		}

    		if(rtncnt == 0){
    			return 0;
    		}
    	}
        
    	return 1;
    }
}