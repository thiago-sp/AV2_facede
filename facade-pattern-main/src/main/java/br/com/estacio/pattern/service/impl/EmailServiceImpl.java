package br.com.estacio.pattern.service.impl;

import br.com.estacio.pattern.entity.Client;
import br.com.estacio.pattern.service.EmailService;

public class EmailServiceImpl implements EmailService {

    public void add(Client client) {
        System.out.println("Email do cliente " + client.getName() + " cadastrado.");
    }

    public void remove(Client client) {
        System.out.println("Email do cliente " + client.getName() + " apagado.");
    }
}
