package SecurityService;

public class SecurityData {
    private boolean alarmOn;
    private boolean lock;

    // Constructor
    public SecurityData(boolean alarmOn, boolean lock) {
        this.alarmOn = alarmOn;
        this.lock = lock;
    }

    // Getters and Setters
    public boolean isAlarmOn() {
        return alarmOn;
    }

    public void setAlarmOn(boolean alarmOn) {
        this.alarmOn = alarmOn;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    @Override
    public String toString() {
        return "SecuritySettingsRequest{" +
                "alarmOn=" + alarmOn +
                ", lock=" + lock +
                '}';
    }
}
