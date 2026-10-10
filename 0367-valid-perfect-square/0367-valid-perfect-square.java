class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        int i = 1;
        while (i <= num / i) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}