package umu.kwetter.message.RabbitMQ;

import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class Runner {
    private final RabbitTemplate rabbitTemplate;

    public Runner(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(String data) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(Config.topicExchangeName, "msg", data);
    }

}
