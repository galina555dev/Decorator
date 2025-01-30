class Ristretto extends CoffeDecorator {
    public Ristretto(Drink decorated) {
        super(decorated);
    }
    public void water() {
        decorated.water();
        setCoffein();
        setColdwater();
    }
    private void setCoffein(){
        System.out.println("Based on Triple Dose of Coffeine");
    }
    private void setColdwater(){
        System.out.println("Served with a glass of cold water");
    };
}
