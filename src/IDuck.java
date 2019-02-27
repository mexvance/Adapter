public interface IDuck {
    void performFly();

    void performQuack();

    void swim();

    void setFlyBehavior(FlyBehavior fb);

    void setQuackBehavior(QuackBehavior qb);
}
