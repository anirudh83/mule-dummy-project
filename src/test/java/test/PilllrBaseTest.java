package test;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.eclipse.jetty.server.Server;
import org.junit.After;
import org.junit.Before;
import org.mule.tck.junit4.FunctionalTestCase;

public abstract class PilllrBaseTest extends FunctionalTestCase {
	
	static Server server;
	
	@Before
	public void createServer() throws Exception {
		server = new Server(8088);
		server.setHandler(new MockHttpRequestHandler());
		server.start();
	}

	@After
	public void stopServer() throws Exception {
		server.stop();
	}
	
	protected String httpRequestAsString(String endpointURL)
			throws URISyntaxException, ClientProtocolException, IOException {
		HttpClient hc = new DefaultHttpClient();

		HttpGet get = new HttpGet();
		get.setURI(new URI(endpointURL));
		get.setHeader("Content-Type", "application/json");
		HttpResponse resp = hc.execute(get);
		return EntityUtils.toString(resp.getEntity());
	}

}
