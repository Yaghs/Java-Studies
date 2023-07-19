public class MegaBytesConverter {
    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabyte = kiloBytes / 1024;
        int kilobit = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        } else {

            System.out.println(kiloBytes + "KB  ="+ megabyte + " and " + "MB " + kilobit + "KB");
        }
    }
}
