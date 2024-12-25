public class ExceptionExp {
    public static void main(String[] args) {
        try{
            int[] a= {1,2,3,4,5};
            System.out.println(a[10]);
        }catch(Exception e){
            System.out.println(e);
            // Following an order is impotent when we are using multiple catch
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}