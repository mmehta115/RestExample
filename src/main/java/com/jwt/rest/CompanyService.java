package com.jwt.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/company")
public class CompanyService {
	
	@GET
	public Response getEmployee() {
		
		String output = "This is the list of employees";
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/permanent")
	public Response getPermanentEmployee()
	{
		String output = "This is the list of permanent employees";
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/contract")
	public Response getContractEmployee() 
	{
		String output = "This is the list of contract employee";
		
		return Response.status(200).entity(output).build();
	}
	
	@GET
	@Path("/{companyID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Company getCompanyInfowithId(@PathParam("companyID") String companyId)
	{
       Company c = new Company();
      
       c.setId(companyId);
       c.setName("XYZ");
       c.setAddress("123 x Street");
       
       return c;

	}
	
	@GET
	@Path("{companyID}/{branch}/{department}")
	public Response getCompanyInfo(@PathParam("companyID") String companyId,
			@PathParam("branch") String branch,
			@PathParam("department") String department)
	{
        String resp = "Employee ID is  " + companyId
                + " department is " + department + " and Branch name is " +branch;
        
        return Response.status(200).entity(resp).build();
	}
}