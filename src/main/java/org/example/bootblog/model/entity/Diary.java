package org.example.bootblog.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity // JPA
@Data   // Lombok - Getter, Setter, 생성자
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // 일반적으로 auto 씀. 우리는 일단 uuid로.
    String uuid;    // uuid 하는 이유 -> 외부에서 접근 가능하도록.. 일지니까..
    @Column(nullable = false)
    String title;
    @Column(nullable = false, length = 2000)
    String content;
    @Column(nullable = false, length = 2000)
    String imageUrl;
    @CreatedDate
     LocalDateTime createdAt = LocalDateTime.now();  // TIL
    // https://g.co/gemini/share/2e2d01a6e463
}








