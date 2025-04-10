package com.ssg.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor  // 스프링3에서 권장하는 생성자 주입 방식으로 세팅하기. autowired쓰지 않고.
@Log4j2
public class SampleService {

    @Qualifier("normal") // 이름 지정해주기
    private SampleDAO sampleDAO;
}
