class Solution {
    public String defangIPaddr(String address) {
       
      StringBuilder sb=new StringBuilder(address);
     int len=address.length();
     for(int i=0,j=0;i<len;i++,j++)
     {
       if(address.charAt(i)=='.') {
           sb.insert(j,'[');
           sb.insert(j+2,']');
          // len=len+2;
           j=j+2;
       }
     }
       return sb.toString(); 
    }
   
}
