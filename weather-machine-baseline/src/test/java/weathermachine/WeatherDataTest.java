package weathermachine;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Lin1c
 * @date 2021/2/2 10:25 上午
 */
public class WeatherDataTest {

    @Test
    public void allDown() {
        SeedingMachine seedingMachine = new SeedingMachine();
        ReapingMachine reapingMachine = new ReapingMachine();
        WateringMachine wateringMachine = new WateringMachine();
        WeatherData weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);

        weatherData.measurementsChanged(5, 0, 0);

        Assert.assertFalse("播种", seedingMachine.getStatus());
        Assert.assertFalse("收获", reapingMachine.getStatus());
        Assert.assertFalse("浇水", wateringMachine.getStatus());
    }

    @Test
    public void seedingMachineUp() {
        SeedingMachine seedingMachine = new SeedingMachine();
        ReapingMachine reapingMachine = new ReapingMachine();
        WateringMachine wateringMachine = new WateringMachine();
        WeatherData weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);

        weatherData.measurementsChanged(10, 65, 0);

        Assert.assertTrue("播种", seedingMachine.getStatus());
        Assert.assertFalse("收获", reapingMachine.getStatus());
        Assert.assertFalse("浇水", wateringMachine.getStatus());
    }

    @Test
    public void wateringMachineDown() {
        SeedingMachine seedingMachine = new SeedingMachine();
        ReapingMachine reapingMachine = new ReapingMachine();
        WateringMachine wateringMachine = new WateringMachine();
        WeatherData weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);

        weatherData.measurementsChanged(10, 66, 4);

        Assert.assertTrue("播种", seedingMachine.getStatus());
        Assert.assertTrue("收获", reapingMachine.getStatus());
        Assert.assertFalse("浇水", wateringMachine.getStatus());
    }

    @Test
    public void reapingMachineDown() {
        SeedingMachine seedingMachine = new SeedingMachine();
        ReapingMachine reapingMachine = new ReapingMachine();
        WateringMachine wateringMachine = new WateringMachine();
        WeatherData weatherData = new WeatherData(seedingMachine, reapingMachine, wateringMachine);

        weatherData.measurementsChanged(11, 54, 0);

        Assert.assertTrue("播种", seedingMachine.getStatus());
        Assert.assertFalse("收获", reapingMachine.getStatus());
        Assert.assertTrue("浇水", wateringMachine.getStatus());
    }
}