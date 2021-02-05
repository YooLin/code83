package weathermachine;

import java.util.LinkedList;
import java.util.List;

public class WeatherData {
    private final List<BaseMachine> machines;

    public WeatherData(final SeedingMachine seedingMachine, final ReapingMachine reapingMachine, final WateringMachine wateringMachine) {
        machines = new LinkedList<>();

        machines.add(seedingMachine);
        machines.add(reapingMachine);
        machines.add(wateringMachine);
    }

    public void measurementsChanged(int temp, int humidity, int windPower) {
        for (BaseMachine machine : machines) {
            machine.watch(temp, humidity, windPower);
        }
    }
}