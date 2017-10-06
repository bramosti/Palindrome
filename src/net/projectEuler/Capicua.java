package net.projectEuler;

public class Capicua {
	public static void main(String[] args) {
		 for(int i=999*999;i>=100*100;i--){
	            if(Palindrome(i)==true){
	                System.out.println(i);
	                break;
	            }
	        }
	    }

	   static boolean Palindrome(int num){
	        int[] matriz = new int[7];
	        int b = 1;
	        while(num!=0){
	            matriz[b]=num%10;
	            num=num/10;
	            b++;
	        }
	        for(int i=1;i<=b/2;i++){
	            if(matriz[i]!= matriz[b-i]){
	                return false;
	            }
	        }
	        return true;
	    }
}	
	   
	
