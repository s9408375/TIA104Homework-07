package hero;

public abstract class Hero {
    protected String name;  // 設為 protected，讓子類別可以使用
    private int level;
    private double exp;

    private MoveStrategy moveStrategy;  // 移動行為
    private DefendStrategy defendStrategy;  // 防禦行為

    // 修改建構函數，讓子類別在初始化時提供策略
    public Hero(String name, int level, double exp, MoveStrategy moveStrategy, DefendStrategy defendStrategy) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.moveStrategy = moveStrategy;
        this.defendStrategy = defendStrategy;
    }

    // 執行移動策略
    public void performMove() {
        moveStrategy.move();
    }

    // 執行防禦策略
    public void performDefend() {
        defendStrategy.defend();
    }

    // 抽象方法,攻擊行為
    public abstract void attack();
}