package weathermachine;

/**
 * @author Lin1c
 * @date 2021/2/2 10:55 上午
 */
public abstract class BaseMachine {
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void start() {
        status = true;
    }

    protected abstract boolean shouldStart(final int temp, final int humidity, final int windPower);

    public void watch(final int temp, final int humidity, final int windPower) {
        if (shouldStart(temp, humidity, windPower)) {
            start();
        }
    }
}
