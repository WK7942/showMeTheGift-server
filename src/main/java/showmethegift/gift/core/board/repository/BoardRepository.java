package showmethegift.gift.core.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import showmethegift.gift.core.board.model.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
