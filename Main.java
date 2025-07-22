import java.util.*;//java.util is a package
public class Main 
{
    //function type:access_specifier static(type) returntype name
    public static void main(String[] args) 
    {
      System.out.println("kja");
      int[] arr={1,2,3,4};
      int val=17;
      //System.out.println(a.length());
      //System.out.println(a.indexOf("a"));
      //System.out.println(a.charAt(2));
      // System.out.println(val>18?"good":"bad");
      // int[][] arr={{1,2,3,4,5},{6,7,8,9,0}};
      // for(int i=0;i<arr.length;i++)
      // {
      //   for(int j=0;j<arr[0].length;j++)
      //   {
      //     System.out.print(arr[i][j]+" ");
      //   }
      // } 
      ArrayList<Integer> list=new ArrayList<>();//part of list collection
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      //list.remove(Integer.valueOf(3));
      list.add(5);
      Iterator<Integer> it=list.iterator();
      while(it.hasNext())
      {
        System.out.print("List item "+it.next());
      }
      for(int item:list)
      {
         System.out.println(item);
      }
      //Collections.sort(list,Collections.reverseOrder());
      System.out.println(list);
      for(int i:list)
      {
          System.out.println(i);
      }
      TreeSet<Integer> n=new TreeSet<>();//part of set collection
      n.add(1);
      n.add(2);
      n.remove(2);
      n.add(3);
      n.add(4);
      
      System.err.println("set is "+n);
      TreeMap<Integer,Integer> map=new TreeMap<>();//part of mp collection
      map.put(1,2);
      map.put(2,3);
      map.put(3,4);
      map.put(4,5);
      map.get(1);
      
      System.out.println("Key is present "+map.containsKey(5));
      for(int item :map.keySet())
      {
          System.out.println("key: "+item+" value: "+map.get(item));
      }
      //System.out.println(map);
      //arraylist,linkedlist,hashset,treeset,linkedhashset,hashmap,treemap,linkedhashmap
      Employee e1=new Employee(25000,"kja");
    }
}
