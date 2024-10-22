package hw7;

import java.io.Serializable;

public class Dog implements Serializable, Speakable  { // 實現Serializable及Speakable介面
    private static final long serialVersionUID = 1L; // 建議添加這行，方便版本控制
    
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
