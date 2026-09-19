function merge(List a, List b)  
{
      if( list a is null ) return list b
      if(list b is null ) return list a

       List ans = null

      if(a.data<b.data) // add a node to answer
      {
          ans=a
          ans.next=merge(a.next,b)
      }
      else if(b.data<a.data) // add b node to answer
      {
          ans=b
          ans.next=merge(a,b.next)
      }
      else     //This is important to handle duplicate elements
      {
          ans=b // you can write a or b(any)
          ans.next=merge(a.next,b.next)  //move both pointers.
      }

               return ans
}