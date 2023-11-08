
import java.util.ArrayList;

public  class DatosPorSeparado {
    Calculos calculos = new Calculos();
    
    
    
//DATOS SEPARADOS 2020  
    public int get_año2020(ArrayList<String> año) {
        return año.size();
    }
    //GENERO
    
    public int get_hombre_2020(ArrayList<String> año){
         int hombre2020 = calculos.Contador(año, "M", 2);
         return hombre2020;
    }
    
    public int get_mujer_2020(ArrayList<String> año){
         int mujer = calculos.Contador(año, "F", 2);
         return mujer;
    }
    
    //TIPO DE DOCUMENTO
    
    public int get_cedula_2020(ArrayList<String> año){
         int cedula2020 = calculos.Contador(año, "CC", 0);
         return cedula2020;
    }
    
    public int get_tarjetaID_2020(ArrayList<String> año){
         int TI = calculos.Contador(año, "TI", 0);
         return TI;
    }
    
   // GENERO COLEGIO
    
       public int get_Colhombre_2020(ArrayList<String> año){
        int colegiomasculino2020 = calculos.Contador(año, "MASCULINO", 10);
         return colegiomasculino2020;
    }
    
    public int get_Colmujer_2020(ArrayList<String> año){
         int colegioFEMENINO2020 = calculos.Contador(año, "FEMENINO", 10);
         return colegioFEMENINO2020;
    }
    
      public int get_Colmixto_2020(ArrayList<String> año){
          int colegiomixto2020 = calculos.Contador(año, "MIXTO", 10);
         return colegiomixto2020;
    }
      
      //AREA DEL COLEGIO
      
        public int get_areaRural_2020(ArrayList<String> año){
          int colegioRURAL2020 = calculos.Contador(año, "RURAL", 12);
         return colegioRURAL2020;
    }
        
         public int get_areaUrbana_2020(ArrayList<String> año){
          int colegioURBANO2020 = calculos.Contador(año, "URBANO", 12);
         return colegioURBANO2020;
    }
      
    
    
    //DATOS SEPARADOS 2019
    public int get_año2019(ArrayList<String> año) {
        return año.size();
    }
    
     //GENERO
    
    public int get_hombre_2019(ArrayList<String> año){
         int hombre2020 = calculos.Contador(año, "M", 2);
         return hombre2020;
    }
    
    public int get_mujer_2019(ArrayList<String> año){
         int mujer = calculos.Contador(año, "F", 2);
         return mujer;
    }
    
    //TIPO DE DOCUMENTO
    
    public int get_cedula_2019(ArrayList<String> año){
         int cedula2020 = calculos.Contador(año, "CC", 0);
         return cedula2020;
    }
    
    public int get_tarjetaID_2019(ArrayList<String> año){
         int TI = calculos.Contador(año, "TI", 0);
         return TI;
    }
    
   // GENERO COLEGIO
    
       public int get_Colhombre_2019(ArrayList<String> año){
        int colegiomasculino2020 = calculos.Contador(año, "MASCULINO", 10);
         return colegiomasculino2020;
    }
    
    public int get_Colmujer_2019(ArrayList<String> año){
         int colegioFEMENINO2020 = calculos.Contador(año, "FEMENINO", 10);
         return colegioFEMENINO2020;
    }
    
      public int get_Colmixto_2019(ArrayList<String> año){
          int colegiomixto2020 = calculos.Contador(año, "MIXTO", 10);
         return colegiomixto2020;
    }
      
      //AREA DEL COLEGIO
      
        public int get_areaRural_2019(ArrayList<String> año){
          int colegioRURAL2020 = calculos.Contador(año, "RURAL", 12);
         return colegioRURAL2020;
    }
        
         public int get_areaUrbana_2019(ArrayList<String> año){
          int colegioURBANO2020 = calculos.Contador(año, "URBANO", 12);
         return colegioURBANO2020;
    }

    
    
    
    //DATOS SEPARADOS 2018

    public int get_año2018(ArrayList<String> año) {
        return año.size();
    }
    
    
    public int get_hombre_2018(ArrayList<String> año){
         int hombre2020 = calculos.Contador(año, "M", 2);
         return hombre2020;
    }
    
    public int get_mujer_2018(ArrayList<String> año){
         int mujer = calculos.Contador(año, "F", 2);
         return mujer;
    }
    
    //TIPO DE DOCUMENTO
    
    public int get_cedula_2018(ArrayList<String> año){
         int cedula2020 = calculos.Contador(año, "CC", 0);
         return cedula2020;
    }
    
    public int get_tarjetaID_2018(ArrayList<String> año){
         int TI = calculos.Contador(año, "TI", 0);
         return TI;
    }
    
   // GENERO COLEGIO
    
       public int get_Colhombre_2018(ArrayList<String> año){
        int colegiomasculino2020 = calculos.Contador(año, "MASCULINO", 10);
         return colegiomasculino2020;
    }
    
    public int get_Colmujer_2018(ArrayList<String> año){
         int colegioFEMENINO2020 = calculos.Contador(año, "FEMENINO", 10);
         return colegioFEMENINO2020;
    }
    
      public int get_Colmixto_2018(ArrayList<String> año){
          int colegiomixto2020 = calculos.Contador(año, "MIXTO", 10);
         return colegiomixto2020;
    }
      
      //AREA DEL COLEGIO
      
        public int get_areaRural_2018(ArrayList<String> año){
          int colegioRURAL2020 = calculos.Contador(año, "RURAL", 12);
         return colegioRURAL2020;
    }
        
         public int get_areaUrbana_2018(ArrayList<String> año){
          int colegioURBANO2020 = calculos.Contador(año, "URBANO", 12);
         return colegioURBANO2020;
    }
         
         

    

}
