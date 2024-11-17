package com.example.boardproject.domain;

import lombok.Data;

@Data
public class BoardVO {

    private int boardId;
    private String title;
    private String content;
    private String name;
}
