package com.groupmanager.scheduler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SampleJob {

	public void sampleJobMethod() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("Invoked on " + dateFormat.format(System.currentTimeMillis()));
	}
}
