package weathermachine;

public class SeedingMachine extends BaseMachine {
    private static final int MIN_TEMP = 5;

    @Override
    protected boolean shouldStart(int temp, int humidity, int windPower) {
        return temp > MIN_TEMP;
    }
}