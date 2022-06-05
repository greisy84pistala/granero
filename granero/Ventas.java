public class Ventas {

    private String codigoventa;
    private String codarticulo;
    private String articulo;
    private double cantidad;

    public Ventas(String codigoventa, String codarticulo, String articulo, double cantidad) {
        this.codigoventa = codigoventa;
        this.codarticulo = codarticulo;
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public String getCodigoventa() { return codigoventa; }

    public void setCodigoventa(String codigoventa) { this.codigoventa = codigoventa; }

    public String getCodarticulo() { return codarticulo; }

    public void setCodarticulo(String codarticulo) { this.codarticulo = codarticulo; }

    public String getArticulo() { return articulo; }

    public void setArticulo(String articulo) { this.articulo = articulo; }

    public double getCantidad() { return cantidad; }

    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    void verInfo(){
        System.out.println("************************************");
        System.out.println("VENTAS");
        System.out.println("CodVenta: " + codigoventa );
        System.out.println("CodArticulo: " + codarticulo);
        System.out.println("Articulos: " + articulo );
        System.out.println("Cantidad: " + cantidad);

    }
}
