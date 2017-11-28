package kafkapoc;

import org.apache.kafka.common.serialization.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.apache.kafka.common.serialization.Serializer;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;



public class row1StructSerializer implements org.apache.kafka.common.serialization.Serializer {
	
	  public void close() {

	  }

	@Override
	public void configure(Map arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override 
	public byte[] serialize(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		 byte[] retVal = null;
		    
		    try {
		    	ObjectMapper objectMapper = new ObjectMapper();
		      retVal = objectMapper.writeValueAsString(arg1).getBytes();
		    } catch (IOException ioe) {
		      //e.printStackTrace();
		    	throw new RuntimeException("Unable to generate JSON from object. Reason: " + ioe.getMessage(), ioe);
		    }
		    return retVal;
	}

	 
}
