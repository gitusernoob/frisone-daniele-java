package lezione6.forme;

public class Quadrato extends Poligoni{


    Double lato;


    public Quadrato(Double lato) {
        this.lato = lato;
    }


    @Override
    public void areaPoligono(){
        super.area = lato*lato;
    }

    @Override
    public  void perimetroPoligono(){
        super.perimetro = lato*4;
    }



}
