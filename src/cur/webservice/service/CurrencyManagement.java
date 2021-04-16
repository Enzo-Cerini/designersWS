package cur.webservice.service;

import javax.jws.WebMethod;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @file CurrencyManagement.java
 * @brief Interface qui permet de d�clarer les m�thodes concernant les Currency qui vont �tre impl�ment�e dans CurrencyManagementImpl.java
 * @author OBEYESEKARA Avishka, CERINI Enzo
 * @version 1.0
 * @date 15/04/2021
 *
 * Interface contenant les d�clarations des m�thodes concernant les Currency
 */
@WebService(name = "CurrencyManagement", targetNamespace = "http://service.webservice.cur/")
public interface CurrencyManagement {
	
	@WebMethod(operationName = "conversion", action = "urn:Conversion")
	@WebResult(name = "monnaieSortie")
	public String conversion(@WebParam(name = "currencyInput")double monnaieEntree, @WebParam(name = "typeInput")String typeEntree,
			@WebParam(name = "typeOutput")String typeSortie);
	
	@WebMethod(operationName = "addCurrency", action = "urn:AddCurrency")
	public String addCurrency(@WebParam(name = "newCurrencyName")String key, @WebParam(name = "newCurrencyValue")double nouvelleMonnaie);
	
	@WebMethod(operationName = "updateCurrency", action = "urn:UpdateCurrency")
	public String updateCurrency(@WebParam(name = "currencyName")String name, @WebParam(name = "newRate") double newRate);
}
