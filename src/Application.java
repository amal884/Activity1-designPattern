import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ImageContext context = new ImageContext();
        context.appliquerStrategy();


        Scanner scanner = new Scanner( System.in);
        while (true) {
            System.out.println("Le nom de strategy :");
            String strategyClassName= scanner.nextLine();
            Ifiltrer strategy =(Ifiltrer) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.appliquerStrategy();
            System.out.println("Le nom de Template de Compression :");
            String CompressionClassName= scanner.nextLine();
            CompressionTemplate template =(CompressionTemplate) Class.forName(CompressionClassName).newInstance();
            context.setCompression(template);
            context.appliquerCompression();

        }
    }
}
