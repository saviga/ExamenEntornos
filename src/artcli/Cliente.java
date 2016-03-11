
package artcli;

    public class Cliente {

    private String dni, nombre;
    private float descuento;

    public Cliente(String dni, String nombre, float descuento) {
        setDNI(dni);
        setNombre(nombre);
        setDescuento(descuento);
    }

    
    private void setDNI(String dni) {
        this.dni = dni;}
    

    private void setNombre(String nombre) {
        this.nombre = nombre;}
    

    private void setDescuento(float descuento) {
        this.descuento = descuento;}
    


    public String getDNI() {
        return dni;}
    

    public String getNombre() {
        return nombre;}
   

    public float getDescuento() {
        return descuento;}
    

}

