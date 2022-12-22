public class ImageContext {

    int tableau [] = new int [20];

    private Ifiltrer strategy = new filtrerImpl1() ; // default strategy
    private CompressionTemplate compressionTemplate = new CompressionTemplateImpl() ;

    public void appliquerStrategy(  ){
        System.out.println("Initialisation"); // partie constante
        System.out.println(".........."); // partie constante
        strategy.filter(tableau);              // partie dynamique
        System.out.println(".........."); // code qui demeur constante

    }

    public void appliquerCompression(){
        System.out.println("Initialisation"); // partie constante
        System.out.println(".........."); // partie constante
        compressionTemplate.compresser(tableau);              // partie dynamique
        System.out.println(".........."); // code qui demeur constante



    }
    public void setCompression(CompressionTemplate template) {
        this.compressionTemplate = template;
    }

    public void setStrategy(Ifiltrer strategy) {
        this.strategy = strategy;
    }


}
