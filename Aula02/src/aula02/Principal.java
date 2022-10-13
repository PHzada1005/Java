
package aula02;
 /**@author uniepedreis
 */
public class Principal {
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        GradeBook myGradeBook = new GradeBook();
        myGradeBook.displayMessage();
        myGradeBook.setCourseName("Engenharia de Robôs");
        System.out.println(myGradeBook.getCourseName());
    }
    
}
