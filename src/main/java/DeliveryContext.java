public class DeliveryContext {
    private DeliveryState currentState;
    private ShippingType currentType;

    public DeliveryContext() {
        currentState = new InTransit();
        currentType = new Standard();
    }

    public void setCurrentState(DeliveryState currentState) {
        this.currentState = currentState;
    }

    public void setCurrentType(ShippingType currentType) {
        this.currentType = currentType;
    }

    public String getDeliveryState() {
        return "Delivery state: " + this.currentState.getState();
    }

    public String getShippingType() {
        return "Shipping type: " + this.currentType.getType();
    }
}
