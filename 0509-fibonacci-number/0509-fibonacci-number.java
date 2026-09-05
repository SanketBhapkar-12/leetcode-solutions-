class Solution {
    public int fib(int n) {
       if(n==0){
        return 0;
       }else if(n==1){
        return 1;
       }
       int firstNo=0;
       int secondNo=1;
       for(int i=1;i<=n;i++){
        int thirdNo=firstNo+secondNo;
        firstNo=secondNo;
        secondNo=thirdNo;
       }
       return firstNo;
        
    }
}