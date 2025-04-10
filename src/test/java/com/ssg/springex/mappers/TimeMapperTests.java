package com.ssg.springex.mappers;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@ExtendWith(SpringExtension.class) // junit5에서 스프링과 연동할 수 있게 해주는 어노테이션. SpringExttension 통해 Junit테스트에 스프링 컨텍스트 연결해줌.
// file: 파일 시스템 경로로 직접 읽겠다.
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TimeMapperTests {

    @Autowired(required = false)
    private TimeMapper mapper;

    @Autowired(required = false)
    private TimeMapper2 mapper2;

    @Test
    public void TimeMapperTest() {
        log.info(mapper);
    }

    @Test
    public void TimeMapperTest2() {
        log.info(mapper2.getNow());
    }
}
