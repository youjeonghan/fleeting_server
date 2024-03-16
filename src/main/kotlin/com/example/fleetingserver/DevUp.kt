package com.example.fleetingserver

enum class DevUp(val category: DevUpCategory? = null, val description: String? = null) {
    `port, adapter 구분하는 이유`(
        category = DevUpCategory.`헥사고날 아키텍처`,
        description =
            """
            - 고수준 모듈(비즈니스 로직)이 저수준의 모듈(DB 처리)에 의존하지 않고 추상화된 포트에 의존함 (의존성 역전) 그렇기 때문에 결합도가 낮아짐
                - 결합도가 높아진다는건 코드 변경, 테스트 등을 어렵게함
            - 유연성이 증가한다. DB가 mysql => mongoDB로 변경되더라도 비즈니스 로직에 영향을 아예 주지 않으면서 교체가 가능함
            """.trimIndent(),
    ),
    `get find 구분하기`(
        category = DevUpCategory.`클린 아키텍처`,
        description =
            """
            find 는 nullable한 return을 get은 non-nullable한 return을 시그니처를 통해 보여준다
            """.trimIndent(),
    ),
    `entity에 class 사용하기 data class는 왜??`(
        category = DevUpCategory.객체지향,
        description =
            """
            - 엔티티는 단순한 데이터의 집합이 아닌 도메인의 중요 개념을 모델링한것으로 의미적으로 부합하지 않음
            - data class는 allopen을 사용해도 open이되지 않고 lazyloading을 사용할 수 없음 (Jpa 이슈)
            - data class는 equals(), hashCode(), toString(), copy() 등을 자동으로 생성해주는데 이에 따른 원하지 않는 결과를 도출할 수 있음
              - 두 엔티티 간에 toString()을 무한호출할 수 있음
              - equals()가 비교하기 위한 조건이 실제 비즈니스와 상이할 수 있음
                => 오버라이딩으로 해결 가능하나 굳이 사용할 이유가 없음
            """.trimIndent(),
    ),
    ;

    enum class DevUpCategory {
        `헥사고날 아키텍처`,
        `클린 아키텍처`,
        객체지향,
    }
}
