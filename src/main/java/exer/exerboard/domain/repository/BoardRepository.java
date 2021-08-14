package exer.exerboard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository<BoardEntity> extends JpaRepository<BoardEntity, Long> {
}