/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcQryExchangeOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQryExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttradeapiJNI.CThostFtdcQryExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttradeapiJNI.CThostFtdcQryExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeOrderField() {
    this(thosttradeapiJNI.new_CThostFtdcQryExchangeOrderField(), true);
  }

}