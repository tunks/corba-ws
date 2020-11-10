package com.att.kepler.cxf.model;

import java.io.Serializable;

import cxf.common.Incident;

public class IncidentResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String incidentId;
	private String status;
	private String createdTimestamp;

	public String getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(String incidentId) {
		this.incidentId = incidentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(String createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	
	public static IncidentResponseBuilder createIncidentResponse(Incident incident) 
	{
		return new IncidentResponseBuilder(incident);
	}
	
	public static class IncidentResponseBuilder{
		private IncidentResponse incidentResponse;
		
		public IncidentResponseBuilder(Incident incident) {
		    this.incidentResponse = new IncidentResponse();
		    setIncidentId(incident.getIncidentId())
		    .setStatus(incident.getStatus())
		    .setCreatedTimestamp(incident.getCreatedTimestamp());
		}
		public IncidentResponseBuilder setIncidentId(String incidentId) {
			this.incidentResponse.setIncidentId(incidentId);
			return this;
		}
	
		public IncidentResponseBuilder setStatus(String status) {
			this.incidentResponse.setStatus(status);
			return this;
		}

	
		public IncidentResponseBuilder setCreatedTimestamp(String createdTimestamp) {
			this.incidentResponse.setCreatedTimestamp(createdTimestamp);
			return this;
		}
		
		public IncidentResponse build() {
			return this.incidentResponse;
		}
	}

}
