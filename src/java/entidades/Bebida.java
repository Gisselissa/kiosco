package entidades;

public class Bebida {

    private String nombre;
    private double litro;
    private double precio;
    private int stock;
    private int pedidoAlProveedor;

    public Bebida(String nombre, double litro, double precio, int stock) {
        this.nombre = nombre;
        this.litro = litro;
        this.precio = precio;
        this.stock = stock;
    }

    void consultarElPedido (){
        System.out.println("El pedido del producto " + nombre + " es: " + pedidoAlProveedor);
    }
    
    @Override
    public String toString() {
        return "Bebida{" + "nombre=" + nombre + ", litro=" + litro + ", precio=" + precio + ", stock=" + stock + ", pedidoAlProveedor=" + pedidoAlProveedor + '}';
    }

    void pedidoAlProveedor(int parametropedidoAlProveedor) {
        // System.out.println("Cantidad a pedir: " + parametropedidoAlProveedor); 
        this.pedidoAlProveedor = parametropedidoAlProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitro() {
        return litro;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    void quieroElPedido() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
