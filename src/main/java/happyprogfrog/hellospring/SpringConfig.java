package happyprogfrog.hellospring;

import happyprogfrog.hellospring.repository.MemberRepository;
import happyprogfrog.hellospring.repository.MemoryMemberRepository;
import happyprogfrog.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
