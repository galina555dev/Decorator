public class DecoratorTest {//тест
    public static void main(String[] args) {
        Drink Tea = new Tea();
        Drink ristretto = new Ristretto(new UnknowCoffe());
        Tea.water();
        System.out.println();
        ristretto.water();
    }
}