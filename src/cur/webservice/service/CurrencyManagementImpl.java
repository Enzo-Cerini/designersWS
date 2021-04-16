package cur.webservice.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import cur.webservice.model.Currency;

/**
 * @file CurrencyManagementImpl.java
 * Classe qui s'occupe de toutes les opérations concernant les Currency
 * @author OBEYESEKARA Avishka, CERINI Enzo
 * @version 1.0
 *
 * Classe contenant toutes les fonctions associées aux Currency.
 */

@WebService(targetNamespace = "http://service.webservice.cur/", portName = "CurrencyManagementImplPort", serviceName = "CurrencyManagementImplService")
public class CurrencyManagementImpl implements CurrencyManagement {

	ArrayList<Currency> conversionEuro;
	
	public CurrencyManagementImpl() {
		conversionEuro = new ArrayList<Currency>();
		conversionEuro.add(new Currency("Dollar", 1.19));
		conversionEuro.add(new Currency("Livre", 0.87));
		conversionEuro.add(new Currency("Yen", 130.45));
		conversionEuro.add(new Currency("Roupie", 88.85));
	}
	

	/**
	 * String conversion(double monnaieEntree, String typeEntree, String typeSortie)
	 * Fonction qui convertie une devise en une autre
	 * @param monnaieEntree Somme que nous voulons convertir (Type Double)
	 * @param typeEntree Devise que nous voulons convertir (Type String)
	 * @param typeSortie Devise vers laquelle nous voulons convertir (Type String)
	 * @return Retourne un String qui correspond au résultat de la conversion
	 */
	@WebMethod(operationName = "conversion", action = "urn:Conversion")
	@WebResult(name = "return")
	public String conversion(@WebParam(name = "arg0") double monnaieEntree, @WebParam(name = "arg1") String typeEntree, @WebParam(name = "arg2") String typeSortie) {
		double monnaieSortie = 0;
		
		if(typeSortie.equals("Euro")) {
			for(int i = 0; i<conversionEuro.size(); i++) {
				if(conversionEuro.get(i).getName().equals(typeEntree))  {
					monnaieSortie = monnaieEntree/conversionEuro.get(i).getValue();
				}
			}
		}
		else if(typeEntree.equals("Euro")) {
			for(int i = 0; i<conversionEuro.size(); i++) {
				if(conversionEuro.get(i).getName().equals(typeSortie)) {
					monnaieSortie = monnaieEntree*conversionEuro.get(i).getValue();
				}
			}
		}
		else if(!typeEntree.equals("Euro")) {
			double intermediaireEntree = 0;
			double intermediaireSortie = 0;
			for(int i = 0; i<conversionEuro.size(); i++) {
				if(conversionEuro.get(i).getName().equals(typeEntree)) {
					intermediaireEntree = conversionEuro.get(i).getValue();
				}
				else if(conversionEuro.get(i).getName().equals(typeSortie)) {
					intermediaireSortie = conversionEuro.get(i).getValue();
				}
			}
			
			monnaieSortie = (monnaieEntree/intermediaireEntree)*intermediaireSortie;
			
		}
		return monnaieEntree + " " + typeEntree + " = " + monnaieSortie + " " + typeSortie;
	}

	/**
	 * String addCurrency(String key, double nouvelleMonnaie)
	 * Fonction permettant d'ajouter une nouvelle Currency à la liste des Currency déjà existante 
	 * @param key Nom de la nouvelle Currency (Type String)
	 * @param nouvelleMonnaie Valeur de la nouvelle Currency (Type Double)
	 * @return Retourne un String qui indique que l'opération s'est réalisée avec succès
	 */
	@WebMethod(operationName = "addCurrency", action = "urn:AddCurrency")
	@WebResult(name = "return")
	public String addCurrency(@WebParam(name = "arg0") String key, @WebParam(name = "arg1") double nouvelleMonnaie) {
		Currency currency = new Currency(key, nouvelleMonnaie);
		conversionEuro.add(currency);
		return "Done";
	}

	/**
	 * String updateCurrency(String name, double newRate)
	 * Fonction qui met à jour une Currency déjà existante
	 * @param name Nom de la Currency que nous voulons changer (Type String)
	 * @param newRate Nouvelle valeur que nous voulons attribuer à la Currency (Type Double)
	 * @return Retourne un String qui indique que l'opération s'est réalisée avec succès
	 */
	@WebMethod(operationName = "updateCurrency", action = "urn:UpdateCurrency")
	@WebResult(name = "return")
	public String updateCurrency(@WebParam(name = "arg0") String name, @WebParam(name = "arg1") double newRate) {
		for(int i = 0; i < conversionEuro.size(); i++) {
			if(conversionEuro.get(i).getName().equals(name)) {
				conversionEuro.get(i).setValue(newRate);
			}
		}
		return "Done";
	}

}
