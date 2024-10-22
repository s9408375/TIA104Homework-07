package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	//  請設計一個Train類別，並包含以下屬性：
	// -班次 number，型別為int -車種 type，型別為String -出發地 start，型別為String
	// -目的地 dest，型別為String -票價 price，型別為double
	// 設計對應的getter/setter方法
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private Double price;
	
	public Train() {
		
	}
	
	public Train(int number, String type, String start, String dest, Double price) {
		this.number= number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setStart(String start) {
		this.start = start;
	}
	
	public String getStart() {
		return start;
	}
	
	public void setDest(String dest) {
		this.dest = dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number && 
				Objects.equals(price, other.price) && 
				Objects.equals(start, other.start) && 
				Objects.equals(type, other.type);
	}
	
	// toString 方法被重寫以返回一個包含所有屬性（班次、車種、出發地、目的地和票價）的字串
	@Override
	public String toString() {
		return "Train [number=" + number + ", type=" + type + ", start=" + start + ", dest=" + dest + ", price=" + price
				+ "]";
	}
	
	@Override
    public int compareTo(Train other) {
        return Integer.compare(other.number, this.number); // 降序排列
    }
}
