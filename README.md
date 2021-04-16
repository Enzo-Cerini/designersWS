# designersWS
cerini.enzo@gmail.com CERINI Enzo

avishka2007@gmail.com OBEYESEKARA Avishka

## Service WS
### Description du service

Le service WS est constitué de trois packages différents : 
* cur.webservice.model
* cur.webservice.service
* cur.webservice.service.jaxws

A travers ces différents packages, nous avons différentes classes qui sont implémentées.

Dans le package cur.webservice.model, nous avons créé notre classe de données Currency. 
Cette classe est associée à la création d'une Currency.

Le package cur.webservice.service, permet d'implémenter une interface et une classe.
L'interface CurrencyManagement permet de déclarer les méthodes concernant les Currency.
La classe CurrencyManagementImpl implémente les opérations concernant les Currency.

Le package cur.webservice.service.jaxws a été généré automatiquement à la création d'un web service
et ainsi lors de la selection des annotations JAX-WS(Sélection des Methodes @WebMethod, @WebParam, and @WebResult).
Dans ce package nous retrouvons les classes répresentant les méthodes ainsi que les réponses des méthodes.

## Description du client ainsi que la démonstration fonctionnelle
Le Client a été généré automatiquement à la suite de la création du webservice explicité précedemment.

La démonstration nécessite l'éxécution de trois méthodes :
* add(String name, double value)
* update(String name, double newRate)
* getConversion(double monnaieEntree, String typeEntree, String typeSortie)

La fonction add permet d'ajouter une nouvelle Currency à la liste des Currency déjà existante. Cette fonction add prend deux paramètres :
* Le nom de la nouvelle Currency que nous voulons créer
* La valeur que nous voulons lui affecter

La fonction update permet de mettre à jour une Currency déjà existante. Elle prend, elle aussi, deux paramètres :
* Le nom de la Currency déjà existante que nous voulons modifier
* La nouvelle valeur que nous voulons lui attribuer
 
La fonction getConversion convertie une devise en une autre. GetConversion, quant à elle, prend trois paramètres :
* Le somme que nous voulons convertir
* La devise que nous voulons convertir
* La devise vers laquelle nous voulons convertir

Nous vous proposons le test suivant afin de vérifier le bon fonctionnement des méthodes :
 Tout d'abord :
 * cliquer sur le fichier currencymanagementimpl.wsdl 
 * faire un clic droit sélectionner Web Services  
 * sélectionner Generate Client
 * mettre la jauge au maximum
 * cliquer sur finish
 
 Dans un second temps :
 * sélectionner la méthode add puis entrer comme nouvelle monnaie "Enzo" et comme valeur entrer 20 -> La valeur de retour est "Done"
 * sélectionner la méthode getConversion et demander l'équivalent de 1 "Euro" en "Enzo" -> La valeur de retour est 20
 * sélectionner la méthode update et entrer "Enzo" comme monnaie avec pour valeur 10 -> La valeur de retour est "Done"
 * sélectionner la méthode getConversion et demander l'équivalent de 1 "Euro" en "Enzo" -> La valeur de retour est désormais 10
 * sélectionner la méthode getConversion et demander l'équivalent de  "" en "" -> La valeur de retour est 
 * sélectionner la méthode getConversion et demander l'équivalent de  "" en "" -> La valeur de retour est 
 * sélectionner la méthode getConversion et demander l'équivalent de  "" en "" -> La valeur de retour est 
 * sélectionner la méthode getConversion et demander l'équivalent de  "" en "" -> La valeur de retour est 
 * sélectionner la méthode getConversion et demander l'équivalent de  "" en "" -> La valeur de retour est 


## Contenue du fichier wsdl

~~~ xml
<?xml version="1.0" encoding="UTF-8"?>
<wsdl:definitions name="CurrencyManagementImplService" targetNamespace="http://service.webservice.cur/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:tns="http://service.webservice.cur/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/">
  <wsdl:types>
    <schema xmlns="http://www.w3.org/2001/XMLSchema">
  <import namespace="http://service.webservice.cur/" schemaLocation="currencymanagementimpl_schema1.xsd"/>
</schema>
  </wsdl:types>
  <wsdl:message name="updateCurrencyResponse">
    <wsdl:part name="parameters" element="tns:updateCurrencyResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="updateCurrency">
    <wsdl:part name="parameters" element="tns:updateCurrency">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="conversionResponse">
    <wsdl:part name="parameters" element="tns:conversionResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="addCurrencyResponse">
    <wsdl:part name="parameters" element="tns:addCurrencyResponse">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="conversion">
    <wsdl:part name="parameters" element="tns:conversion">
    </wsdl:part>
  </wsdl:message>
  <wsdl:message name="addCurrency">
    <wsdl:part name="parameters" element="tns:addCurrency">
    </wsdl:part>
  </wsdl:message>
  <wsdl:portType name="CurrencyManagement">
    <wsdl:operation name="conversion">
      <wsdl:input name="conversion" message="tns:conversion">
    </wsdl:input>
      <wsdl:output name="conversionResponse" message="tns:conversionResponse">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="addCurrency">
      <wsdl:input name="addCurrency" message="tns:addCurrency">
    </wsdl:input>
      <wsdl:output name="addCurrencyResponse" message="tns:addCurrencyResponse">
    </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="updateCurrency">
      <wsdl:input name="updateCurrency" message="tns:updateCurrency">
    </wsdl:input>
      <wsdl:output name="updateCurrencyResponse" message="tns:updateCurrencyResponse">
    </wsdl:output>
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="CurrencyManagementImplServiceSoapBinding" type="tns:CurrencyManagement">
    <soap:binding style="document" transport="http://schemas.xmlsoap.org/soap/http"/>
    <wsdl:operation name="conversion">
      <soap:operation soapAction="urn:Conversion" style="document"/>
      <wsdl:input name="conversion">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="conversionResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="addCurrency">
      <soap:operation soapAction="urn:AddCurrency" style="document"/>
      <wsdl:input name="addCurrency">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="addCurrencyResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="updateCurrency">
      <soap:operation soapAction="urn:UpdateCurrency" style="document"/>
      <wsdl:input name="updateCurrency">
        <soap:body use="literal"/>
      </wsdl:input>
      <wsdl:output name="updateCurrencyResponse">
        <soap:body use="literal"/>
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="CurrencyManagementImplService">
    <wsdl:port name="CurrencyManagementImplPort" binding="tns:CurrencyManagementImplServiceSoapBinding">
      <soap:address location="http://localhost:8088/designersWS/services/CurrencyManagementImplPort"/>
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>

~~~
