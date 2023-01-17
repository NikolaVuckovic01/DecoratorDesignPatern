public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new CD(computer);

        System.out.println("Imate: "+computer.description());
    }
}
