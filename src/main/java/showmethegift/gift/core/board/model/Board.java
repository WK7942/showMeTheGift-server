package showmethegift.gift.core.board.model;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import showmethegift.gift.core.config.BaseEntity;
import showmethegift.gift.core.member.model.Member;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@AttributeOverride(name = "num", column = @Column(name = "board_num"))
@Entity
public class Board extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_num")
    private Member member;

    @NotNull
    private String title;

    @NotNull
    private String content;

    private Long readCount;

    @Enumerated(EnumType.STRING)
    private DonateStatus donateStatus;

    public static Board init(Member member, String title, String content) {
        return Board.builder()
                .member(member)
                .title(title)
                .content(content)
                .readCount(0L)
                .donateStatus(DonateStatus.COMPLETE)
                .build();
    }

    public void updateDonateStatusToComplete() {
        this.donateStatus = DonateStatus.COMPLETE;
    }

    public void plusReadCount() {
        ++readCount;
    }

    public void updateBoard(String title, String content){
        this.title = title;
        this.content = content;
    }
}
