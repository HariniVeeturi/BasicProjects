package coins;
public enum Coins {
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    HUNDRED(100);

    private final int value;
    Coins(int value){
        this.value=value;
    }
    public int getValue()
    {
        return this.value;
    }
}
