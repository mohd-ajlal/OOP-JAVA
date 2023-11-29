public class Main implements Writer,Reader{
    public static void main(String[] args) {
        Main obj = new Main();
        obj.read();
        obj.write();
    }

    @Override
    public void write() {
        System.out.println("Writing");
    }

    @Override
    public void read() {
        System.out.println("Reading");
    }
}

interface  Writer{
    void write();
    void read();
}
interface Reader{
    void read();
}