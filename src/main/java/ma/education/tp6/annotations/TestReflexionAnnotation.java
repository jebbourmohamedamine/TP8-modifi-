package ma.education.tp6.annotations;

public class TestReflexionAnnotation {
   // public static void main(String[] args) {
     //   Class c = Calculatrice.class;
       // Programmer programmer = (Programmer)
         //       c.getDeclaredAnnotation(Programmer.class);
        //System.out.println(programmer.id()+":"+programmer.name());
   public static void main(String[] args) {
       Class c = CalculatriceMath.class;
       Programmer programmer = (Programmer)
               c.getAnnotation(Programmer.class);
       System.out.println(programmer.id()+":"+programmer.name());
   }
}

