import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        //ARTICULOS
        Articulos arti1 = new Articulos("0.1","Arroz","0-A",500,2300);
        Articulos arti2 = new Articulos("0.2","Cafe","0-A",300,2500);
        Articulos arti3 = new Articulos("0.3","Frijol","0-A",400,3700);
        Articulos arti4 = new Articulos("0.4","Sal","0-A",200,1000);
        Articulos arti5 = new Articulos("0.5","Jabon","0-B",150,800);
        Articulos arti6 = new Articulos("0.6","Betun","0-B",300,900);
        Articulos arti7 = new Articulos("0.7","Avena","0-A",400,2800);
        Articulos arti8 = new Articulos("0.8","Trigo","0-A",300,1800);
        Articulos arti9 = new Articulos("0.9","Panela","0-A",200,1500);
        Articulos arti10 = new Articulos("1.0","Limpido","0-B",300,1200);

        //ver informacion de los articulos
        arti1.verInfo(); arti2.verInfo(); arti3.verInfo(); arti4.verInfo();
        arti5.verInfo(); arti6.verInfo(); arti7.verInfo(); arti8.verInfo();
        arti9.verInfo(); arti10.verInfo();

       //CATEGORIAS

        CategoriaArticulo categoria1 = new CategoriaArticulo("0-A","Alimetos",10);
        CategoriaArticulo categoria2 = new CategoriaArticulo("0-B", "Aseo",15);

        //ver informacion de categoria 1 y 2
        categoria1.verInfo();
        categoria2.verInfo();

        // VENTAS
        Ventas ven1 = (new Ventas("0-A","0.1","Arroz",4));
        Ventas ven2 = new Ventas("0-A","0.3","frijol",3);
        Ventas ven3 = new Ventas("0-A","0.7","avena",2);
        Ventas ven4 = new Ventas("0-A","0.9","panela",3);
        Ventas ven5 = new Ventas("0-A","0.5","jabon",2);
        Ventas ven6 = new Ventas("0-B","0.1","arroz",5);
        Ventas ven7 = new Ventas("0-B","0.5","jabon",4);
        Ventas ven8 = new Ventas("0-C","0.8","trigo",3);
        Ventas ven9 = new Ventas("0-C","0.9","panela",2);
        Ventas ven10 = new Ventas("0-C","1.0","limpido",4);
        Ventas ven11 = new Ventas("0-D","0.2","café",4);
        Ventas ven12 = new Ventas("0-D","0.5","jabon",3);
        Ventas ven13 = new Ventas( "0-B","0.3","frijol",5);

        //ver informacion de las ventas
        ven1.verInfo(); ven2.verInfo(); ven3.verInfo(); ven4.verInfo();
        ven5.verInfo(); ven6.verInfo(); ven7.verInfo(); ven8.verInfo();
        ven9.verInfo(); ven10.verInfo(); ven11.verInfo(); ven12.verInfo();
        ven13.verInfo();

    }
}
