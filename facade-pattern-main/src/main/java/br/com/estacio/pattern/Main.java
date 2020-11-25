package br.com.estacio.pattern;

import br.com.estacio.pattern.entity.Client;
import br.com.estacio.pattern.facade.FacadeCliente;
import br.com.estacio.pattern.facade.FacadeClienteStatic;
import br.com.estacio.pattern.service.ClientService;
import br.com.estacio.pattern.service.DocumentService;
import br.com.estacio.pattern.service.EmailService;
import br.com.estacio.pattern.service.PhotoService;
import br.com.estacio.pattern.service.impl.ClientServiceImpl;
import br.com.estacio.pattern.service.impl.DocumentServiceImpl;
import br.com.estacio.pattern.service.impl.EmailServiceImpl;
import br.com.estacio.pattern.service.impl.PhotoServiceImpl;

public class Main {

    public static void main(String[] args) {

        Client douglas = Client.builder()
                .id(1)
                .name("Douglas")
                .email("douglas@gmail.com")
                .build();

        Client matheus = Client.builder()
                .id(1)
                .name("Matheus")
                .email("matheus@gmail.com")
                .build();

        ClientService clientService = new ClientServiceImpl();
        DocumentService documentService = new DocumentServiceImpl();
        EmailService emailService = new EmailServiceImpl();
        PhotoService photoService = new PhotoServiceImpl();

        documentService.add(douglas);
        emailService.add(douglas);
        photoService.add(douglas);
        clientService.add(douglas);
        System.out.println();

        documentService.remove(matheus);
        emailService.remove(matheus);
        photoService.remove(matheus);
        clientService.remove(matheus);
        System.out.println();

        FacadeCliente facadeCliente = new FacadeCliente();
        facadeCliente.add(douglas);
        System.out.println();

        facadeCliente.remove(matheus);
        System.out.println();

        FacadeClienteStatic.add(douglas);
        System.out.println();

        FacadeClienteStatic.remove(matheus);
    }
}
