/*
Se almacena las variables de los radiobuttons
 */

/**
 *
 * @author Adrian
 */

public class RegistrarVariablesRadioButtons {
    private String Radiomasculino, radiofemenino, radionoidentificado, radiotodoslosgeneros;
     private String radioaño2020, radioaño2018, radioaño2019, radiotodosaños; 
     private String radiocedula, radioid, todosid;
     private String radiomixto, radiocolmasculino, radiocolfemenino, radiocoltodos;
     private String radiorural, radiourbano, radiotodos;
     
    public RegistrarVariablesRadioButtons(){
     Radiomasculino= radiofemenino= radionoidentificado=radiotodoslosgeneros="-";
     radioaño2020= radioaño2018= radioaño2019= radiotodosaños="-";
     radiocedula= radioid= todosid="-";
     radiomixto= radiocolmasculino= radiocolfemenino= radiocoltodos="-";
     radiorural= radiourbano= radiotodos="-";
    }
    
    
    
    //RADIO DE TODOS LOS AÑOS

    public String getRadioaño2020() {
        return radioaño2020;
    }

    public void setRadioaño2020( ) {
        this.radioaño2020 = "2020";
    }

    public String getRadioaño2018() {
        return radioaño2018;
    }

    public void setRadioaño2018( ) {
        this.radioaño2018 = "2018";
    }

    public String getRadioaño2019() {
        return radioaño2019;
    }

    public void setRadioaño2019( ) {
        this.radioaño2019 = "2019";
    }

    public String getRadiotodosaños() {
        return radiotodosaños;
    }

    public void setRadiotodosaños( ) {
        this.radiotodosaños = "Todos los años";
    }
    
//PARA EL TIPO DE DOCUMENTO
    
    public String getRadiocedula() {
        return radiocedula;
    }

    public void setRadiocedula( ) {
        this.radiocedula = "Cedula";
    }

    public String getRadioid() {
        return radioid;
    }

    public void setRadioid( ) {
        this.radioid = "Tarjeta de identidad";
    }

    public String getTodosid() {
        return todosid;
    }

    public void setTodosid( ) {
        this.todosid = "Todos los ID";
    }
    
    
    //RADIO DE TODOS LOS GENEROS

    public String getRadiomasculino() {
        return Radiomasculino;
    }

    public void setRadiomasculino( ) {
        this.Radiomasculino = "Masculino";
    }

    public String getRadiofemenino() {
        return radiofemenino;
    }

    public void setRadiofemenino( ) {
        this.radiofemenino = "Femenino";
    }

    public String getRadionoidentificado() {
        return radionoidentificado;
    }

    public void setRadionoidentificado( ) {
        this.radionoidentificado = "No identificado";
    }

    public String getRadiotodoslosgeneros() {
        return radiotodoslosgeneros;
    }

    public void setRadiotodoslosgeneros( ) {
        this.radiotodoslosgeneros = "Todos los generos";
    }
    
    //RADIO DE GENEROS DE COLEGIO

    public String getRadiomixto() {
        return radiomixto;
    }

    public void setRadiomixto( ) {
        this.radiomixto = "Colegio mixto";
    }

    public String getRadiocolmasculino() {
        return radiocolmasculino;
    }

    public void setRadiocolmasculino( ) {
        this.radiocolmasculino = "Colegio masculino";
    }

    public String getRadiocolfemenino() {
        return radiocolfemenino;
    }

    public void setRadiocolfemenino( ) {
        this.radiocolfemenino = "Colegio femenino";
    }

    public String getRadiocoltodos() {
        return radiocoltodos;
    }

    public void setRadiocoltodos( ) {
        this.radiocoltodos = "todos los generos de colegio";
    }
    
    //ZONA COLEGIO

    public String getRadiorural() {
        return radiorural;
    }

    public void setRadiorural( ) {
        this.radiorural = "Rural";
    }

    public String getRadiourbano() {
        return radiourbano;
    }

    public void setRadiourbano( ) {
        this.radiourbano = "Urbano";
    }

    public String getRadiotodosarea() {
        return radiotodos;
    }

    public void setRadiotodosarea( ) {
        this.radiotodos = "Todas las zonas";
    }
    
    
    
    
    
    
    
}
