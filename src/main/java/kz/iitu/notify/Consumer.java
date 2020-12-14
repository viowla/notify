package kz.iitu.notify;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @KafkaListener(topics = "cinema_request", groupId = "group_id")
    public void consume(Movie movie) throws IOException {
        System.out.println("Consuming event");
        System.out.println("Movie:" + movie.getTitle());
    }
}
