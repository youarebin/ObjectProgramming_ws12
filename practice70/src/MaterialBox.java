//컴퓨터학과_20220740_가유빈
public class MaterialBox extends Box{
	private String attribute;
	int a, b, c;
	
	public void setAttribute(String attribute) {this.attribute = attribute;}
	public String getAttribute() {return attribute;}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		super(x,y,z);
		this.attribute = attribute;
	}
	public void printInfo () {
		String rslt = "";
		
		System.out.print(toString());
		rslt += "\n재질: " + getAttribute();
		rslt += "\n부피: " + getVolume();
		rslt += "\n무게: " + String.format("%.2f",getWeight());
		
		System.out.print(rslt);
	}
}
