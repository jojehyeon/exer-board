package exer.exerboard.service;


import exer.dto.BoardDto;
import exer.exerboard.domain.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(@NotNull BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getid();
    }
}