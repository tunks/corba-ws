package com.att.kepler.cxf.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import com.att.kepler.cxf.model.IncidentResponse;

@WebService(serviceName = "IncidentService")
public interface IncidentService {
	
	@WebMethod
	@WebResult(name = "IncidentResponse")
    public IncidentResponse createIncident(@WebParam(name = "incidentIdRequest") String incidentId);
	
	@WebMethod
	@WebResult(name = "IncidentResponse")
    public IncidentResponse findIncident(@WebParam(name = "incidentIdRequest") String incidentId);
}
