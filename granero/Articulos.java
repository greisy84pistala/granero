import java.util.ArrayList;
import java.util.List;

public class Articulos {
    private String codigo;
    private String articulo;
    private String categoria;
    private double cantidad;
    private double valorcompra;

    //constructor
    public Articulos(String codigo, String articulo, String categoria, double cantidad, double valorcompra) {
        this.codigo = codigo;
        this.articulo = articulo;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valorcompra = valorcompra;
    }

    //getter y setter
    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getArticulo() { return articulo; }

    public void setArticulo(String articulo) { this.articulo = articulo; }

    public String getCategoria() { return categoria; }

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getCantidad() { return cantidad; }

    public void setCantidad(double cantidad) { this.cantidad = cantidad; }

    public double getValorcompra() { return valorcompra; }

    public void setValorcompra(double valorcompra) { this.valorcompra = valorcompra; }

    void verInfo(){

        System.out.println("Codigo " + "     " +"Articulos"+ "     " +"categoria"+ "        " +"cantidad"+ "     " +"valor de compra");
        System.out.println(codigo + "           " +articulo+ "          " +categoria + "           " + cantidad+ "           " +valorcompra);

    }













}


