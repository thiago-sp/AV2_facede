package br.com.estacio.pattern.service.impl;

import br.com.estacio.pattern.service.ClientService;

public class ClientServiceImpl implements ClientService {

    public void add(br.com.estacio.pattern.entity.Client client) {
        System.out.println("Cliente " + client.getName() + " cadastrado.");
    }

    public void remove(br.com.estacio.pattern.entity.Client client) {
        System.out.println("Cliente " + client.getName() + " apagado.");
    }
}
