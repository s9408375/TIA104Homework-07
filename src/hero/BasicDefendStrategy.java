package hero;

// 基本防禦策略的具體實現
public class BasicDefendStrategy implements DefendStrategy {
	@Override
	public void defend() {
		System.out.println("做防禦動作");
	}
}