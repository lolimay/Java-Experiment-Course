public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU(2200);
        HardDisk hardDisk = new HardDisk(200);
        PC pc = new PC(cpu, hardDisk);

        pc.setCpu(cpu);
        pc.setHardDisk(hardDisk);
        pc.show();
    }
}