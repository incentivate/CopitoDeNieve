package com.uces.CopitoDeNieve.controller;


import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class MailController {

    @Autowired
    private JavaMailSender sender;

    @RequestMapping(value="/mail", method = RequestMethod.POST)
    @ResponseBody
    String pedido() {
        try {
            sendEmail();
            return "Mail Enviado! Gracias por su compra";
        }catch(Exception ex) {
            return "Error al enviar el email: " + ex;
        }
    }

    private void sendEmail() throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo("incentivate@gmail.com");
        helper.setText("Gracias por su compra");
        helper.setSubject("Confirmación de Pedido | Copito de nieve");

        sender.send(message);
    }
}
