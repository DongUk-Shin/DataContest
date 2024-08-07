package GongGong.contest.repository;

import GongGong.contest.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    
    Optional<Member> findByAccountId(String accountId);
    
    boolean existsByAccountId(String accountId);
    
}
