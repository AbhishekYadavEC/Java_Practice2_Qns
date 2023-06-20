package practicesQns;


interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println ("Calling "+phoneNumber );
    }
    void pickCall(){
        System.out.println ("Connecting............" );
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    @Override
    public void takeSnap() {
        System.out.println ("Take Snap" );
    }

    @Override
    public void recordVideo() {
        System.out.println ("Record Video" );
    }

    @Override
    public String[] getNetworks() {
        System.out.println ("Getting list of Network" );
        String[] networlkList={"Johan","Riyan","Anjel"};
        return networlkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println ("Connecting to "+network );
    }
}
public class InterfacePractice4 {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone=new MySmartPhone ();
        mySmartPhone.getNetworks ();
    }
}
