class Solution {
    
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        char[] map = new char[1001];
        for(int i=0;i<arr1.length;i++){
            map[arr1[i]] ++;
        }
        
        int[] res = new int[arr1.length];
        int idx =0;
        for(int i=0;i<arr2.length;i++){
            int no = map[arr2[i]];
            for(int j=0;j<no;j++){
                res[idx++]=arr2[i];                   
            }                    
            map[arr2[i]]=0;
        }
        
        for(int i=0;i<map.length;i++){
            if(map[i]==0) continue;            
            int no = map[i];
            for(int j=0;j<no;j++){
                res[idx++]=i;              
            }                            
        }
        
        return res;
    }
}