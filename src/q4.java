/* Question 4 ArrayIndexOutofBoundsException */

public class q4 {
   
     
    public static void main(String[] args) {
         int [] arr = {1,2,3};
         try{
            System.out.println(arr[2]);
    }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
         }
         finally{
            System.out.println("finally block executed");
         }
    }
}

    

