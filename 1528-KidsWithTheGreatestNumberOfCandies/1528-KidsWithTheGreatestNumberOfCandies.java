// Last updated: 11/08/2026, 14:16:05
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int a:candies){
            if(max<a)
                max=a;
        }
        List<Boolean> result = new ArrayList<>();
        for(int w : candies){
            w = extraCandies+w;
            if(w>=max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}