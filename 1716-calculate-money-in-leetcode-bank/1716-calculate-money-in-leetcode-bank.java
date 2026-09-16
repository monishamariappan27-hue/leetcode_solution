class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int week = 1;
        int day = 1;

        for (int i = 1; i <= n; i++) {
            total += week + day - 1;
            day++;

            if (day == 8) {
                day = 1;
                week++;
            }
        }

        return total; 
    }
}