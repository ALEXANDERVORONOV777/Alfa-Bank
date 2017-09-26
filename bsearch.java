class Bsearch{

 	public static int bsearch(int arr[], int x){
  
		int result = -1;
    
		for(int i = 0; i < arr.length; i++){
      			if(arr[i] < x){
        		result = arr[i];
        		break;
      			}
    		}
    
    		return result;
  
  	}

}
