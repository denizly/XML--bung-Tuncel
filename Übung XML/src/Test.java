import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Test {
	private static final String WATCHSTORE_XML = "./watchstore-jaxb.xml";

	  public static void main(String[] args) throws JAXBException, IOException {

	    ArrayList<Watch> wa = new ArrayList<Watch>();
	    
	    Watch watch1=new Watch();
	    watch1.setBrand("Breitling");
	    watch1.setName("Pilotx2");
	    watch1.setNr(151326);
	    wa.add(watch1);
	    
	    Watch watch2=new Watch();
	    watch1.setBrand("U-Boat");
	    watch1.setName("Italo Fontana");
	    watch1.setNr(1651654);
	    wa.add(watch2);
	    
	    JAXBContext context = JAXBContext.newInstance(Watchstore.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    // Write to System.out
	    m.marshal(wa, System.out);
	    // Write to File
	    m.marshal(wa, new File(WATCHSTORE_XML));
	    
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller um = context.createUnmarshaller();
	    Watchstore w2 = (Watchstore) um.unmarshal(new FileReader(WATCHSTORE_XML));
	    ArrayList<Watch> list = w2.getW();
	    for (Watch watch : list) {
	      System.out.println("Watch: " + watch.getName() + " from "
	          + watch.getBrand());
	    }
	    
	    
	    

	  }
}
