package entidades;

public class programa {

    public static void main(String[] args) {
        Bebida articulo1 = new Bebida("Coca", 0.6, 50, 36);
//        articulo1.nombre = "Coca";
//        articulo1.precio = 50;
//        articulo1.stock = 36;
//        articulo1.litro = 0.6;

        Bebida articulo2 = new Bebida("Fanta", 1.5, 70, 30);
//        Bebida articulo2 = new Bebida();
//        articulo2.nombre = "Fanta";
//        articulo2.precio = 70;
//        articulo2.stock = 30;
//        articulo2.litro = 1.5;

        System.out.println(articulo1.getStock());
        System.out.println(articulo1);
        articulo1.setStock(20);
        System.out.println(articulo1);

        articulo1.setNombre("Coca");
        String nombre = articulo1.getNombre();
        System.out.println(articulo1.getNombre());
//        System.out.println(articulo1);
//        System.out.println(articulo2);

        // PEDIDO A PROVEEDOR
        articulo1.pedidoAlProveedor(230);
        System.out.println(articulo1);
        articulo1.quieroElPedido();
        System.out.println("Objeto luego del pedido al proveedor;");
        articulo1.consultarElPedido();
 
        articulo2.setNombre("Fanta");
        nombre = articulo2.getNombre();
        System.out.println(articulo2.getNombre());
        
        articulo2.pedidoAlProveedor(78);
        System.out.println(articulo2);
        articulo2.quieroElPedido();
        System.out.println("Objeto luego del pedido al proveedor;");
        articulo2.consultarElPedido();
    }
}
