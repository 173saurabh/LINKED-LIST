void reverseInGroups(ArrayList<Integer> arr, int n, int k) 
    {
        if(k==1)
        {
            Collections.reverse(arr);
            return;
        }
        Stack<Integer> stk=new Stack<>();
        int j=0,num=0,f=0;
        if(n%k!=0)
        {
            num=(n/k)+1;
        }
        else
            num=n/k;
        for(int i=0;i<num;i++)
        {
            while(f<n)
            {
                stk.push(arr.get(f));
                f++;
                if(f%k==0)
                    break;
            }
            while(!stk.isEmpty())
            {
                arr.set(j,stk.pop());
                j++;
            }
        }
