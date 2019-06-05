 public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        
        int i =0, j =0;
        int[] temp = new int[m + n];
        int k =0;
        while(i < m && j < n) {
            if(A[i] < B[j] ) {
                temp[k++] = A[i];
            }
            else{
                temp[k++] = B[j];
            }
        }
        
        while(i < m) {
            temp[k++] = A[i];
            i++;
        }
        while(j < n) {
            temp[k++] = B[j];
            j++;
        }
        
        for(  i =0; i<temp.length; i++) {
            A[i] = temp[i];
        }
    }