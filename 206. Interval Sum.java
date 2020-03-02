 public static List<Long> intervalSum(int[] A, List<Interval> queries)
        {
            // write your code here

            Long suma = new Long( 0);
            HashMap<  Integer, Long> hash =
                new HashMap();
             
            for (int i = 0; i < A.length; i++)
            {
                suma += A[i];
                //hash[i] = suma;
                hash.put(i, suma);
            }

            List<Long> lista = new ArrayList ();
            for (int i = 0; i < queries.size(); i++)
            {
                int start = queries.get(i).start;
                int end = queries.get(i).end;

                if (start - 1 >= 0)
                {
                    //lista.Add(hash[end] - hash[start - 1]);
                    lista.add(hash.get(end) - hash.get(start - 1));
                }
                else
                {
                    //lista.Add(hash[end]);
                    lista.add(hash.get(end));
                }
            }
            return lista;
        }
       