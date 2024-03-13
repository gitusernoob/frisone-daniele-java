package lezioneLab_13_03.eserciziSlide.Veicoli;

public  class Auto extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("la macchina fa brummmmm");
    }

    @Override
    public void stopEngine() {
        System.out.println("la macchina fa silenzio");
    }
}
