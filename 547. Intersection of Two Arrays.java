 public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        
        HashSet<Integer> hash = new HashSet();

        for(int i =0; i<nums1.length; i++) {
            hash.add(nums1[i]);
        }
        
        HashSet<Integer> hash_b = new HashSet();
        for(int i =0; i<nums2.length; i++) {
            hash_b.add(nums2[i]);
        }
        
        ArrayList<Integer> ans = new ArrayList();
        //for (int i = 0; i < nums2.length; i++)
        for(int item : hash_b)
        {
            if (hash.contains(item))
            {
                ans.add(item);
            }
        }
        Collections.sort(ans);
        int[] r = new int[ans.size()];
        
        for(int i =0; i<r.length; i++) {
            r[i] = ans.get(i);
        }
        return r;
        
    }