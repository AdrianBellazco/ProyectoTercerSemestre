
import javax.swing.JOptionPane;

/*
Aca se registraran todas las selecciones
 */

/**
 *
 * @author USUARIO
 */
public  class   RegistrarVariables{
   
    
    private int cont, Hombres,Mujeres,Noidentificados,Todo;

    public RegistrarVariables() {
        cont = 0;
        Hombres =0;
         Mujeres = 0;
          Noidentificados = 0;
         Todo = 0;
    }
    
     public void getHombres() {
         System.out.println("Hombres");
         JOptionPane.showMessageDialog(null, "Hombre");
    }
     
  

    public void  getMujeres() {
   System.out.println("Mujer");
  JOptionPane.showMessageDialog(null, "Mujer");
    }



    public void  getNoidentificados() {
        System.out.println("No identificado");
          JOptionPane.showMessageDialog(null, "No se");
    }

 

    public void  getTodo() {
          System.out.println("Todo");
            JOptionPane.showMessageDialog(null, "Todo");
    }

  
     

        
   
    }
    

