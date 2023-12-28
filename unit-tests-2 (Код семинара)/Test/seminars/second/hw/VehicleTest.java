package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Vehicle motorcicle;
    @BeforeEach
    void Before(){
        car = new Car("Toyota", "Carolla", 1990);
        motorcicle = new Motorcycle("Suzuki", "GSX-8R", 2023);
    }
    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void CarIsVehicle (){
        assert (car instanceof Vehicle);
    }
    //- проверка того, объект Car создается с 4-мя колесами

    @Test
    void CarHasFourWheels(){
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    //- проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleHasTwoWheels(){
        assertThat(((Motorcycle)motorcicle).getNumWheels()).isEqualTo(2);
    }
    //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void CarHasSpeedSixtyInTestDrive(){
        car.testDrive();
        assertThat((car).getSpeed()).isEqualTo(60);
    }
    //- проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void MotorcycleHasSpeedSeventyFiveInTestDrive(){
        motorcicle.testDrive();
        assertThat(((Motorcycle)motorcicle).getSpeed()).isEqualTo(75);
    }
    //- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void CarHasSpeedNullAfterTestDriveInPark(){
        car.testDrive();
        car.park();
        assertThat((car).getSpeed()).isEqualTo(0);
    }
    //- проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void MotorcycleHasNullAfterTestDriveInPark(){
        motorcicle.testDrive();
        motorcicle.park();
        assertThat(((Motorcycle)motorcicle).getSpeed()).isEqualTo(0);
    }


}