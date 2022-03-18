package showmethegift.gift.web.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import showmethegift.gift.core.board.model.Board;
import showmethegift.gift.core.board.repository.BoardRepository;
import showmethegift.gift.core.member.model.Member;
import showmethegift.gift.core.member.repository.MemberRepository;
import showmethegift.gift.web.board.dto.BoardRequest;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final MemberRepository memberRepository;

    public Long save(BoardRequest boardRequest){
        Member member = memberRepository.findById(boardRequest.getMember_num()).orElseThrow(IllegalArgumentException::new);
        Board board = Board.init(member, boardRequest.getTitle(), boardRequest.getContent());
        return boardRepository.save(board).getNum();
    }
}
