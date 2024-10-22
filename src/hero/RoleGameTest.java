package hero;

public class RoleGameTest {

    public static void main(String[] args) {
    	
        // 使用 SwordMan 和 ArrowMan 初始化角色
        Hero saber = new SwordMan("亞拉岡", 1, 0);
        Hero archer = new ArrowMan("勒苟拉斯", 1, 0);

        // 執行攻擊、移動、防禦
        saber.attack();         // 亞拉岡 揮劍
        saber.performMove();    // 角色正在步行
        saber.performDefend();  // 角色正在防禦
        
        System.out.println("=================================");
       
        archer.attack();        // 勒苟拉斯 放弓箭
        archer.performMove();   // 角色正在步行
        archer.performDefend(); // 角色正在防禦

    }
}