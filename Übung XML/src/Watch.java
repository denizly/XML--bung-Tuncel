import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "watch")
	// If you want you can define the order in which the fields are written
	// Optional
	@XmlType(propOrder = { "brand", "name", "nr" })
public class Watch {
//easy
	
	
	private String brand;
	private String name;
	private int nr;
	@XmlElement(name = "model")
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	
}
