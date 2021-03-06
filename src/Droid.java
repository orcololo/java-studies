public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello! My name is " + name + " and I'm a droid!";
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public void energyReport() {
        System.out.println("Battery level: " + batteryLevel);
    }

    public void energyTransfer(int energyAmount) {

    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Rudolph");
        System.out.println(myDroid.toString());
        System.out.println(myDroid.batteryLevel);
        myDroid.performTask("dance");
        myDroid.energyReport();
    }
}