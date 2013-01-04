package com.groupmanager.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.groupmanager.scheduler.services.intf.CreateJobService;
import com.groupmanager.scheduler.services.intf.DeleteJobService;
import com.groupmanager.scheduler.services.intf.UpdateJobService;
 
@Component
@Path("/scheduler-service")
public class SchedulerResource {
 
	@Autowired
	CreateJobService createJobService;
	
	@Autowired
	UpdateJobService updateJobService;
	
	@Autowired
	DeleteJobService deleteJobService;
 
	@GET
	@Path("/create-job")
	public Response createJob() {
 		String result = createJobService.createJob();
 		return Response.status(200).entity(result).build();
 
	}
	
	@GET
	@Path("/update-job")
	public Response updateJob() {
 		String result = updateJobService.updateJob();
 		return Response.status(200).entity(result).build();
 
	}
	
	@GET
	@Path("/delete-job")
	public Response deleteJob() {
 		String result = deleteJobService.deleteJob();
 		return Response.status(200).entity(result).build();
 
	}
 
}
