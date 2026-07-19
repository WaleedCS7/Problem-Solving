class solution {
    public String longestCommonPrefix(String[] strs) {

        String commone = "";
        
    for(int i = 0; i<strs[0].length();i++){//nested loop to search in the array

        char c =strs[0].charAt(i); 

        for(int n =0; n<strs.length;n++){

           if( i>strs[n].length() || c != strs[n].charAt(i) ){// if there is no charecter at the index of 'n' or the charecter is not a common prefix then exit and return the collected charecters... otherwise contenue
            return commone;
           }

        }
        commone+= c;

    }
    return commone;
      
    
}}