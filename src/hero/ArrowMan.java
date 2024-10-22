package hero;

public class ArrowMan extends Hero {

    public ArrowMan(String name, int level, double exp) {
        // 初始化時給定步行策略和普通防禦策略
        super(name, level, exp, new WalkStrategy(), new BasicDefendStrategy());
    }

    @Override
    public void attack() {
        System.out.println(name + " 放弓箭");
    }
}