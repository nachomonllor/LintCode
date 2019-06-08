public boolean isValidParentheses(String s) {
        // write your code here
        
         if (s.length() == 0) return true;

            Stack<Character> pila = new Stack<Character>();
            HashMap<Character, Character> dic = new HashMap ();
            //dic['['] = ']';
            //dic['('] = ')';
            //dic['{'] = '}';
            dic.put('(', ')');
            dic.put('[', ']');
            dic.put('{', '}');
            int balanceado = 0;
            
            for (int i = 0; i < s.length(); i++)
            {
                if (dic.containsKey(s.charAt(i)))
                {
                     
                        pila.push(s.charAt(i));
                        //paso = true;
                        balanceado++;
                }
                else
                {
                    //if(pila.Count == 0 ) return false;
                    if (!pila.empty() && dic.get(pila.peek()) != s.charAt(i)) return false;
                    if (!pila.isEmpty())
                    {
                        pila.pop();
                    }
                    balanceado--;
                }
            }
            return balanceado == 0 && pila.isEmpty() ;
        
    }