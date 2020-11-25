package br.com.estacio.pattern.facade;

import br.com.estacio.pattern.entity.Client;
import br.com.estacio.pattern.service.ClientService;
import br.com.estacio.pattern.service.DocumentService;
import br.com.estacio.pattern.service.EmailService;
import br.com.estacio.pattern.service.PhotoService;
import br.com.estacio.pattern.service.impl.ClientServiceImpl;
import br.com.estacio.pattern.service.impl.DocumentServiceImpl;
import br.com.estacio.pattern.service.impl.EmailServiceImpl;
import br.com.estacio.pattern.service.impl.PhotoServiceImpl;

public class FacadeCliente {

    ClientService clientService = new ClientServiceImpl();
    DocumentService documentService = new DocumentServiceImpl();
    EmailService emailService = new EmailServiceImpl();
    PhotoService photoService = new PhotoServiceImpl();

    public void add(Client client) {
        documentService.add(client);
        emailService.add(client);
        photoService.add(client);
        clientService.add(client);
    }

    public void remove(Client client) {
        documentService.remove(client);
        emailService.remove(client);
        photoService.remove(client);
        clientService.remove(client);
    }

}
