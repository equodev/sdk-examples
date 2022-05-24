package samplename;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.equo.comm.api.ICommService;
import com.equo.comm.api.actions.IActionHandler;
import com.equo.comm.api.annotations.EventName;

@Component
public class MyEventHandler implements IActionHandler {

	@Reference
	private ICommService commService;

	public void welcomeHandler(String payload) {
		System.out.println(payload);
	}

	public ExampleResponse getExamplePayload() {
		return new ExampleResponse("Response from Java!");
	}
}
