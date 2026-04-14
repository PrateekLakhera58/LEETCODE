class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int [] arr= new int [n];
        for(int i=0;i<bookings.length;i++){
            int x = bookings [i][0];
            int y= bookings[i][1];
            arr[x-1]+= bookings [i][2];
           if(y<n) {
                    arr[y] -= bookings[i][2];
                }
        }
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
}
