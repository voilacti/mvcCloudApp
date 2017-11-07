package com.sun.beans;

import java.io.Serializable;
import java.sql.Timestamp;

public class Commande implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long    	id;
    private Client   	client;
    private Timestamp	date;
    private Double   	montant;
    private String   	modePaiement;
    private String   	statutPaiement;
    private String   	modeLivraison;
    private String   	statutLivraison;

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient( Client client ) {
        this.client = client;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate( Timestamp date ) {
        this.date = date;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant( Double montant ) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement( String modePaiement ) {
        this.modePaiement = modePaiement;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement( String statutPaiement ) {
        this.statutPaiement = statutPaiement;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison( String modeLivraison ) {
        this.modeLivraison = modeLivraison;
    }

    public String getStatutLivraison() {
        return statutLivraison;
    }

    public void setStatutLivraison( String statutLivraison ) {
        this.statutLivraison = statutLivraison;
    }
}