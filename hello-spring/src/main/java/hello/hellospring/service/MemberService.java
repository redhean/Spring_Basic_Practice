package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Service
@Transactional      // JPA를 사용하려면 service 계층에서 transactional이 있어야 한다.
public class MemberService {

    private final MemberRepository memberRepository;

    //@Autowired
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    /*
    * 회원가입
    * */
    public Long join(Member member){
        long start = System.currentTimeMillis();

        try{
            validateDuplicateMember(member);    // 중복 회원 검증
            memberRepository.save(member);
            return member.getId();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("start = " + start + "ms");
            System.out.println("finish = " + finish + "ms");
            System.out.println("join = " + timeMs + "ms");
        }

        // 모든 메서드마다 시간측정 로직을 구현하는 것은 비효율적이다.
        // 공통 관심 사항(cross-cutting concern)과 핵심 관심 사항(core concern)을 분리
        // AOP로 구현

    }

    private void validateDuplicateMember(Member member) {
        // 같은 이름이 있는 중복 회원 X
        memberRepository.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }

    /*
    * 전체 회원 조회
    * */
    public List<Member> findMembers(){
        long start = System.currentTimeMillis();

        try {
            return memberRepository.findAll();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("start = " + start + "ms");
            System.out.println("finish = " + finish + "ms");
            System.out.println("join = " + timeMs + "ms");
        }

    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
