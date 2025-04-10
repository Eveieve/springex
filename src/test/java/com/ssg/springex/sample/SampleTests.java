package com.ssg.springex.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import java.sql.Connection;

@ExtendWith(SpringExtension.class) // junit5에서 스프링과 연동할 수 있게 해주는 어노테이션. SpringExttension 통해 Junit테스트에 스프링 컨텍스트 연결해줌.
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml") // 빈들에 대한 등록정보인 root-context.xml을 알려줌. 참조해서 테스트할것임
public class SampleTests {


    // 빈 : 스프링에서는 객체를 직접 생성하지않고 설정파일/어노테이션을 통해 대신 만들어줌. 스프링이 직접 생성해서 관리하는 객체를 빈이라고 부름.
    @Autowired
    private SampleService sampleService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void testService() {
        // 널이 아니라는 건 스프링이 객ㅊ체를 주입해줬다는 것임.
       // log.info(sampleService.toString());
        Assertions.assertNotNull(sampleService);
    }


    @Test
    public void testConnection() throws Exception{
        Connection connection = dataSource.getConnection();
        //log.info(connection.toString());
        Assertions.assertNotNull(connection);
        connection.close();
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
 *
 * Bean을 등록하는 방법 >
 * 1. XML 방식
 * 2. 어노테이션 방식 (@Service, @Repository)..
 * 빈으로 등록하면 다른 클래스에서 Autowired로 주입할 수 있다.
 *
 *
 */