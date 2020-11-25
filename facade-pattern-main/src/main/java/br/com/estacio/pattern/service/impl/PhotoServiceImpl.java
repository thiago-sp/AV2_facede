package br.com.estacio.pattern.service.impl;

import br.com.estacio.pattern.entity.Client;
import br.com.estacio.pattern.service.PhotoService;

public class PhotoServiceImpl implements PhotoService {

    public void add(Client client) {
        System.out.println("Foto do cliente " + client.getName() + " cadastrado.");
    }

    public void remove(Client client) {
        System.out.println("Foto do cliente " + client.getName() + " apagado.");
    }
}
