package br.gov.ans.integracao.sip.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.inject.Inject;

import br.gov.ans.factories.qualifiers.SeiQualifiers.SipParameter;


public class SIPSoapClient {
	
	@Inject
	@SipParameter
	private String SERVICE_URL; 

	public Boolean replicarUsuario(String operacao, String codigoUsuario, String codigoOrgao, String login, String nome) throws IOException{
		
		StringBuffer msgRetorno = new StringBuffer("");
		
		URL url = new URL(SERVICE_URL);
        URLConnection conn = url.openConnection();		
		
        conn.setDoOutput(true);
   
        conn.setRequestProperty("SOAPAction","sipnsAction");
        
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        
        String xml =         		
        "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sip=\"sipns\">" +
        "<soapenv:Header/>" +
	    "<soapenv:Body>" +
	    "<sip:replicarUsuario soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">" +
	    "<Usuarios>" +
	    "<Usuario>" +
	    "<StaOperacao xsi:type=\"xsd:string\">" + operacao + "</StaOperacao>" +
	    "<IdOrigem xsi:type=\"xsd:string\">" + codigoUsuario + "</IdOrigem>" +
	    "<IdOrgao xsi:type=\"xsd:string\">" + codigoOrgao + "</IdOrgao>" +
	    "<Sigla xsi:type=\"xsd:string\">" + login + "</Sigla>" +
	    "<Nome xsi:type=\"xsd:string\">" + nome + "</Nome>" +
	    "</Usuario>" +
	    "</Usuarios>" +
	    "</sip:replicarUsuario>" +
	    "</soapenv:Body>" +
        "</soapenv:Envelope>";

        wr.write(xml); 
        wr.flush(); 
                     
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        
        String inputLine;
        while ((inputLine = rd.readLine()) != null){
            msgRetorno.append(inputLine);
        }
        
        wr.close();  
        rd.close(); 
        conn.getInputStream().close();
        
        if(msgRetorno.toString().contains("\"xsd:boolean\">true")){
        	return true;        	
        }
        
        return false;
	}

}
