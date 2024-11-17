package com.example.boardproject.controller;

import com.example.boardproject.domain.BoardVO;
import com.example.boardproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        log.debug("count = [{}]", count);
        log.debug("boardList = [{}]", boardVOList);
        model.addAttribute("cnt", count);
        model.addAttribute("boards", boardVOList);
        return "board/boardList";
    }
}
