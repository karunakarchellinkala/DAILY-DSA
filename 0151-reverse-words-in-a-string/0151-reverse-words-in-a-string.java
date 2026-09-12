class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        int n=arr.length;
        int l=0,r=n-1;
        while(l<r){
            String temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(sb.length()>0){
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}