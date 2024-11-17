package com.example.boardproject.service;

import com.example.boardproject.domain.BoardVO;
import com.example.boardproject.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }

    public BoardVO getBoardByBoardId(int boardId) {
        return boardMapper.getBoardByBoardId(boardId);
    }

    public void uploadBoard(BoardVO boardVO) {
        boardMapper.uploadBoard(boardVO);
    }

    public void updateBoard(BoardVO boardVO) {
        boardMapper.updateBoard(boardVO);
    }

    public void deleteBoard(int boardId) {
        boardMapper.deleteBoard(boardId);
    }
}
