package geeks.pro.ToDo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_task")
@FieldDefaults(level =  AccessLevel.PRIVATE)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(length = 100)
    String title;

    String description;

    boolean completed;

    LocalDateTime created;

    boolean active;

    @PrePersist
    protected void onCreate() {
        completed = false;
        active = true;
        created = LocalDateTime.now();
    }
}
