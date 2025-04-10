package com.ssg.springex.sample;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") // 빈들에 대한 등록정보인 root-context.xml을 알려줌. 참조해서 테스트할것임
public class SampleTests {

    @Autowired
    private SampleService sampleService;

    @Test
    public void testService() {

        Assertions.assertNotNull(sampleService);
    }


}

/**
 * SampleService 멤버 변수로 선언
 * @Autowire 어노테이션 : 스프링에서 사용하는 의존성 주입 어노테이션
 * '만약 해당 타입의 빈(Bean)'이 존재하면 여기에 주입해줘~
 *
 * @ExtendWith(SpringExtension.class)
 * Junit5버전에서 spring-test를 사용하기 위한 설정
 *
 * @ContextConfiguration(locations "file/src/main/webapp/WEB-INF/root-contexnt.xml)
 * 스프링 설정 정보를 로딩하기 위해 설정함.
 *
 */