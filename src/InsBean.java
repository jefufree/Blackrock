import java.io.Serializable;


public class InsBean implements Serializable {
	     int sec;
         public int getSec() {
			return sec;
		}
		public void setSec(int sec) {
			this.sec = sec;
		}
		String name;
         float price;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		
		public boolean equals(Object obj){ //reload equals()
			//TODO Auto-generated method stub
			return super.equals(obj);
		}
		public int hashCode(){
			return super.hashCode();
		}
		
}
