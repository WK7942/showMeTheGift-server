package showmethegift.gift.core.member.model;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNum;

    @NotNull
    private String name;

    @NotNull
    private String password;

    @NotNull
    private String email;

    @NotNull
    private String mobile;

    @NotNull
    @Embedded
    private Address address;

    @CreatedDate
    private LocalDateTime joinDate;

    public static Member init(String name, String password, String email, String mobile, Address address) {
        return Member.builder()
                .name(name)
                .password(password)
                .email(email)
                .mobile(mobile)
                .address(address)
                .joinDate(LocalDateTime.now())
                .build();
    }
}
