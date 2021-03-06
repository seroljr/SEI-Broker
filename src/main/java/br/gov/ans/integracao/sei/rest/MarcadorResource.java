package br.gov.ans.integracao.sei.rest;

import static br.gov.ans.integracao.sei.utils.Util.formatarNumeroProcesso;
import static br.gov.ans.integracao.sei.utils.Util.trueOrFalse;

import java.rmi.RemoteException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.gov.ans.integracao.sei.client.DefinicaoMarcador;
import br.gov.ans.integracao.sei.client.Marcador;
import br.gov.ans.integracao.sei.client.SeiPortTypeProxy;
import br.gov.ans.integracao.sei.modelo.MarcacaoProcesso;
import br.gov.ans.integracao.sei.utils.Constantes;
import br.gov.ans.utils.MessageUtils;

@Path("/")
public class MarcadorResource {

	@Inject
	private SeiPortTypeProxy seiNativeService;

	@Inject
	private UnidadeResource unidadeResource;
	
	@Inject
	private MessageUtils messages;

	@GET
	@Path("{unidade}/marcadores")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Marcador[] listarMarcadores(@PathParam("unidade") String unidade) throws RemoteException, Exception{
		return seiNativeService.listarMarcadoresUnidade(Constantes.SIGLA_SEI_BROKER, Constantes.CHAVE_IDENTIFICACAO, unidadeResource.consultarCodigo(unidade));
	}

	@POST
	@Path("{unidade}/marcadores/{marcador}/processos")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response marcarProcesso(@PathParam("unidade") String unidade, @PathParam("marcador") String marcador, @QueryParam("auto-formatacao") String autoFormatar, 
			MarcacaoProcesso marcacao) throws RemoteException, Exception{
		if(isAutoFormatar(autoFormatar)){			
			marcacao.setProcesso(formatarNumeroProcesso(marcacao.getProcesso()));
		}
				
		DefinicaoMarcador definicaoMarcador = new DefinicaoMarcador();
		definicaoMarcador.setProtocoloProcedimento(marcacao.getProcesso());
		definicaoMarcador.setTexto(marcacao.getTexto());
		definicaoMarcador.setIdMarcador(marcador);
		
		String retorno = seiNativeService.definirMarcador(Constantes.SIGLA_SEI_BROKER, Constantes.CHAVE_IDENTIFICACAO, unidadeResource.consultarCodigo(unidade), new DefinicaoMarcador[]{definicaoMarcador});
		
		if(trueOrFalse(retorno)){
			return Response.status(Status.CREATED).build();
		}else{
			throw new Exception(messages.getMessage("erro.marcar.processo"));
		}
	}
	
	public boolean isAutoFormatar(String valor){
		return !("N".equals(valor) || "n".equals(valor));
	}
}
