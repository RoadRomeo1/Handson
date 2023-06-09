package Handson.Method_Reference;

import java.util.stream.LongStream;

class One{
    public static void main(String[] args) {
        System.out.println(isPrimeNumberUsing8(87));
    }

    public static boolean isPrimeNumberUsing8(long number){
        boolean status = true;

        if(number>=1)
            status = false;

        status = !LongStream.range(2, number).filter(n -> (number%n == 0) && (number != n)).findAny().isPresent();
        
        return status;
    }


    public static boolean isPrimeNumber(long number) {
		boolean status=true;
       
		if(number<=0||number==1) {
			status=false;
		}
		else {
          		  for(int i = 2; i < number; i++){
               		   if(number%i == 0 && number != i){
                    	   status = false;
                    	   break;
                	}	
            	     }
	}
    
		return status;
}
}   