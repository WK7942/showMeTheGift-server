package showmethegift.gift.web.join.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import showmethegift.gift.web.join.dto.MemberJoinRequest;
import showmethegift.gift.web.join.dto.MemberJoinResponse;
import showmethegift.gift.web.join.service.JoinService;

@RestController
@RequiredArgsConstructor
public class MemberJoinController {
    private final JoinService joinService;

    @PostMapping(MemberJoinControllerPath.JOIN)
    public MemberJoinResponse save(@RequestBody MemberJoinRequest memberJoinRequest) {
        return new MemberJoinResponse(joinService.save(memberJoinRequest));
    }
}
