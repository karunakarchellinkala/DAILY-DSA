class Solution {
    public int totalNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }
        int totalCount = 0;
        for (int i = 100; i <= 998; i += 2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;
            int[] currentCount = new int[10];
            currentCount[hundreds]++;
            currentCount[tens]++;
            currentCount[ones]++;
            boolean isValid = true;
            for (int d = 0; d < 10; d++) {
                if (currentCount[d] > count[d]) {
                    isValid = false;
                    break;
                }
            }            
            if (isValid) {
                totalCount++;
            }
        }        
        return totalCount;
    }
}