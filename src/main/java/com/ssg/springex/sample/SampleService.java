package com.ssg.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor  // 스프링3에서 권장하는 생성자 주입 방식으로 세팅하기. autowired쓰지 않고.
public class SampleService {


    //@Autowired
    // 인터페이스라고 되어있지만 사실 구현첵를 가져오는 것임 (?)
    private SampleDAO sampleDAO;
}
