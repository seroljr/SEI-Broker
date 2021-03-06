/**
 * AndamentoMarcador.java
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
public class AndamentoMarcador implements java.io.Serializable {
	private java.lang.String idAndamentoMarcador;

	private java.lang.String texto;

	private java.lang.String dataHora;

	private br.gov.ans.integracao.sei.client.Usuario usuario;

	private br.gov.ans.integracao.sei.client.Marcador marcador;

	public AndamentoMarcador() {
	}

	public AndamentoMarcador(java.lang.String idAndamentoMarcador, java.lang.String texto, java.lang.String dataHora,
			br.gov.ans.integracao.sei.client.Usuario usuario, br.gov.ans.integracao.sei.client.Marcador marcador) {
		this.idAndamentoMarcador = idAndamentoMarcador;
		this.texto = texto;
		this.dataHora = dataHora;
		this.usuario = usuario;
		this.marcador = marcador;
	}

	public java.lang.String getIdAndamentoMarcador() {
		return idAndamentoMarcador;
	}

	public void setIdAndamentoMarcador(java.lang.String idAndamentoMarcador) {
		this.idAndamentoMarcador = idAndamentoMarcador;
	}

	public java.lang.String getTexto() {
		return texto;
	}

	public void setTexto(java.lang.String texto) {
		this.texto = texto;
	}

	public java.lang.String getDataHora() {
		return dataHora;
	}

	public void setDataHora(java.lang.String dataHora) {
		this.dataHora = dataHora;
	}

	public br.gov.ans.integracao.sei.client.Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(br.gov.ans.integracao.sei.client.Usuario usuario) {
		this.usuario = usuario;
	}

	public br.gov.ans.integracao.sei.client.Marcador getMarcador() {
		return marcador;
	}

	public void setMarcador(br.gov.ans.integracao.sei.client.Marcador marcador) {
		this.marcador = marcador;
	}

	private java.lang.Object __equalsCalc = null;

	public boolean equals(java.lang.Object obj) {
		if (!(obj instanceof AndamentoMarcador))
			return false;
		AndamentoMarcador other = (AndamentoMarcador) obj;
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
				&& ((this.idAndamentoMarcador == null && other.getIdAndamentoMarcador() == null)
						|| (this.idAndamentoMarcador != null
								&& this.idAndamentoMarcador.equals(other.getIdAndamentoMarcador())))
				&& ((this.texto == null && other.getTexto() == null)
						|| (this.texto != null && this.texto.equals(other.getTexto())))
				&& ((this.dataHora == null && other.getDataHora() == null)
						|| (this.dataHora != null && this.dataHora.equals(other.getDataHora())))
				&& ((this.usuario == null && other.getUsuario() == null)
						|| (this.usuario != null && this.usuario.equals(other.getUsuario())))
				&& ((this.marcador == null && other.getMarcador() == null)
						|| (this.marcador != null && this.marcador.equals(other.getMarcador())));
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
		if (getIdAndamentoMarcador() != null) {
			_hashCode += getIdAndamentoMarcador().hashCode();
		}
		if (getTexto() != null) {
			_hashCode += getTexto().hashCode();
		}
		if (getDataHora() != null) {
			_hashCode += getDataHora().hashCode();
		}
		if (getUsuario() != null) {
			_hashCode += getUsuario().hashCode();
		}
		if (getMarcador() != null) {
			_hashCode += getMarcador().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			AndamentoMarcador.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("Sei", "AndamentoMarcador"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("idAndamentoMarcador");
		elemField.setXmlName(new javax.xml.namespace.QName("", "IdAndamentoMarcador"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("texto");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Texto"));
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
		elemField.setFieldName("usuario");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Usuario"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Usuario"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("marcador");
		elemField.setXmlName(new javax.xml.namespace.QName("", "Marcador"));
		elemField.setXmlType(new javax.xml.namespace.QName("Sei", "Marcador"));
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
