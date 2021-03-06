/**
 * Procedimento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.gov.ans.integracao.sei.client;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement
public class Procedimento implements java.io.Serializable {
	private java.lang.String idTipoProcedimento;

	private java.lang.String numeroProtocolo;

	private java.lang.String dataAutuacao;

	private java.lang.String especificacao;

	private br.gov.ans.integracao.sei.client.Assunto[] assuntos;

	private br.gov.ans.integracao.sei.client.Interessado[] interessados;

	private java.lang.String observacao;

	private java.lang.String nivelAcesso;

	private java.lang.String idHipoteseLegal;

	public Procedimento() {
	}

	public Procedimento(java.lang.String idTipoProcedimento, java.lang.String numeroProtocolo,
			java.lang.String dataAutuacao, java.lang.String especificacao,
			br.gov.ans.integracao.sei.client.Assunto[] assuntos,
			br.gov.ans.integracao.sei.client.Interessado[] interessados, java.lang.String observacao,
			java.lang.String nivelAcesso, java.lang.String idHipoteseLegal) {
		this.idTipoProcedimento = idTipoProcedimento;
		this.numeroProtocolo = numeroProtocolo;
		this.dataAutuacao = dataAutuacao;
		this.especificacao = especificacao;
		this.assuntos = assuntos;
		this.interessados = interessados;
		this.observacao = observacao;
		this.nivelAcesso = nivelAcesso;
		this.idHipoteseLegal = idHipoteseLegal;
	}

	public java.lang.String getIdTipoProcedimento() {
		return idTipoProcedimento;
	}

	public void setIdTipoProcedimento(java.lang.String idTipoProcedimento) {
		this.idTipoProcedimento = idTipoProcedimento;
	}

	public java.lang.String getNumeroProtocolo() {
		return numeroProtocolo;
	}

	public void setNumeroProtocolo(java.lang.String numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}

	public java.lang.String getDataAutuacao() {
		return dataAutuacao;
	}

	public void setDataAutuacao(java.lang.String dataAutuacao) {
		this.dataAutuacao = dataAutuacao;
	}

	public java.lang.String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(java.lang.String especificacao) {
		this.especificacao = especificacao;
	}

	public br.gov.ans.integracao.sei.client.Assunto[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(br.gov.ans.integracao.sei.client.Assunto[] assuntos) {
		this.assuntos = assuntos;
	}

	public br.gov.ans.integracao.sei.client.Interessado[] getInteressados() {
		return interessados;
	}

	public void setInteressados(br.gov.ans.integracao.sei.client.Interessado[] interessados) {
		this.interessados = interessados;
	}

	public java.lang.String getObservacao() {
		return observacao;
	}

	public void setObservacao(java.lang.String observacao) {
		this.observacao = observacao;
	}

	public java.lang.String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(java.lang.String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public java.lang.String getIdHipoteseLegal() {
		return idHipoteseLegal;
	}

	public void setIdHipoteseLegal(java.lang.String idHipoteseLegal) {
		this.idHipoteseLegal = idHipoteseLegal;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Procedimento))
			return false;
		Procedimento other = (Procedimento) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.idTipoProcedimento == null && other.getIdTipoProcedimento() == null)
				|| (this.idTipoProcedimento != null && this.idTipoProcedimento.equals(other.getIdTipoProcedimento())))
				&& ((this.numeroProtocolo == null && other.getNumeroProtocolo() == null)
						|| (this.numeroProtocolo != null && this.numeroProtocolo.equals(other.getNumeroProtocolo())))
				&& ((this.dataAutuacao == null && other.getDataAutuacao() == null)
						|| (this.dataAutuacao != null && this.dataAutuacao.equals(other.getDataAutuacao())))
				&& ((this.especificacao == null && other.getEspecificacao() == null)
						|| (this.especificacao != null && this.especificacao.equals(other.getEspecificacao())))
				&& ((this.assuntos == null && other.getAssuntos() == null)
						|| (this.assuntos != null && java.util.Arrays.equals(this.assuntos, other.getAssuntos())))
				&& ((this.interessados == null && other.getInteressados() == null) || (this.interessados != null
						&& java.util.Arrays.equals(this.interessados, other.getInteressados())))
				&& ((this.observacao == null && other.getObservacao() == null)
						|| (this.observacao != null && this.observacao.equals(other.getObservacao())))
				&& ((this.nivelAcesso == null && other.getNivelAcesso() == null)
						|| (this.nivelAcesso != null && this.nivelAcesso.equals(other.getNivelAcesso())))
				&& ((this.idHipoteseLegal == null && other.getIdHipoteseLegal() == null)
						|| (this.idHipoteseLegal != null && this.idHipoteseLegal.equals(other.getIdHipoteseLegal())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getIdTipoProcedimento() != null) {
			_hashCode += getIdTipoProcedimento().hashCode();
		}
		if (getNumeroProtocolo() != null) {
			_hashCode += getNumeroProtocolo().hashCode();
		}
		if (getDataAutuacao() != null) {
			_hashCode += getDataAutuacao().hashCode();
		}
		if (getEspecificacao() != null) {
			_hashCode += getEspecificacao().hashCode();
		}
		if (getAssuntos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getAssuntos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getAssuntos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getInteressados() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getInteressados()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getInteressados(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		if (getObservacao() != null) {
			_hashCode += getObservacao().hashCode();
		}
		if (getNivelAcesso() != null) {
			_hashCode += getNivelAcesso().hashCode();
		}
		if (getIdHipoteseLegal() != null) {
			_hashCode += getIdHipoteseLegal().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Procedimento.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "Procedimento"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idTipoProcedimento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdTipoProcedimento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numeroProtocolo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "NumeroProtocolo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataAutuacao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DataAutuacao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("especificacao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Especificacao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("assuntos");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Assuntos"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Assunto"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("interessados");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Interessados"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Interessado"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("observacao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Observacao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nivelAcesso");
		elemField.setXmlName(new javax.xml.namespace.QName("", "NivelAcesso"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idHipoteseLegal");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdHipoteseLegal"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
	}

	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
