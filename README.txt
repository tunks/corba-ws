CORBA/CXF Web service 
======================
A simple web service proxy for sending requests to CORBA programs using JAX 


1. CORBA WSDL
------------------------------------------------
Copy the CORBA program WSDL from the corba-poc-server to src/main/resources/wsdl folder


2. Build/Run using Maven
-----------------------------------------
   mvn clean install

   mvn spring-boot:run


3. Run CORBA Server and Client
-------------------------------------------------
 - Get list of services
    http://localhost:18080/services/

 - Send SOAP requests to create incident

	 <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.cxf.kepler.att.com/">
	   <soapenv:Header/>
	   <soapenv:Body>
	      <ser:createIncident>
	         <!--Optional:-->
	         <incidentIdRequest>incident2</incidentIdRequest>
	      </ser:createIncident>
	   </soapenv:Body>
	</soapenv:Envelope>
