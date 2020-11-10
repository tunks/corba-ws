///**
// * Licensed to the Apache Software Foundation (ASF) under one
// * or more contributor license agreements. See the NOTICE file
// * distributed with this work for additional information
// * regarding copyright ownership. The ASF licenses this file
// * to you under the Apache License, Version 2.0 (the
// * "License"); you may not use this file except in compliance
// * with the License. You may obtain a copy of the License at
// *
// * http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing,
// * software distributed under the License is distributed on an
// * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// * KIND, either express or implied. See the License for the
// * specific language governing permissions and limitations
// * under the License.
// */
//
//package com.att.kepler.cxf;
//
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Endpoint;
//import javax.xml.ws.wsaddressing.W3CEndpointReference;
//
//import org.apache.cxf.ext.logging.LoggingInInterceptor;
//import org.apache.cxf.ext.logging.LoggingOutInterceptor;
//import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//
//import cxf.common.Incident;
//import cxf.common.IncidentService;
//import cxf.common.IncidentServiceCORBAService;
//
//
//@javax.jws.WebService(portName = "IncidentServiceCORBAPort",
//                      serviceName = "IncidentServiceCORBAService",
//                      targetNamespace = "http://cxf.apache.org/bindings/corba/idl/IncidentWS",
//                      wsdlLocation = "classpath:/wsdl/IncidentWS.wsdl",
//                      endpointInterface = "cxf.common.IncidentService")
//
//public class IncidentServiceImpl implements IncidentService {
//	@Override
//	public Incident createIncident(String incidentId) {
////		 QName SERVICE_NAME = new QName("http://cxf.apache.org/schemas/cxf/idl/HelloWorld",
////                 "HelloWorldCORBAService");
////	      JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
////	      factory.getInInterceptors().add(new LoggingInInterceptor());
////	      factory.getOutInterceptors().add(new LoggingOutInterceptor());
////	      factory.setServiceClass( IncidentService.class );
////	      factory.setWsdlLocation( "file:resources/HelloWorld-corba.wsdl" );
////	      factory.setAddress( "corbaname::localhost:1050#HelloWorld" );
////	      factory.setServiceName(SERVICE_NAME );
////	      Incident client = (Incident) factory.create()
//
//		System.out.println("createIncident("+incidentId+")");
//		IncidentServiceCORBAService corbaService = new IncidentServiceCORBAService();
//        //javax.xml.ws.Holder<Incident> incident = new javax.xml.ws.Holder<>(new Incident());
//
//		Incident incident = corbaService.getIncidentServiceCORBAPort().createIncident(incidentId);
//		//corbaService.
////		System.out.println("Created incident_id: "+incident.getIncidentId() + ", status: "
////		                    +incident.getStatus() +", timestamp: "
////				            +incident.getCreatedTimestamp());
//		return incident;
//	}
//
//	@Override
//	public void removeIncident(String incidentId) {
//		IncidentServiceCORBAService corbaService = new  IncidentServiceCORBAService();
//		corbaService.getIncidentServiceCORBAPort().removeIncident(incidentId);
//	}
//
//	@Override
//	public Incident findIncident(String incidentId) {
//		IncidentServiceCORBAService corbaService = new  IncidentServiceCORBAService();
//		return corbaService.getIncidentServiceCORBAPort().findIncident(incidentId);
//	}
//	
//	
////    private W3CEndpointReference createAccountReference(String accountName) {
////        String corbaAddress = "corbaname::localhost:1050#" + accountName;
////
////        Object account = new AccountImpl();
////        Endpoint ep = Endpoint.publish(corbaAddress, account);
////        endpointList.put(accountName, ep);
////
////        return (W3CEndpointReference)ep.getEndpointReference((org.w3c.dom.Element[])null);
////    }
//}
//
