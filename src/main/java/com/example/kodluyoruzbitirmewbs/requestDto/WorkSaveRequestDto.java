package com.example.kodluyoruzbitirmewbs.requestDto;

import lombok.Data;

//work save request dto
@Data
public class WorkSaveRequestDto {

    private String workName;

    private String workComment;

    private int parentId;

    private Integer userId;
}
