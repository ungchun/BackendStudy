package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // excludeFilters 자동등록 제외시켜줌
        // @Configuration은 자동등록 제외
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)

//        basePackages = "hello.core.member", // 여기서 부터 찾아서 등록하라는 뜻
//        basePackageClasses = AutoAppConfig.class
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
