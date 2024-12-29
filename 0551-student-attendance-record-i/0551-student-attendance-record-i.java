class Solution {
    public boolean checkRecord(String s) {
        char arr[]=s.toCharArray();
        int countA=0;
        int countL=0;
        for(char a:arr){
            if(a=='A'){
                countA++;
                countL=0;
            }else if(a=='L'){
                countL++;
            }else{
                countL=0;
            }
            if(countA==2||countL==3){
                return false;
            }
        }
         return true;
    }
}