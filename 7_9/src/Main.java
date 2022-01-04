public class Main {
    public static void main(String[] args) {
            Container container = new Container();
            container.addCount(5672);
            System.out.println(container.getCount());

            for(int i = 1040; i <= 1103; ++i) {
                char c = (char)i;
                System.out.println(c);
            }

            System.out.println('Ё');
            System.out.println('ё');
    }
}
