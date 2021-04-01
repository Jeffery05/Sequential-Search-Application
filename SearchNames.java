public class SearchNames{
   public static int findName(String[] arr, String name){
      for (int i = 0; i < arr.length; i++){
         if (arr[i].equals(name)){
            return i;
         }
      }
      return -1;
   }
   
   public static void main (String args[]){
      String[] listOfNames = {"Jeffery", "Ming", "Josh", "Kevin", "Sarah", "Mandy", "Sophia"};
      String name = "Sophia";
      int position = findName (listOfNames, name);
      if (position != -1){
         System.out.println(name + " is on the list. She currently sits at position " + (position + 1) + ".");
      }
      else {
         System.out.println(name + " is not on the list.");
      }
   }
}