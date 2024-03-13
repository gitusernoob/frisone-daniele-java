package lezioneLab_13_03.eserciziSlide.Veicoli;

public class Moto extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("la moto fa tu tutu tuutu ");
    }

    @Override
    public void stopEngine() {
        System.out.println("la moto fa silenzio");
    }
}
