package net.projectEuler;

public class Capicua {

/*	public static void main(String[] args) {
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
	    }*/
	
	
///////////////////////////////////////////////////////////////////////////////////////
	
	
	
	public static boolean isPalindrome(int a) {
        int n = a;
        int rev = 0, remainder;
        while (a > 0) {
            remainder = a % 10;
            rev = rev * 10 + remainder;
            a = a / 10;
        }
        if (rev == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

         int num;
int palindrome = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                num = i * j;
                if (isPalindrome(num) == true) {

                    if (palindrome < num) {
                        palindrome = num;
                    }
                }
            }
        }
        System.out.println(palindrome);
    }

}
