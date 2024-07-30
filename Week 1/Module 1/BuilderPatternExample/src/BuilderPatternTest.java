public class BuilderPatternTest {
    public static void main(String[] args) {

        Computer pc1 = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("64 GB")
                .setStorage("5 TB SSD")
                .setGPU("RTX 4090")
                .build();

        Computer pc2 = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("8 GB")
                .setStorage("512 GB SSD")
                .setGPU("GTX 1650")
                .build();

        System.out.println(pc1);
        System.out.println(pc2);
    }
}
