package kz.iitu.notify;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @KafkaListener(topics = "cinema_request", groupId = "group_id")
    public void consume(CinemaRequest bookRequest) throws IOException {
        System.out.println(String.format("#### -> Notify user by email: -> %s",
                "User " + bookRequest.getUserId() + " purchased movie "
                        + bookRequest.getMovie().toString()));
    }
}