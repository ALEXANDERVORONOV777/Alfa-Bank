class Bsearch{

 	public static int bsearch(int array[], int x){
  
		int result = -1;
    
		for(int i = 0; i < array.length; i++){
      			if(array[i] < x){
        		result = array[i];
        		break;
      			}
    		}
    
    		return result;
  
  	}

}
