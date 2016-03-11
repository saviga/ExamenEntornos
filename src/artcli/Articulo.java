
package artcli;

public class Articulo {

    private String nombre;
    private float precio;
    private static float iva;
    
    /* Articulo.java va a ser subido al repositorio de gitHub  */ 
   
    public Articulo(String nombre, float precio) {
        setNombre(nombre);
        setPrecio(precio);
    }

    
    private void setNombre(String nombre) {
        this.nombre = nombre;}
    

    private void setPrecio(float precio) {
        this.precio = precio;}
    

    public static void setIVA(float iva) {
        Articulo.iva = iva;}
    

    
    public String getNombre() {
        return nombre;}
   

    public float getPrecio() {
        return precio;}
    

    public static float getIVA() {
        return iva;}
    

}

