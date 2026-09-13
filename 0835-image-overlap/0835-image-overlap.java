class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (img1[r][c] == 1) {
                    list1.add(r * 100 + c); 
                }
                if (img2[r][c] == 1) {
                    list2.add(r * 100 + c);
                }
            }
        }
        Map<Integer, Integer> shiftCounts = new HashMap<>();
        int maxOverlap = 0;
        
        for (int p1 : list1) {
            for (int p2 : list2) {
                int shift = p2 - p1;
                shiftCounts.put(shift, shiftCounts.getOrDefault(shift, 0) + 1);
                maxOverlap = Math.max(maxOverlap, shiftCounts.get(shift));
            }
        }
        return maxOverlap;
    }
}