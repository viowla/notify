package kz.iitu.notify;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table(name="movie")
@NoArgsConstructor
public class Movie {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name="title")
    private String title;
    @Column(name="overview")
    private String overview;


}
