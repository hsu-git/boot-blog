package org.example.bootblog.model.repository.repository;

import org.example.bootblog.model.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {
    // uuid -> 자동정렬이 이상할 것 -> createdAt..
}
