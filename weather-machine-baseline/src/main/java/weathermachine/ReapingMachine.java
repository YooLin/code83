package weathermachine;

public class ReapingMachine extends SeedingMachine {
    private static final int MIN_HUMIDITY = 65;

    @Override
    protected boolean shouldStart(final int temp, final int humidity, final int windPower) {
        return super.shouldStart(temp, humidity, windPower) && humidity > MIN_HUMIDITY;
    }
}
