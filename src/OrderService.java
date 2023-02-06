public class OrderService {
    /**
     * Simulate checking for a pending order type
     * @param customerId
     * @param orderType
     * @return
     */
    public boolean doesCustomerAlreadyHavePendingOrder(int customerId, int orderType){
        System.out.println("---OrderService.doesCustomerAlreadyHavePendingOrder() being called");
        if(getPendingOrderForCustomer(customerId, orderType) > 0){
            return true;
        }

        return false;
    }

    /**
     * Simulates a customer not having pending order for order type;
     * @param customerId
     * @param orderType
     * @return
     */
    private int getPendingOrderForCustomer(int customerId, int orderType){
        System.out.println("---OrderService.getPendingOrderForCustomer() being called");
        return 0;
    }

    /**
     * Simulated order creation process
     * @param customerId
     * @return
     */
    public int createOrder(int customerId){
        System.out.println("---OrderService.createOrder() being called");
        int orderCreated = 0;
        boolean orderSaved = false;
        int orderId = generateOrderDetail(customerId);
        if(orderId > 0){
            orderSaved = saveOrderTodB(customerId, orderId);
        }

        if(orderSaved){
            orderCreated = orderId;
        }

        return orderCreated;
    }

    /**
     * Simulated order detail generation
     * @param customerId
     * @return
     */
    private int generateOrderDetail(int customerId){
        System.out.println("---OrderService.generateOrderDetail() being called");
        return 578347584;
    }

    /**
     * Simulated insert order detail into db
     * @param customerId
     * @param orderId
     * @return
     */
    private boolean saveOrderTodB(int customerId, int orderId){
        System.out.println("---OrderService.saveOrderTodB() being called");
        System.out.printf("---INSERT INTO ORDERS_DETAIL (customer_id, order_id, status) VALUES (\'%s\', \'%s\', \'pending\')", customerId, orderId);
        System.out.println();
        return true;
    }

    /**
     * Simulate getting an order status
     * @param orderId
     * @return
     */
    public String getOrderStatus(int orderId){
        System.out.println("---OrderService.getOrderStatus() being called");
        System.out.printf("---GET status FROM ORDERS_DETAIL WHERE order_id = %s", orderId);
        System.out.println();
        return "Complete";
    }

    /**
     * Simulate updating an order to cancelled and returning boolean for update success
     * @param orderId
     */
    public boolean cancelOrder(int orderId){
        System.out.println("---OrderService.cancelOrder() being called");
        System.out.printf("---UPDATE ORDER_DETAIL SET status = 'cancelled' WHERE order_id = %s", orderId);
        System.out.println();
        return true;
    }
}
