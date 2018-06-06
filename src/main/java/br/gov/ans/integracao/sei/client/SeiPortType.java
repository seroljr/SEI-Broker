/**
 * SeiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

public interface SeiPortType extends java.rmi.Remote {

	public br.gov.ans.integracao.sei.client.RetornoGeracaoProcedimento gerarProcedimento(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade,
			br.gov.ans.integracao.sei.client.Procedimento procedimento,
			br.gov.ans.integracao.sei.client.Documento[] documentos, java.lang.String[] procedimentosRelacionados,
			java.lang.String[] unidadesEnvio, java.lang.String sinManterAbertoUnidade,
			java.lang.String sinEnviarEmailNotificacao, java.lang.String dataRetornoProgramado,
			java.lang.String diasRetornoProgramado, java.lang.String sinDiasUteisRetornoProgramado,
			java.lang.String idMarcador, java.lang.String textoMarcador) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento incluirDocumento(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade,
			br.gov.ans.integracao.sei.client.Documento documento) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Unidade[] listarUnidades(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idTipoProcedimento, java.lang.String idSerie)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.TipoProcedimento[] listarTiposProcedimento(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idSerie)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Serie[] listarSeries(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idTipoProcedimento)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Contato[] listarContatos(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idTipoContato,
			java.lang.String paginaRegistros, java.lang.String paginaAtual, java.lang.String sigla,
			java.lang.String nome, java.lang.String cpf, java.lang.String cnpj, java.lang.String matricula,
			java.lang.String[] idContatos) throws java.rmi.RemoteException;

	public java.lang.String atualizarContatos(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, br.gov.ans.integracao.sei.client.Contato[] contatos)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.RetornoConsultaProcedimento consultarProcedimento(
			java.lang.String siglaSistema, java.lang.String identificacaoServico, java.lang.String idUnidade,
			java.lang.String protocoloProcedimento, java.lang.String sinRetornarAssuntos,
			java.lang.String sinRetornarInteressados, java.lang.String sinRetornarObservacoes,
			java.lang.String sinRetornarAndamentoGeracao, java.lang.String sinRetornarAndamentoConclusao,
			java.lang.String sinRetornarUltimoAndamento, java.lang.String sinRetornarUnidadesProcedimentoAberto,
			java.lang.String sinRetornarProcedimentosRelacionados, java.lang.String sinRetornarProcedimentosAnexados)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.ProcedimentoResumido consultarProcedimentoIndividual(
			java.lang.String siglaSistema, java.lang.String identificacaoServico, java.lang.String idUnidade,
			java.lang.String idOrgaoProcedimento, java.lang.String idTipoProcedimento, java.lang.String idOrgaoUsuario,
			java.lang.String siglaUsuario) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.RetornoConsultaDocumento consultarDocumento(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String protocoloDocumento,
			java.lang.String sinRetornarAndamentoGeracao, java.lang.String sinRetornarAssinaturas,
			java.lang.String sinRetornarPublicacao, java.lang.String sinRetornarCampos) throws java.rmi.RemoteException;

	public java.lang.String cancelarDocumento(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloDocumento, java.lang.String motivo)
			throws java.rmi.RemoteException;

	public java.lang.String gerarBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String tipo, java.lang.String descricao,
			java.lang.String[] unidadesDisponibilizacao, java.lang.String[] documentos,
			java.lang.String sinDisponibilizar) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.RetornoConsultaBloco consultarBloco(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idBloco,
			java.lang.String sinRetornarProtocolos) throws java.rmi.RemoteException;

	public java.lang.String excluirBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco) throws java.rmi.RemoteException;

	public java.lang.String disponibilizarBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco) throws java.rmi.RemoteException;

	public java.lang.String cancelarDisponibilizacaoBloco(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idBloco)
			throws java.rmi.RemoteException;

	public java.lang.String incluirDocumentoBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco, java.lang.String protocoloDocumento,
			java.lang.String anotacao) throws java.rmi.RemoteException;

	public java.lang.String retirarDocumentoBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco, java.lang.String protocoloDocumento)
			throws java.rmi.RemoteException;

	public java.lang.String incluirProcessoBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco, java.lang.String protocoloProcedimento,
			java.lang.String anotacao) throws java.rmi.RemoteException;

	public java.lang.String retirarProcessoBloco(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String idBloco, java.lang.String protocoloProcedimento)
			throws java.rmi.RemoteException;

	public java.lang.String reabrirProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento) throws java.rmi.RemoteException;

	public java.lang.String concluirProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.ArquivoExtensao[] listarExtensoesPermitidas(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idArquivoExtensao)
			throws java.rmi.RemoteException;

	public java.lang.String enviarProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento, java.lang.String[] unidadesDestino,
			java.lang.String sinManterAbertoUnidade, java.lang.String sinRemoverAnotacao,
			java.lang.String sinEnviarEmailNotificacao, java.lang.String dataRetornoProgramado,
			java.lang.String diasRetornoProgramado, java.lang.String sinDiasUteisRetornoProgramado,
			java.lang.String sinReabrir) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Usuario[] listarUsuarios(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idUsuario)
			throws java.rmi.RemoteException;

	public java.lang.String atribuirProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento, java.lang.String idUsuario,
			java.lang.String sinReabrir) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.HipoteseLegal[] listarHipotesesLegais(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String nivelAcesso)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.TipoConferencia[] listarTiposConferencia(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Pais[] listarPaises(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Estado[] listarEstados(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idPais)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Cidade[] listarCidades(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idPais,
			java.lang.String idEstado) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Cargo[] listarCargos(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idCargo)
			throws java.rmi.RemoteException;

	public java.lang.String adicionarArquivo(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String nome, java.lang.String tamanho, java.lang.String hash,
			java.lang.String conteudo) throws java.rmi.RemoteException;

	public java.lang.String adicionarConteudoArquivo(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String idArquivo,
			java.lang.String conteudo) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Andamento lancarAndamento(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String protocoloProcedimento,
			java.lang.String idTarefa, java.lang.String idTarefaModulo,
			br.gov.ans.integracao.sei.client.AtributoAndamento[] atributos) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Andamento[] listarAndamentos(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String protocoloProcedimento,
			java.lang.String sinRetornarAtributos, java.lang.String[] andamentos, java.lang.String[] tarefas,
			java.lang.String[] tarefasModulos) throws java.rmi.RemoteException;

	public java.lang.String bloquearProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento) throws java.rmi.RemoteException;

	public java.lang.String desbloquearProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento) throws java.rmi.RemoteException;

	public java.lang.String relacionarProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento1,
			java.lang.String protocoloProcedimento2) throws java.rmi.RemoteException;

	public java.lang.String removerRelacionamentoProcesso(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String protocoloProcedimento1,
			java.lang.String protocoloProcedimento2) throws java.rmi.RemoteException;

	public java.lang.String sobrestarProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimento,
			java.lang.String protocoloProcedimentoVinculado, java.lang.String motivo) throws java.rmi.RemoteException;

	public java.lang.String removerSobrestamentoProcesso(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade, java.lang.String protocoloProcedimento)
			throws java.rmi.RemoteException;

	public java.lang.String anexarProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimentoPrincipal,
			java.lang.String protocoloProcedimentoAnexado) throws java.rmi.RemoteException;

	public java.lang.String desanexarProcesso(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, java.lang.String protocoloProcedimentoPrincipal,
			java.lang.String protocoloProcedimentoAnexado, java.lang.String motivo) throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.Marcador[] listarMarcadoresUnidade(java.lang.String siglaSistema,
			java.lang.String identificacaoServico, java.lang.String idUnidade) throws java.rmi.RemoteException;

	public java.lang.String definirMarcador(java.lang.String siglaSistema, java.lang.String identificacaoServico,
			java.lang.String idUnidade, br.gov.ans.integracao.sei.client.DefinicaoMarcador[] definicoes)
			throws java.rmi.RemoteException;

	public br.gov.ans.integracao.sei.client.AndamentoMarcador[] listarAndamentosMarcadores(
			java.lang.String siglaSistema, java.lang.String identificacaoServico, java.lang.String idUnidade,
			java.lang.String protocoloProcedimento, java.lang.String[] marcadores) throws java.rmi.RemoteException;
}
