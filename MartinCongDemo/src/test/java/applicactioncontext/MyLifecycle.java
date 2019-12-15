package applicactioncontext;

import org.springframework.context.Lifecycle;

public class MyLifecycle implements Lifecycle {
	@Override
	public void start() {
		System.out.println("MyLifecycle  -----> is start");
	}

	@Override
	public void stop() {
		System.out.println("MyLifecycle  -----> is stop");
	}

	@Override
	public boolean isRunning() {
		return false;
	}
}
