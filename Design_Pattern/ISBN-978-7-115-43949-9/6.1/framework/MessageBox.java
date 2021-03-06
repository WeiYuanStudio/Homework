package framework;

public class MessageBox extends Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String info) {
        printLine(info.length());


        System.out.print(decochar);
        System.out.print(info);
        System.out.println(decochar);

        printLine(info.length());
    }

    private void printLine(int infoLength) {
        for (int i = 0; i < infoLength + 2; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }
}