class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int r = purchaseAmount % 10;
        int rA;

        if (r >= 5) {
            rA = purchaseAmount + (10 - r);
        } else {
            rA = purchaseAmount - r;
        }

        return 100 - rA;
    }
}