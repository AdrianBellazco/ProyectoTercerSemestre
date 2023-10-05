
import java.util.ArrayList;


public class NewMain {
  ArrayList<Integer> lista= new ArrayList<>();
    
    public void agregar1(){
     
      lista.add(1);
      imprimir(lista);
    }
        public void agregar2(){
           
      lista.add(2);
        imprimir(lista);
    }
   public void agregar3(){
               
      lista.add(3);
        imprimir(lista);
    }
   
   public void imprimir (ArrayList<Integer> lista){
   
       for (int i = 0; i < lista.size(); i++) {
           Integer pos = lista.get(i);
           System.out.println("posicion ["+i+"] :"+pos);
       }
       
       
   }
            

  
    public static void main(String[] args) {
        NewMain obj = new NewMain();
     
        obj.agregar1();
      //    obj.agregar3();
    //     obj.agregar2();
       
        
        
      
    }
    
}
