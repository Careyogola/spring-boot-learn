import java.util.logging.*;

class Inheritance {

    Logger logger = Logger.getLogger(Inheritance.class.getName());

    String color;
    int speed;
    int size;
    int weight;

    void attributes() {
        logger.info("color:" + color);
        logger.info("speed:" + speed);
        logger.info("size:" + size);
        logger.info("weight:" + weight);
    }
}

class Car extends Inheritance {

    int gears; 
    int CC;

    void attributescar() {
        logger.info("color:" + color);
        logger.info("speed:" + speed);
        logger.info("size:" + size);
        logger.info("weight:" + weight);
        logger.info("No of gears:" + gears);
        logger.info("The engine CC:" + CC);
    }
}

class Test {

    public static void main(String[] args) {
        Car vw = new Car();

        vw.color = "Black";
        vw.size = 45;
        vw.speed = 260;
        vw.CC = 2000;
        vw.gears = 5;

        vw.attributescar();
    }
}