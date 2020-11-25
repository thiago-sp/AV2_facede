package br.com.estacio.pattern.service;

import br.com.estacio.pattern.entity.Client;

public interface EmailService {

    void add(Client client);

    void remove(Client client);
}
