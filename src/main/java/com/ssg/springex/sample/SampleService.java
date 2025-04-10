package com.ssg.springex.sample;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@ToString
@Service
public class SampleService {
//    @Autowired
//    private SampleDAO sampleDAO;

    @Autowired
    private SampleDAO1 sampleDAO1;
}
