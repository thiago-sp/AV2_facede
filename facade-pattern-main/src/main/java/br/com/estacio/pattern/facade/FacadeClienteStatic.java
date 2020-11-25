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

public class FacadeClienteStatic {

    public static void add(Client client) {
        ClientService clientService = new ClientServiceImpl();
        DocumentService documentService = new DocumentServiceImpl();
        EmailService emailService = new EmailServiceImpl();
        PhotoService photoService = new PhotoServiceImpl();

        documentService.add(client);
        emailService.add(client);
        photoService.add(client);
        clientService.add(client);
    }

    public static void remove(Client client) {
        ClientService clientService = new ClientServiceImpl();
        DocumentService documentService = new DocumentServiceImpl();
        EmailService emailService = new EmailServiceImpl();
        PhotoService photoService = new PhotoServiceImpl();

        documentService.remove(client);
        emailService.remove(client);
        photoService.remove(client);
        clientService.remove(client);
    }

}
