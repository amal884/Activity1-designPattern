public class AdapterImpl extends ImplNonStandard implements Ifiltrer {
    @Override
    public int[] filter(int[] data) {

        appliquerFiltre("NonStandardImplementation",data);
        return new int[0];
    }
}
