package ComputerPackage;

public class Computer {
	
	private static int noOfComp=1;
	private static long Serial_num=1000000;
	private String Brand;
	private String Model;
	private long Serial_number;
	private double Price;

	public Computer (String br, String Md, long SN, double Pr){
		Brand=br;
		Model=Md;
		Serial_number=Serial_num;
		Price= Pr;
		Serial_num++ ;
		noOfComp++;
		
	}
	public static int getnoOfComp() {
		return noOfComp;
	}
	public static void setNomofcomp(int noOfComp) {
		Computer.noOfComp = noOfComp;
	
	}
//	public Computer (String br){
//		Brand=br;
//	}
	
	public String getBrand() {
		return Brand;
	}
	public  void setBrand (String br) {
		Brand= br;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String Md) {
		Model =Md ;
	}
	public long getSerial_number() {
		return Serial_number;
	}
	public void setSerial_number(long Serial_num) {
		Serial_number = Serial_num;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double Pr) {
		Price = Pr;
	}
	
	
	public void ShowInfo() {
		 System.out.println("Brand is : "+Brand);
		 System.out.println( "The model is "+ Model);
		 System.out.println( "The Serial Number is "+ Serial_number);
		 System.out.println("The price is : $"+ Price);
		 }
	@Override
	public String toString() {
		return "Computer [Brand=" + Brand + ", Model=" + Model + ", Serial_number=" + Serial_number + ", Price=" + Price
				+ "]";
	}
}
