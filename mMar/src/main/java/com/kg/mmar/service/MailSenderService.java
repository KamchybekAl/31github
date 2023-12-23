package com.kg.mmar.service;

import com.kg.mmar.entity.Order;

public interface MailSenderService {
    void sendSimpleMessage(String to, String subject, String text, String filePath);
    void sendOrderMessage(Order order);
}
