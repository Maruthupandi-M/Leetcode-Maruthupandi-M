// Last updated: 11/08/2026, 14:15:48
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;   
        int empty = numBottles;       

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;
            totalDrank += newBottles;
            empty = empty % numExchange + newBottles;
        }

        return totalDrank;
    }
}
