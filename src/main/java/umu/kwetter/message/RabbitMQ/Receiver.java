package umu.kwetter.message.RabbitMQ;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import umu.kwetter.message.Service.MessageService;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {
    private CountDownLatch latch = new CountDownLatch(1);

    @Resource
    MessageService service;

    public void receive(Long id) {
        System.out.println("Received <" + id + ">");
        latch.countDown();
        service.delete(id);
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
