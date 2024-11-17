package com.example.boardproject.controller;

import com.example.boardproject.domain.BoardVO;
import com.example.boardproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("board")
@RequiredArgsConstructor
@Log4j2
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board-list")
    public String boardList(Model model) {
        int count = boardService.boardCount();
        List<BoardVO> boardVOList = boardService.getBoardList();
        log.info("count = [{}]", count);
        log.info("boardList = [{}]", boardVOList);
        model.addAttribute("cnt", count);
        model.addAttribute("boards", boardVOList);
        return "board/boardList";
    }

    @GetMapping("/board-view")
    public String getBoardByBoardId(Model model, int boardId) {
        log.info("boardId = [{}]", boardId);
        BoardVO boardVO = boardService.getBoardByBoardId(boardId);
        log.info("boardVO = [{}]", boardVO);
        model.addAttribute("board", boardVO);
        return "board/boardView";
    }

    @GetMapping("/board-upload")
    public String boardUpload(Model model) {
        return "board/boardUpload";
    }

    @PostMapping("/uploadBoard")
    public String uploadBoard(BoardVO boardVO) {
        log.info("boardVO = [{}]", boardVO);
        boardService.uploadBoard(boardVO);
        return "redirect:/board/board-list";
    }

    @PutMapping("/updateBoard")
    public String updateBoard(BoardVO boardVO) {
        log.info("boardVO = [{}]", boardVO);
        boardService.updateBoard(boardVO);
        return "redirect:/board/board-list";
    }

    @DeleteMapping("/deleteBoard")
    public String deleteBoard(int boardId) {
        log.info("boardId = [{}]", boardId);
        boardService.deleteBoard(boardId);
        return "redirect:/board/board-list";
    }
}
