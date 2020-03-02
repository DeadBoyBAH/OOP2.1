public interface ShipInterface {
    void move(final int newSpeed); // запускает корабль

    void stop(); // останавилвает корабль

    boolean isMoving(); // показывает, движется ли корабль

    int getSpeed(); // показывает скорость корабля

    void showGerb(); // показывает герб корабля
}
