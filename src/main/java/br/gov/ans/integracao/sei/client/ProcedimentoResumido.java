/**
 * ProcedimentoResumido.java
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
public class ProcedimentoResumido implements java.io.Serializable {
	private java.lang.String idProcedimento;

	private java.lang.String procedimentoFormatado;

	private br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento;

	public ProcedimentoResumido() {
	}

	public ProcedimentoResumido(java.lang.String idProcedimento, java.lang.String procedimentoFormatado,
			br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento) {
		this.idProcedimento = idProcedimento;
		this.procedimentoFormatado = procedimentoFormatado;
		this.tipoProcedimento = tipoProcedimento;
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

	public br.gov.ans.integracao.sei.client.TipoProcedimento getTipoProcedimento() {
		return tipoProcedimento;
	}

	public void setTipoProcedimento(br.gov.ans.integracao.sei.client.TipoProcedimento tipoProcedimento) {
		this.tipoProcedimento = tipoProcedimento;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof ProcedimentoResumido))
			return false;
		ProcedimentoResumido other = (ProcedimentoResumido) obj;
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
				&& ((this.tipoProcedimento == null && other.getTipoProcedimento() == null)
						|| (this.tipoProcedimento != null
								&& this.tipoProcedimento.equals(other.getTipoProcedimento())));
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
		if (getTipoProcedimento() != null) {
			_hashCode += getTipoProcedimento().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			ProcedimentoResumido.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "ProcedimentoResumido"));
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
		elemField.setFieldName("tipoProcedimento");
		elemField.setXmlName(new javax.xml.namespace.QName("", "TipoProcedimento"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "TipoProcedimento"));
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
