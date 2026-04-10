public class q3 {
    public static void main(String[] args) {
        int []arr = {10,20,30};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caught: " + e.getMessage());
        }
        finally{
            System.out.println("finally bolck exectuded");
        }
    }
}
