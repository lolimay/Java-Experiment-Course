public class PC {
    PC(CPU cpu, HardDisk hardDisk) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }
    /**
     * @param cpu the cpu to set
     */
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    /**
     * @param hardDisk the hardDisk to set
     */
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void show() {
        System.out.println(cpu.getSpeed());
    }
    private CPU cpu;
    private HardDisk hardDisk;
}