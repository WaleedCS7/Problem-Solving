class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){//loop to calculate the answer
            if(i+1<s.length()&&(valueof(s.charAt(i)))<(valueof(s.charAt(i+1)))){sum = sum -((valueof(s.charAt(i))));
                
                
            }else{sum+=valueof(s.charAt(i));}
                
                
                
                
                
            }
            return sum;
            
            
        }
        
    


public static int valueof(char a){// a method to return a value for each roman charecter
    
    switch(a){
        case('I'):
        return 1;
        
        case('V'):
        return 5;
        
        case('X'):
        return 10;
                
        case('L'):
        return 50;
                
        case('C'):
        return 100;
                
        case('D'):
        return 500;
                
        case('M'):
        return 1000;
                
                default:
                return 0;
        
        
        
        
        
    }
    
}}