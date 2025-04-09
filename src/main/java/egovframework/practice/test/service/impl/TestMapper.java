package egovframework.practice.test.service.impl;

import egovframework.practice.test.service.TestVO;

import java.util.List;

// MyBatis에서 SQL 매퍼 XML 파일에 정의된 SQL 쿼리와 매핑되는 추상 메서드들을 선언해둔다
public interface TestMapper {

    // 전체 데이터 조회: 매퍼 XML에서 <select id="selectTestList">로 정의한 쿼리와 연결됨
    List<TestVO> selectTestList();

}
