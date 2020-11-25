package br.com.estacio.pattern.service.impl;

import br.com.estacio.pattern.entity.Client;
import br.com.estacio.pattern.service.DocumentService;

public class DocumentServiceImpl implements DocumentService {

    public void add(Client client) {
        System.out.println("Documento do cliente " + client.getName() + " cadastrado.");
    }

    public void remove(Client client) {
        System.out.println("Documento do cliente " + client.getName() + " apagado.");
    }
}
