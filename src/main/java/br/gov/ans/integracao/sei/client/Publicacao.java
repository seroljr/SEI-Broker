/**
 * Publicacao.java
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
public class Publicacao implements java.io.Serializable {
	private java.lang.String nomeVeiculo;

	private java.lang.String numero;

	private java.lang.String dataDisponibilizacao;

	private java.lang.String dataPublicacao;

	private java.lang.String estado;

	private br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional;

	public Publicacao() {
	}

	public Publicacao(java.lang.String nomeVeiculo, java.lang.String numero, java.lang.String dataDisponibilizacao,
			java.lang.String dataPublicacao, java.lang.String estado,
			br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional) {
		this.nomeVeiculo = nomeVeiculo;
		this.numero = numero;
		this.dataDisponibilizacao = dataDisponibilizacao;
		this.dataPublicacao = dataPublicacao;
		this.estado = estado;
		this.imprensaNacional = imprensaNacional;
	}

	public java.lang.String getNomeVeiculo() {
		return nomeVeiculo;
	}

	public void setNomeVeiculo(java.lang.String nomeVeiculo) {
		this.nomeVeiculo = nomeVeiculo;
	}

	public java.lang.String getNumero() {
		return numero;
	}

	public void setNumero(java.lang.String numero) {
		this.numero = numero;
	}

	public java.lang.String getDataDisponibilizacao() {
		return dataDisponibilizacao;
	}

	public void setDataDisponibilizacao(java.lang.String dataDisponibilizacao) {
		this.dataDisponibilizacao = dataDisponibilizacao;
	}

	public java.lang.String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(java.lang.String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public java.lang.String getEstado() {
		return estado;
	}

	public void setEstado(java.lang.String estado) {
		this.estado = estado;
	}

	public br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional getImprensaNacional() {
		return imprensaNacional;
	}

	public void setImprensaNacional(br.gov.ans.integracao.sei.client.PublicacaoImprensaNacional imprensaNacional) {
		this.imprensaNacional = imprensaNacional;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Publicacao))
			return false;
		Publicacao other = (Publicacao) obj;
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
				&& ((this.nomeVeiculo == null && other.getNomeVeiculo() == null)
						|| (this.nomeVeiculo != null && this.nomeVeiculo.equals(other.getNomeVeiculo())))
				&& ((this.numero == null && other.getNumero() == null)
						|| (this.numero != null && this.numero.equals(other.getNumero())))
				&& ((this.dataDisponibilizacao == null && other.getDataDisponibilizacao() == null)
						|| (this.dataDisponibilizacao != null
								&& this.dataDisponibilizacao.equals(other.getDataDisponibilizacao())))
				&& ((this.dataPublicacao == null && other.getDataPublicacao() == null)
						|| (this.dataPublicacao != null && this.dataPublicacao.equals(other.getDataPublicacao())))
				&& ((this.estado == null && other.getEstado() == null)
						|| (this.estado != null && this.estado.equals(other.getEstado())))
				&& ((this.imprensaNacional == null && other.getImprensaNacional() == null)
						|| (this.imprensaNacional != null
								&& this.imprensaNacional.equals(other.getImprensaNacional())));
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
		if (getNomeVeiculo() != null) {
			_hashCode += getNomeVeiculo().hashCode();
		}
		if (getNumero() != null) {
			_hashCode += getNumero().hashCode();
		}
		if (getDataDisponibilizacao() != null) {
			_hashCode += getDataDisponibilizacao().hashCode();
		}
		if (getDataPublicacao() != null) {
			_hashCode += getDataPublicacao().hashCode();
		}
		if (getEstado() != null) {
			_hashCode += getEstado().hashCode();
		}
		if (getImprensaNacional() != null) {
			_hashCode += getImprensaNacional().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Publicacao.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "Publicacao"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nomeVeiculo");
		elemField.setXmlName(new javax.xml.namespace.QName("", "NomeVeiculo"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("numero");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Numero"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataDisponibilizacao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DataDisponibilizacao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataPublicacao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DataPublicacao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("estado");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Estado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("imprensaNacional");
		elemField.setXmlName(new javax.xml.namespace.QName("", "ImprensaNacional"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "PublicacaoImprensaNacional"));
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
