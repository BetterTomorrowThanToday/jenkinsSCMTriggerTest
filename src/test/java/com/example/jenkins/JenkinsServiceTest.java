package com.example.jenkins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JenkinsServiceTest {
    //테스트할 메서드를 가진 클래스를 가져오기
    private JenkinsService service = new JenkinsService();

    @Test
    public void testService(){
        assertEquals(5050, service.hap(100));

    }
}