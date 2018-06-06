/**
 * RetornoGeracaoProcedimento.java
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
public class RetornoGeracaoProcedimento implements java.io.Serializable {
	private java.lang.String idProcedimento;

	private java.lang.String procedimentoFormatado;

	private java.lang.String linkAcesso;

	private br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento[] retornoInclusaoDocumentos;

	public RetornoGeracaoProcedimento() {
	}

	public RetornoGeracaoProcedimento(java.lang.String idProcedimento, java.lang.String procedimentoFormatado,
			java.lang.String linkAcesso,
			br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
		this.idProcedimento = idProcedimento;
		this.procedimentoFormatado = procedimentoFormatado;
		this.linkAcesso = linkAcesso;
		this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
	}

	public java.lang.String getIdProcedimento() {
		return idProcedimento;
	}

	public void setIdProcedimento(java.lang.String idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	public java.lang.String getProcedimentoFormatado() {
		return procedimentoFormatado;
	}

	public void setProcedimentoFormatado(java.lang.String procedimentoFormatado) {
		this.procedimentoFormatado = procedimentoFormatado;
	}

	public java.lang.String getLinkAcesso() {
		return linkAcesso;
	}

	public void setLinkAcesso(java.lang.String linkAcesso) {
		this.linkAcesso = linkAcesso;
	}

	public br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento[] getRetornoInclusaoDocumentos() {
		return retornoInclusaoDocumentos;
	}

	public void setRetornoInclusaoDocumentos(
			br.gov.ans.integracao.sei.client.RetornoInclusaoDocumento[] retornoInclusaoDocumentos) {
		this.retornoInclusaoDocumentos = retornoInclusaoDocumentos;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof RetornoGeracaoProcedimento))
			return false;
		RetornoGeracaoProcedimento other = (RetornoGeracaoProcedimento) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.idProcedimento == null && other.getIdProcedimento() == null)
						|| (this.idProcedimento != null && this.idProcedimento.equals(other.getIdProcedimento())))
				&& ((this.procedimentoFormatado == null && other.getProcedimentoFormatado() == null)
						|| (this.procedimentoFormatado != null
								&& this.procedimentoFormatado.equals(other.getProcedimentoFormatado())))
				&& ((this.linkAcesso == null && other.getLinkAcesso() == null)
						|| (this.linkAcesso != null && this.linkAcesso.equals(other.getLinkAcesso())))
				&& ((this.retornoInclusaoDocumentos == null && other.getRetornoInclusaoDocumentos() == null)
						|| (this.retornoInclusaoDocumentos != null && java.util.Arrays
								.equals(this.retornoInclusaoDocumentos, other.getRetornoInclusaoDocumentos())));
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
		if (getIdProcedimento() != null) {
			_hashCode += getIdProcedimento().hashCode();
		}
		if (getProcedimentoFormatado() != null) {
			_hashCode += getProcedimentoFormatado().hashCode();
		}
		if (getLinkAcesso() != null) {
			_hashCode += getLinkAcesso().hashCode();
		}
		if (getRetornoInclusaoDocumentos() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getRetornoInclusaoDocumentos()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getRetornoInclusaoDocumentos(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			RetornoGeracaoProcedimento.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "RetornoGeracaoProcedimento"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idProcedimento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdProcedimento"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("procedimentoFormatado");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ProcedimentoFormatado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("linkAcesso");
		elemField.setXmlName(new javax.xml.namespace.QName("", "LinkAcesso"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("retornoInclusaoDocumentos");
		elemField.setXmlName(new javax.xml.namespace.QName("", "RetornoInclusaoDocumentos"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "RetornoInclusaoDocumento"));
		elemField.setNillable(false);
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
