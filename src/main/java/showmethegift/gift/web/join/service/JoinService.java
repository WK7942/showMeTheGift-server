package showmethegift.gift.web.join.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import showmethegift.gift.core.member.model.Address;
import showmethegift.gift.core.member.model.Member;
import showmethegift.gift.core.member.repository.MemberRepository;
import showmethegift.gift.web.join.dto.MemberJoinRequest;

@RequiredArgsConstructor
@Service
public class JoinService {
    private final MemberRepository memberRepository;

    @Transactional
    public Long save(MemberJoinRequest memberJoinRequest) {
        Address address = new Address(memberJoinRequest.getCity(), memberJoinRequest.getStreet(), memberJoinRequest.getZipcode());
        Member member = Member.init(
                memberJoinRequest.getName(),
                memberJoinRequest.getPassword(),
                memberJoinRequest.getEmail(),
                memberJoinRequest.getMobile(),
                address
        );
        Member newMember = memberRepository.save(member);
        return newMember.getMemberNum();
    }
}
