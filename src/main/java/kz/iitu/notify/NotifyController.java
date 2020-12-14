package kz.iitu.notify;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class NotifyController {

    @Autowired
    private NotifyService notifyService;

    @GetMapping("/notify")
    public ResponseEntity<List<Movie>> getRecommendation() {
        return new ResponseEntity<>(notifyService.getNotifications(), HttpStatus.OK);
    }
}
