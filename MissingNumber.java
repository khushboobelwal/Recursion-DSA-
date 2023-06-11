class MissingNumber {
    public static int MissingNumber(int[] nums) {
        int sum=0;
        int expectedSum=0;
        int len=nums.length;
        for(int i=0;i<=len;i++){
            expectedSum+=i;
        }
        for(int j=0;j<len;j++){
            sum+=nums[j];
        }
        int missing=expectedSum-sum;
        return missing;
        
    }

    public static void main(String[] args) {
       int nums[]={3,0,1};
       System.out.println(MissingNumber(nums));
    }
    }

	
