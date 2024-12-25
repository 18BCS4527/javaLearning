/**
 * InnerCustomExceptionExps
 */
class InnerCustomExceptionExps extends Exception {
    boolean ageCheck(int a) throws Exception{
        if(a>=18){
            return true;
        }else{
            throw new Exception("Age limit Exception");
        }
    }
    
}
public class CustomExceptionExps {
    public static void main(String[] args) {
        InnerCustomExceptionExps inner = new InnerCustomExceptionExps();
        int a=16;
        try{
            System.out.println(inner.ageCheck(a));
        }catch(Exception e){
            System.out.println(e);
        }
        

    }
}
