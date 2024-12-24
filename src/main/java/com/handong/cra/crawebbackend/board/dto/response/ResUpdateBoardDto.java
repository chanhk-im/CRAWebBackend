package com.handong.cra.crawebbackend.board.dto.response;


import com.handong.cra.crawebbackend.board.domain.Board;
import com.handong.cra.crawebbackend.board.domain.Category;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ResUpdateBoardDto {
    private Long userId;
    private Board deleted;
    private String title;
    private String content;
    private Category category;
    private List<String> imageUrls;
    // TODO: add havrutaid
}
