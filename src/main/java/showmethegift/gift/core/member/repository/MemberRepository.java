package showmethegift.gift.core.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import showmethegift.gift.core.member.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
