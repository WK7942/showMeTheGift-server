package showmethegift.gift.web.join.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class MemberJoinRequest {
    private String name;
    private String password;
    private String mobile;
    private String email;
    private String city;
    private String street;
    private String zipcode;
}
