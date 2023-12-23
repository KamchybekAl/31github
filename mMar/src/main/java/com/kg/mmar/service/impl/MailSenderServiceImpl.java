package com.kg.mmar.service.impl;

import com.kg.mmar.entity.Order;
import com.kg.mmar.service.MailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
@RequiredArgsConstructor
public class MailSenderServiceImpl implements MailSenderService {
    private final JavaMailSender emailSender;
    @Override
    public void sendSimpleMessage(String to, String subject, String text, String filePath) {
        MimeMessage message = emailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom("noreply@baeldung.com");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(text);
            FileSystemResource file
                    = new FileSystemResource(new File(filePath));
            helper.addAttachment("CarPhoto.jpg", file);
            emailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendOrderMessage(Order order) {
        String messageDiscount = "";
        if (order.getTotalPrice() != 0.0) {
            messageDiscount = "\n Итоговая сумма с учётом Вашей скидки: " + order.getTotalPrice();
        }
        String message = " Вы забронировали товары " + order.getBasket().getProductList() ;
        String subject = "Ваш заказ по нашему магазину";
//        sendSimpleMessage(order.getClientEmail(), subject, message, order.getBasket().getPhoto());

    }
}
