package test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class MockHttpRequestHandler extends AbstractHandler {

	@Override
	public void handle(String targetUri, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		String responseFilePath = request.getParameter("responseFilePath");
		baseRequest.setHandled(true);
		handleRequest(response, responseFilePath);

	}

	private void handleRequest(HttpServletResponse response,
			String responseFilePath) throws IOException {

		InputStream in = this.getClass().getClassLoader()
				.getResourceAsStream(responseFilePath);

		String responseString = StandardCharsets.UTF_8.decode(
				ByteBuffer.wrap(IOUtils.toByteArray(in))).toString();
		response.getWriter().print(responseString);
	}

}
