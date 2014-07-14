package test;
import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;
import org.junit.Test;


public class DummyTest extends PilllrBaseTest {
	
	
	private static final String MERCHANT_RESPONSE_JSON = "{\"merchantId\":\"123\",\"abn\":\"#123 456 789\"}";
	private static final String MERCHANT_ENDPOINT_URI = "http://0.0.0.0:8081/begin";
//	
//	@Override
//	protected String getConfigResources() {
//			return "dummy-project.xml";
//	}
//	
//	
//	@Test
//	public void testMerchantSearch() throws ClientProtocolException, URISyntaxException, IOException{
//		String responseString = httpRequestAsString(MERCHANT_ENDPOINT_URI);
//		Assert.assertEquals(MERCHANT_RESPONSE_JSON, responseString);
//	}
//	
	

}
