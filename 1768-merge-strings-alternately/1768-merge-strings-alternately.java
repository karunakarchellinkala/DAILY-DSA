class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res=new StringBuilder();
        int i=0,j=0,n=word1.length(),m=word2.length();
        while(i<n && j<m){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}