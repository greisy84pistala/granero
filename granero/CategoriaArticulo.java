public class CategoriaArticulo {

    private String codCat ;
    private String categoria;
    private double ganacia;

    public CategoriaArticulo(String codCat, String categoria, double ganacia) {
        this.codCat = codCat;
        this.categoria = categoria;
        this.ganacia = ganacia;
    }


    public String getCodCat() { return codCat; }

    public void setCodCat(String codCat) { this.codCat = codCat; }

    public String getCategoria() { return categoria;}

    public void setCategoria(String categoria) { this.categoria = categoria; }

    public double getGanacia() { return ganacia; }

    public void setGanacia(double ganacia) { this.ganacia = ganacia; }

    //metodo para mostrar el tipo de categoria (alimentos, aseo)

    void verInfo(){
        System.out.println();
        System.out.println("CATEGORIA DE ARTICULOS");
        System.out.println("CodCat" + "      " +"Categoria"+ "     "+"Ganacia");
        System.out.println(codCat+ "         "+categoria+ "          "+ganacia);



    }
}
