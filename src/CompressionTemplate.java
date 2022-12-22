public abstract class CompressionTemplate {
    public int[] compresser (int [] data){
        System.out.println("initialisation........");
        Compresser1(data);

        return new int[0];
    }

    public abstract void Compresser1(int[] data);



}
