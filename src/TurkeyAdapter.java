public class TurkeyAdapter implements IDuck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void performFly() {
        turkey.fly();
    }

    @Override
    public void performQuack() {
        turkey.gobble();
    }

    @Override
    public void swim() {
        System.out.println("Turkeys don't swim :)");
    }

    @Override
    public void setFlyBehavior(FlyBehavior fb) {

    }

    @Override
    public void setQuackBehavior(QuackBehavior qb) {

    }
}
