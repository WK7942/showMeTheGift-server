package showmethegift.gift.core.config;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    public void setNum(Long num) {
        this.num = num;
    }
}
