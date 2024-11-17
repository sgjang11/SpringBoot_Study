package com.example.boardproject.service;

import com.example.boardproject.domain.BoardVO;
import com.example.boardproject.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }
}
