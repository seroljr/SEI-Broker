/**
 * Assinatura.java
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
public class Assinatura implements java.io.Serializable {
	private java.lang.String nome;

	private java.lang.String cargoFuncao;

	private java.lang.String dataHora;

	private java.lang.String idUsuario;

	private java.lang.String idOrigem;

	private java.lang.String idOrgao;

	private java.lang.String sigla;

	public Assinatura() {
	}

	public Assinatura(java.lang.String nome, java.lang.String cargoFuncao, java.lang.String dataHora,
			java.lang.String idUsuario, java.lang.String idOrigem, java.lang.String idOrgao, java.lang.String sigla) {
		this.nome = nome;
		this.cargoFuncao = cargoFuncao;
		this.dataHora = dataHora;
		this.idUsuario = idUsuario;
		this.idOrigem = idOrigem;
		this.idOrgao = idOrgao;
		this.sigla = sigla;
	}

	public java.lang.String getNome() {
		return nome;
	}

	public void setNome(java.lang.String nome) {
		this.nome = nome;
	}

	public java.lang.String getCargoFuncao() {
		return cargoFuncao;
	}

	public void setCargoFuncao(java.lang.String cargoFuncao) {
		this.cargoFuncao = cargoFuncao;
	}

	public java.lang.String getDataHora() {
		return dataHora;
	}

	public void setDataHora(java.lang.String dataHora) {
		this.dataHora = dataHora;
	}

	public java.lang.String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(java.lang.String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public java.lang.String getIdOrigem() {
		return idOrigem;
	}

	public void setIdOrigem(java.lang.String idOrigem) {
		this.idOrigem = idOrigem;
	}

	public java.lang.String getIdOrgao() {
		return idOrgao;
	}

	public void setIdOrgao(java.lang.String idOrgao) {
		this.idOrgao = idOrgao;
	}

	public java.lang.String getSigla() {
		return sigla;
	}

	public void setSigla(java.lang.String sigla) {
		this.sigla = sigla;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof Assinatura))
			return false;
		Assinatura other = (Assinatura) obj;
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
				&& ((this.nome == null && other.getNome() == null)
						|| (this.nome != null && this.nome.equals(other.getNome())))
				&& ((this.cargoFuncao == null && other.getCargoFuncao() == null)
						|| (this.cargoFuncao != null && this.cargoFuncao.equals(other.getCargoFuncao())))
				&& ((this.dataHora == null && other.getDataHora() == null)
						|| (this.dataHora != null && this.dataHora.equals(other.getDataHora())))
				&& ((this.idUsuario == null && other.getIdUsuario() == null)
						|| (this.idUsuario != null && this.idUsuario.equals(other.getIdUsuario())))
				&& ((this.idOrigem == null && other.getIdOrigem() == null)
						|| (this.idOrigem != null && this.idOrigem.equals(other.getIdOrigem())))
				&& ((this.idOrgao == null && other.getIdOrgao() == null)
						|| (this.idOrgao != null && this.idOrgao.equals(other.getIdOrgao())))
				&& ((this.sigla == null && other.getSigla() == null)
						|| (this.sigla != null && this.sigla.equals(other.getSigla())));
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
		if (getNome() != null) {
			_hashCode += getNome().hashCode();
		}
		if (getCargoFuncao() != null) {
			_hashCode += getCargoFuncao().hashCode();
		}
		if (getDataHora() != null) {
			_hashCode += getDataHora().hashCode();
		}
		if (getIdUsuario() != null) {
			_hashCode += getIdUsuario().hashCode();
		}
		if (getIdOrigem() != null) {
			_hashCode += getIdOrigem().hashCode();
		}
		if (getIdOrgao() != null) {
			_hashCode += getIdOrgao().hashCode();
		}
		if (getSigla() != null) {
			_hashCode += getSigla().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Assinatura.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "Assinatura"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("nome");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Nome"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("cargoFuncao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "CargoFuncao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("dataHora");
		elemField.setXmlName(new javax.xml.namespace.QName("", "DataHora"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idUsuario");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdUsuario"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idOrigem");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdOrigem"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idOrgao");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdOrgao"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("sigla");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Sigla"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
