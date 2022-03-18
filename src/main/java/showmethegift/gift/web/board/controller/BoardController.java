package showmethegift.gift.web.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import showmethegift.gift.web.board.dto.BoardRequest;
import showmethegift.gift.web.board.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping(BoardControllerPath.save)
    public Long save(BoardRequest boardRequest) {
        return boardService.save(boardRequest);
    }
}
