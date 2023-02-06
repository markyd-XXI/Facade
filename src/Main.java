/**
 * This program is demonstrating the facade pattern
 */
public class Main {
    /**
     * These clients only know about the simple public interface of the API and not the more complex underlying subsystem
     * behind each call.
     */
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------------------");
        System.out.println("-API Client 1 making a call to placeOrder()-");
        ThirdPartyApi apiClient1 = new ThirdPartyApi();
        apiClient1.placeOrder(8764, 2);
        System.out.println("---------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------");
        System.out.println("-API Client 3 making a call to cancelOrder()-");
        ThirdPartyApi apiClient2 = new ThirdPartyApi();
        apiClient2.cancelOrder(4321);
        System.out.println("---------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------");
        System.out.println("-API Client 3 making a call to isOrderReady()-");
        ThirdPartyApi apiClient3 = new ThirdPartyApi();
        apiClient3.isOrderReady(7575);
        System.out.println("---------------------------------------------------------------");
    }
}