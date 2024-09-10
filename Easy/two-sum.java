//https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        for (int i=0;i<=nums.length;i++){
            //i got error here because out of bound i forget to do lenght -1 for j 
          for (int j=i+1;j<=nums.length-1;j++){
              
            if(nums[i]+nums[j]==target){
                
                res[0]=i;
                res[1]=j;
                return res ;
                
            }
            else {
                continue;
            }
        }   
        }
        return res;
    }
    
}

/*
[2,7,11,15]
i=0,res=in+im,target=9
i0=2, i1=7 res=2+7=9, res=target, stop
i0=2, i2=11 res=2+11=13, res!=target, continue
i0=2, i3=15 res=2+15=17, res!=target, continue
i1=7, i2=11 res=7+11=16, res!=target contunie
i1=7, i3=11 res=7+15=22, res!=target contunie
i1=7, i2=11 res=7+11=16, res!=target contunie
i2=11, i3=15 res=11+15=26 res!=target continue
#pseudo code
nums=[2,7,11,15]
target=9
for (i=0 in nums){
for(j=i+1 in nums){
    if(nums[i]+nums[j]==target){
        return [i,j]
    }
    else continuie
}
}
*/
