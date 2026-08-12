class Solution {
    public int lengthOfLastWord(String s) {

        int num = 0;
        for(int i = (s.length()-1); i>=0 ;i-- ){// nested reverse loop the first one is to ignore the spaces if there are any
            if (s.charAt(i)==' ')
            continue;
            for(int z = i; z>=0 && s.charAt(z)!=' ';z-- ){// if we actually found a word count it, until a space is found, then return the value
                num++;

            }
            return num;






        }
        return 0;
        
    }
}