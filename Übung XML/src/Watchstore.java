import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
//This statement means that class "Bookstore.java" is the root-element of our example

public class Watchstore {
	
	// XmLElementWrapper generates a wrapper element around XML representation
	  @XmlElementWrapper(name = "w")
	  // XmlElement sets the name of the entities
	  @XmlElement(name = "watch")

	private ArrayList<Watch> w;
	private String name;
	private String adress;
	
	public void setW(ArrayList<Watch> w)
	{
		this.w=w;
	}
	
	public ArrayList<Watch> getW(){
		return w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
}
