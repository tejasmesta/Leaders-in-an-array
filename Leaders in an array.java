class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(arr[n-1]);

        int c=arr[n-1];

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>=c)
            {

                c=arr[i];

                ans.add(c);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}

