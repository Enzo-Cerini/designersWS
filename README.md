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
CurrencyManagementImpl implémente ces opérations concernant les Currency.

Le package cur.webservice.service.jaxws a été généré automatiquement à la création d'un web service
et ainsi lors de la selection des annotations JAX-WS(Sélection des Methodes @WebMethod, @WebParam, and @WebResult).
Dans ce package nous retrouvons les classes répresentant les méthodes ainsi que les reponses des méthodes.

## Description du client ainsi que la démonstration fonctionnelle
Le Client a été généré automatiquement à la suite de la création du webservice explicité précedemment.

La démonstration nécessite l'éxécution de trois méthodes :
* add(String name, double value)
* update(String name, double newRate)
* getConversion(double monnaieEntree, String typeEntree, String typeSortie

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
