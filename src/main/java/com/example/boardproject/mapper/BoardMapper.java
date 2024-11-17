package com.example.boardproject.mapper;

import com.example.boardproject.domain.BoardVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();
    List<BoardVO> getBoardList();
    BoardVO getBoardByBoardId(int boardId);
    void uploadBoard(BoardVO boardVO);
    void updateBoard(BoardVO boardVO);
    void deleteBoard(int boardId);
}
