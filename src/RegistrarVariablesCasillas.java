
import javax.swing.JOptionPane;

/*
Aca se registraran todas las selecciones
 */

/**
 *
 * @author USUARIO
 */
public  class   RegistrarVariablesCasillas{
   
   
    private String  Hombres,Mujeres,Noidentificados,Todo;
    private String año2020, año2018, año2019, todosaños; 
    private String cedula, ID, IDtodos;
    private String mixto, Colfemenino, Colmasculino, coltodos;
    private String urbana, rural, zonatodos;

    public RegistrarVariablesCasillas() {
       año2020=  año2018= año2019= todosaños="-"; 
        Hombres =   Mujeres = Noidentificados =Todo = "-";
        cedula=ID=IDtodos="-";
       mixto= Colfemenino=Colmasculino=coltodos="-";
        urbana= rural= zonatodos="-";
         
    }
    
      //GETTER SETTER PARA AÑOS

    public String getAño2020() {
        return año2020;
    }

    public void setAño2020( ) {
        this.año2020 = "2020";
    }

    public String getAño2018() {
        return año2018;
    }

    public void setAño2018( ) {
        this.año2018 = "2018";
    }

    public String getAño2019() {
        return año2019;
    }

    public void setAño2019( ) {
        this.año2019 = "2019";
    }

    public String getTodosaños() {
        return todosaños;
    }

    public void setTodosaños( ) {
        this.todosaños = "TodosAños";
    }
    
     //GETTER SETTER PARA TIPO DE DOCUMENTO

    public String getCedula() {
        return cedula;
    }

    public void setCedula( ) {
        this.cedula = "cedula";
    }

    public String getID() {
        return ID;
    }

    public void setID() {
        this.ID = "Tarjeta de identidad";
    }

    public String getIDtodos() {
        return IDtodos;
    }

    public void setIDtodos( ) {
        this.IDtodos = "Todos";
    }
    
    
    //GETTER SETTER PARA GENERO

    public String getHombres() {
        return Hombres;
    }

    public void setHombres( ) {
        this.Hombres = "Hombre";
    }

    public String getMujeres() {
        return Mujeres;
    }

    public void setMujeres( ) {
        this.Mujeres = "Mujeres";
    }

    public String getNoidentificados() {
        return Noidentificados;
    }

    public void setNoidentificados( ) {
        this.Noidentificados = "Noidentificados";
    }

    public String getTodo() {
        return Todo;
    }

    public void setTodo() {
        this.Todo = "Todo";
    }
    
        //GETTER SETTER PARA GENERO DEL COLEGIO

    public String getMixto() {
        return mixto;
    }

    public void setMixto( ) {
        this.mixto = "Mixto";
    }

    public String getColfemenino() {
        return Colfemenino;
    }

    public void setColfemenino( ) {
        this.Colfemenino = "Femenino";
    }

    public String getColmasculino() {
        return Colmasculino;
    }

    public void setColmasculino( ) {
        this.Colmasculino = "Masculino";
    }

    public String getColtodos() {
        return coltodos;
    }

    public void setColtodos( ) {
        this.coltodos = "Todos los generos del colegio";
    }
    
    
    
     //GETTER SETTER PARA AREA DEL COLEGIO

    public String getUrbana() {
        return urbana;
    }

    public void setUrbana( ) {
        this.urbana = "Urbana";
    }

    public String getRural() {
        return rural;
    }

    public void setRural( ) {
        this.rural = "Rural";
    }

    public String getZonatodos() {
        return zonatodos;
    }

    public void setZonatodos( ) {
        this.zonatodos = "Todas las zonas";
    }
    
    
    
}