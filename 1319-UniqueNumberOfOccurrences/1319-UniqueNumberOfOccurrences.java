// Last updated: 11/08/2026, 14:16:26
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        int[] fre = new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j])
                    c++;
            }
            fre[i]=c;
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]!=arr[j] && fre[i]==fre[j]){
                return false;
            } 
            }
        }
        return true;
    }
}