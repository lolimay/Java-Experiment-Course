interface Alarm {
    void alarm();
}
abstract class Door {
    abstract void open();
    abstract void close();
}
class AlarmDoor extends Door implements Alarm {
    @Override
    void open() {
        System.out.println("open the door");
    }
    @Override
    void close() {
        System.out.println("close the door");
    }
    public void alarm() {
        System.out.println("alarm!");
    }
}
public class App {
    public static void main(String[] args) {
        AlarmDoor alarmDoor = new AlarmDoor();
        alarmDoor.open();
        alarmDoor.close();
        alarmDoor.alarm();
    }
}