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
        System.out.println(name + " battery level: " + batteryLevel + "W");
    }

    public void energyTransfer(int energyAmount, Droid droidGiver) {
        batteryLevel += energyAmount;
        droidGiver.batteryLevel -= energyAmount;
        System.out.println(droidGiver.name + " just donated " + energyAmount + " to " + name + ".");
        energyReport();
        droidGiver.energyReport();
    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Rudolph");
        Droid yourDroid = new Droid("C3P0");
        System.out.println(myDroid.toString());
        myDroid.energyReport();
        myDroid.performTask("dance");
        myDroid.energyReport();
        myDroid.energyTransfer(30, yourDroid);
    }
}