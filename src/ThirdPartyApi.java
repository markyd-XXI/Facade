
public class ThirdPartyApi {
    private OrderService orderService = new OrderService();
    public Response placeOrder(int customerId, int orderType){
        System.out.println("---ThirdPartyApi.placeOrder being called");
        Response response = new Response();
        if(orderService.doesCustomerAlreadyHavePendingOrder(customerId, orderType)){
            System.out.println("---Checking boolean status of orderService.doesCustomerAlreadyHavePendingOrder()");
            response.setStatusCode(429);
            System.out.println("---Setting status code");
            return response;
        }

        int orderId = orderService.createOrder(customerId);

        if(orderId > 0){
            response.setStatusCode(200);
            System.out.println("---Setting status code");
            response.setStatus("Success");
            System.out.println("---Setting status");
            response.setMessage(String.format("Order %s created", orderId));
            System.out.println("---Setting message");
        }

        return response;
    }

    public Response isOrderReady(int orderId){
        Response response = new Response();
        boolean isOrderReady = false;
        String status = orderService.getOrderStatus(orderId);
        response.setStatusCode(200);
        System.out.println("---Setting status code");
        response.setStatus("Success");
        System.out.println("---Setting status");
        if(status == "Complete"){
            System.out.println("---Checking value of order status");
            isOrderReady = true;
            System.out.println("---isOrderReady boolean");
        }
        response.setMessage(String.valueOf(isOrderReady));
        System.out.println("---Setting message");
        return response;
    }

    public Response cancelOrder(int orderId){
        Response response = new Response();
        boolean success = orderService.cancelOrder(orderId);
        System.out.println("---Cancelling Order");
        if(success){
            System.out.println("---Checking success boolean");
            response.setStatusCode(200);
            System.out.println("---Setting status code");
            response.setStatus("Success");
            System.out.println("---Setting message");
        }

        return response;
    }
}
