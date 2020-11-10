package com.att.kepler.cxf.service;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

import org.springframework.stereotype.Service;

import com.att.kepler.cxf.model.IncidentResponse;

import cxf.common.Incident;
import cxf.common.IncidentCORBAService;
import cxf.common.IncidentServiceCORBAService;

@Service
public class IncidentServiceImpl implements IncidentService{

	@Override
	public IncidentResponse createIncident(String incidentId) {
		IncidentServiceCORBAService corbaService = new IncidentServiceCORBAService();
		W3CEndpointReference epr = corbaService.getIncidentServiceCORBAPort().createIncident(incidentId);
		Incident incident = getIncidentFromEPR(epr);
		System.out.println("Incident , incidentId: "+incident.getIncidentId() +
			", status: "+incident.getStatus() +
			", created_timestamp:"+incident.getCreatedTimestamp());
		return IncidentResponse.createIncidentResponse(incident).build();
	}
	
	private static Incident getIncidentFromEPR(W3CEndpointReference epr) {
		IncidentCORBAService service = new IncidentCORBAService();
        return service.getPort(epr, Incident.class);
    }

}
