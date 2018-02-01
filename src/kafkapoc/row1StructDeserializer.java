package kafkapoc;

import org.apache.kafka.common.serialization.*;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

import org.apache.kafka.common.serialization.Deserializer;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

public class row1StructDeserializer implements Deserializer {

	@Override public void close() {

	  }

	

	  @Override
	  public row1Struct deserialize(String arg0, byte[] arg1) {
		  
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	    mapper.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
	    
	    row1Struct row1 = null;
	    try {
	    	
	    	//System.out.println("Argument:"+arg1);
	    	row1 = mapper.readValue(arg1, row1Struct.class);
	    } catch (Exception e) {

	      e.printStackTrace();
	    }
	    return row1;
	  }

	@Override
	public void configure(Map arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

}
