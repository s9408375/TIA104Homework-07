package hero;

// 步行策略的具體實現
public class WalkStrategy implements MoveStrategy {
	@Override
	public void move() {
		System.out.println("跑步");
	}
}