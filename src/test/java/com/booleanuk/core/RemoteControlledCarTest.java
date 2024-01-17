package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {
    @Test
    public void testForward() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        car.forward(50);
        Assertions.assertEquals(50, car.distanceTravelled);
        Assertions.assertEquals("Distance travelled: 50", car.forward(50));
        Assertions.assertEquals("Not allowed", car.forward(-10));
    }

    @Test
    public void testBackward() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        car.backward(-50);
        Assertions.assertEquals(-50, car.distanceTravelled);
        Assertions.assertEquals("Distance travelled: -50", car.backward(-50));
        Assertions.assertEquals("Not allowed", car.backward(10));
    }

    @Test
    public void testStop() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        Assertions.assertEquals("Car has stopped", car.stop());
        Assertions.assertNotNull("Car in motion", car.stop());
    }

    @Test
    public void testTurnRight() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        Assertions.assertEquals("Car has turned right", car.turnRight());
        Assertions.assertNotNull("Car has turned left", car.turnRight());
    }

    @Test
    public void testTurnLeft() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        Assertions.assertEquals("Car has turned left", car.turnLeft());
        Assertions.assertNotNull("Car has turned right", car.turnLeft());
    }

    @Test
    public void testDecreasePower() {
        RemoteControlledCar car = new RemoteControlledCar("black", "simple", "rechargable");
        Assertions.assertEquals(car.battery.powerRemaining, 100);
        car.forward(50);
        Assertions.assertNotEquals(car.battery.powerRemaining, 100);
        Assertions.assertTrue(car.battery.powerRemaining == 50);
    }
}