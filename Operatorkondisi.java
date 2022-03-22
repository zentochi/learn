/**
 *
 * @author Danuarta
 */
public class Operatorkondisi {
    public static void main (String[]args){
        String status ;
        int grade = 45;
        //mendapatkan status pelajar
        status = (grade>= 60)?"passed":"fail";
        
        System.out.println(status);
    }   
}
