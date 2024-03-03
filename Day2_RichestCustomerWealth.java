public class Day2_RichestCustomerWealth {
        public static int maximumWealth(int[][] accounts) {
            int maxNum = 0;
            for (int i=0;i< accounts.length;i++){
                int sumi= sum(accounts[i]);
                maxNum= Math.max(sumi,maxNum);
            }
            return maxNum;
        }

        private static int sum(int[] account) {
            int a=0;
            for (int i = 0; i < account.length; i++) {
                a+=account[i];
            }
            return a;
        }
}
