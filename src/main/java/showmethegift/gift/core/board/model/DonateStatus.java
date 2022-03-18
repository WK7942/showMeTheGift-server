package showmethegift.gift.core.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DonateStatus {
    COMPLETE("기부완료","1"),
    READY("기부대기","2");

    private final String desc;
    private final String code;
}
