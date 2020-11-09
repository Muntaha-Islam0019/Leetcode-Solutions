class Solution {
public:
    bool canFormArray(vector<int>& arr, vector<vector<int>>& pieces) {

        int sum = 0;
        int n = arr.size();
        int m = pieces.size();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) { 
                if(arr[i] == pieces[j][0]) {

                    int p = pieces[j].size();

                    for(int k = 0; k < p; k++) {
                        if(arr[i] == pieces[j][k]) {
                            sum++;
                            i++;
                        }
                    }
                    
                    i--;
                }
            }
        }

        if(sum == n) {
            return true;
        } else {
            return false;
        }
    }
};