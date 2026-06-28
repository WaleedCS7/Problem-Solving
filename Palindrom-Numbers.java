class Solution {
    public boolean isPalindrome(int x) {
        int resx = 0;
        int num = x;
        int digit = 0;

        while(num != 0){  // while loop to reverse x, then compare it with the original x
            digit = num % 10;
            resx = (resx10)+digit;
            num = num10;

        }
        
        if(resx != x  || x < 0 ){  // if statment to compare and 'or' condition used to handle negative integers
            return false;
        } else
         return true;

        
    }
}