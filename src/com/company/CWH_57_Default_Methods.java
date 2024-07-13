package com.company;

interface MyCamera {
    void takeSnap();
    void recordVideo();
    //    private void greet() {
//        System.out.println("Good Morning");
//    }
    default void record4KVideo() {
//        greet();
        System.out.println("Recording in 4K..."); // They will print upper side on the spot they do not defined in lower side or they do not defined to making obj lower side
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling " + phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking snap");
    }

    @Override
//    public void record4KVideo() {
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry",  "Prashanth", "Anjali5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
//    public void callNumber(int phonenumber){
//        System.out.println("Calling " + phonenumber);
//    }
//    public void pickCall(){
//        System.out.println("Connecting... ");
//    }
}
public class CWH_57_Default_Methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
        ms.recordVideo();
        ms.takeSnap();
        ms.callNumber(70);
        ms.pickCall();
        ms.connectToNetwork("Harry");
    }
}