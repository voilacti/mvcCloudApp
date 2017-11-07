package com.sun.dao;

import java.util.List;

import com.sun.beans.Client;

public interface ClientDao {
	
    void creer( Client client ) throws DAOException;

    Client trouver( long id ) throws DAOException;

    List<Client> lister() throws DAOException;

    void supprimer( Client client ) throws DAOException;
}
