package cur.webservice.model;

/**
 * @file Currency.java
 * @brief Classe qui permet de cr�er l'objet Currency
 * @author OBEYESEKARA Avishka, CERINI Enzo
 * @version 1.0
 * @date 15/04/2021
 *
 * Classe associ�e � la cr�ation d'une Currency.
 *
 */

public class Currency {
	private String name;
	private double value;
	
	/**
	 * Currency constructeur
	 * @param name Nom de la Currency (Type String)
	 * @param value Valeur de la Currency (Type Double)
	 */
	public Currency(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}

	/**
	 * String getName()
	 * @brief Fonction qui retourne le nom de la Currency
	 * @return Le nom de la Currency
	 */
	public String getName() {
		return name;
	}

	/**
	 * void setName(String name)
	 * @brief fonction qui met � jour le nom de la Currency
	 * @param name Nouveau nom de la Currency (Type String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * double getValue()
	 * @brief Fonction qui retourne la valeur de la Currency
	 * @return La valeur de la Currency
	 */
	public double getValue() {
		return value;
	}

	/**
	 * void setValue(double value)
	 * @brief fonction qui met � jour la valeur de la Currency
	 * @param value Nouvelle valeur de la Currency (Type Double)
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	
	
}
