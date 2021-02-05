package weathermachine;

public class WateringMachine extends BaseMachine {

    private static final int MIN_TEMP = 10;
    private static final int MAX_HUMIDITY = 55;
    private static final int MAX_WIND_POWER = 4;

    @Override
    protected boolean shouldStart(int temp, int humidity, int windPower) {
        return temp > MIN_TEMP && humidity < MAX_HUMIDITY && windPower < MAX_WIND_POWER;
    }
}