public class Main {
    public static void main(String[] args) {



        CombatShip space = new CombatShip("space", 50, 25);

        space.showGerb();
        System.out.println(space.name + " движется? - " + space.isMoving);
        space.move(20);
        System.out.println(space.name + " движется? - " + space.isMoving);
        System.out.println("Корабль " + space.name + " движется со скоростью " + space.getSpeed());
        space.attackOn();
        space.attackOff();
        space.stop();
        System.out.println(space.name + " движется? - " + space.isMoving);
        System.out.println();

        TradeShip venecia = new TradeShip("venecia");

        venecia.shipment(50);
        venecia.move(70);
        System.out.println("Корабль " + venecia.name + " движется со скоростью " + venecia.getSpeed());
        System.out.println("Корабль " + venecia.name + " прибыл в Севастопль");
        venecia.stop();
        venecia.unloading();
        System.out.println();

        PassengerShip titanic = new PassengerShip("titaic");

        titanic.landing(100);
        titanic.debarkation();
        titanic.landing(130, 15);
        titanic.move(30);
        titanic.showGerb();


    }

}
