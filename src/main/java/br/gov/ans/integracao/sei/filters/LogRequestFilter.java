package br.gov.ans.integracao.sei.filters;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;
import org.jboss.resteasy.core.ResourceMethodInvoker;

import br.gov.ans.integracao.sei.utils.Constantes;
import br.gov.ans.utils.LogIgnore;
import br.gov.ans.utils.LogIntegracaoUtil;
import br.gov.ans.utils.MessageUtils;

@Provider
public class LogRequestFilter implements ContainerRequestFilter{

    @Inject
    private LogIntegracaoUtil audit;
    
    @Inject
    private MessageUtils messages;
    
	@Context
	private UriInfo uriInfo;
	
	@Context
	private ResourceInfo resourceInfo;
	
	@Context
	private HttpServletRequest request;
	
	@Context
	private SecurityContext securityContext;
	
	@Inject
	private Logger logger;
	
	@Override
	public void filter(ContainerRequestContext context) throws IOException{
		request.setCharacterEncoding(Constantes.UTF8);
		
		if(isLoggable()){
			audit.registrarLog(getUserName(),uriInfo.getAbsolutePath().toString(), getMethodName(context));
		}
	}
	
	public String getMethodName(ContainerRequestContext context){
        ResourceMethodInvoker methodInvoker = (ResourceMethodInvoker) context.getProperty(Constantes.RESOURCE_METHOD_INVOKER);
               
		return methodInvoker.getMethod().getName(); 
	}
	
	public String getUserName(){
		try{
			return securityContext.getUserPrincipal().getName();
		}catch (Exception ex) {
			logger.debug("Sem informações do usuário logado: ", ex);
			return messages.getMessage("sem.informacoes.usuario");
		}
	}	

	private boolean isLoggable(){
		if(resourceInfo.getResourceClass().isAnnotationPresent(LogIgnore.class)){
			return false;
		}
		
		if(resourceInfo.getResourceMethod().isAnnotationPresent(LogIgnore.class)){
			return false;
		}
		
		return true;
	}
}
