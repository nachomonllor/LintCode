public  void QuickSort(int[] a, int l, int r)
    {
        if (l >= r)
            return  ;

        int x = a[l];
        int i = l, j = r;

        while (i <= j)
        {
            while (a[i] < x) i++;
            while (a[j] > x) j--;

            if (i <= j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        QuickSort(a, l, j);
        QuickSort(a, i, r);



    }

    public void sortIntegers2(int[] A)
    {
        // write your code here
        QuickSort(A, 0, A.length - 1);

    }