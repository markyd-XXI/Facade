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
        Response response1 = apiClient1.placeOrder(8764, 2);
        System.out.println(response1.getStatus());
        System.out.println(response1.getStatusCode());
        System.out.println(response1.getMessage());
        System.out.println("---------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------");
        System.out.println("-API Client 3 making a call to cancelOrder()-");
        ThirdPartyApi apiClient2 = new ThirdPartyApi();
        Response response2 = apiClient2.cancelOrder(4321);
        System.out.println(response2.getStatus());
        System.out.println(response2.getStatusCode());
        System.out.println(response2.getMessage());
        System.out.println("---------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------");
        System.out.println("-API Client 3 making a call to isOrderReady()-");
        ThirdPartyApi apiClient3 = new ThirdPartyApi();
        Response response3 = apiClient3.isOrderReady(7575);
        System.out.println(response3.getStatus());
        System.out.println(response3.getStatusCode());
        System.out.println(response3.getMessage());
        System.out.println("---------------------------------------------------------------");
    }
}