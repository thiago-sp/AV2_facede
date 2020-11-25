package br.com.estacio.pattern.service;

import br.com.estacio.pattern.entity.Client;

public interface DocumentService {

    void add(Client client);

    void remove(Client client);
}
