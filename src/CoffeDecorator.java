abstract class CoffeDecorator implements Drink {
    protected Drink decorated;
    public CoffeDecorator(Drink decorated){
        this.decorated = decorated;
    }
    public void water(){
        decorated.water();
    }
}
