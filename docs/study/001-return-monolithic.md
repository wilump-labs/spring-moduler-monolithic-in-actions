# 001. 모놀리식으로 돌아가기
## 1. Background
기술적 이점, 유행 등의 이유로 마이크로서비스로 개발을 진행했다.

근데 서비스를 분리했더니 몇몇 상황에서 오히려 관리가 힘들다.
- 데이터 관리
- 서비스의 혼잡성
- 모니터링
- 동시 배포

그래서 다시 모놀리식으로 돌아가려고 한다.

모놀리식으로 갈 때는.
- **다시 언제든 찢어질 수 있어야 한다**
- 그러기 위해서는 느슨한 결합, 강한 응집성을 준수해야 한다

<br/>

## 2. Comparison
일단 모놀리식과 마이크로서비스의 특징을 알고 넘어가자

### 모놀리식
- 단일 프로젝트에 모든 코드가 존재
- 시스템 구조가 간결하고 빠르게 구축 가능
- 테스트 및 배포 파이프라인이 간단함
- 인프라 및 구축 운용이 쉬움

### 마이크로서비스
- 시스템을 조직 구조에 맞게 적절히 정렬(분리) 가능
- 서비스를 독립적으로 배포 및 확장 가능
- 서비스의 장애가 시스템 전체 장애로 확장되지 않음
- 문제 해결에 특화된 다양한 기술을 도입 가능

<br/>

## 3. Prerequisites
모놀리식으로 가더라도 모듈 간 격리(공통 관심사 분리, 모듈 간 의존성 관리)는 중요
- 모듈 간 격리는 좋은 아키텍처 설계를 기반으로 한다. 도메인 간의 경계를 명확히 하고, 모듈 간의 의존성을 최소화하는 것이 중요

의존성 및 리소스가 혼재되어 추후 분리에 어려움이 있으면 안됨

> 그럼 의존성 및 리소스 관리 어케 할건데?

1. 자바 가시성 활용 (접근 제어자 활용)
2. 멀티 모듈을 통해 리소스를 관리 (외부 의존성 관리 도구 활용)

이렇게 해도 모듈 외부로 공개되면 안 되는 컴포넌트가 공개될 수 있음. 

단일 컨테이너(IoC 컨테이너) 내에 공개/비공개 여부를 제한할 수 없음.

3. 스프링 계층 구조를 활용
   - 여러 개의 컨테이너(도메인 별 컨텍스트 기반)을 만들어서 관리
   - 자식 컨테이너는 부모 컨테이너에게 공개(등록)
   - 다른 자식 컨테이너는 부모 컨테이너에 등록된 빈을 주입받음

4. Spring Modulith
   - 2번 방법과 달리 논리적으로 모듈을 제어
   - 모듈(패키지) 간 의존성 제어, 모니터링 및 문서화 관련 편의 기능 제공

<br/>

## 4. TODO
1. Spring Modulith PoC
2. 모듈간 장애 격리 및 모니터링 방법 PoC 필요
   - Spring Modulith의 경우 OpenTracing, Micrometer 등을 통해 모듈 간 모니터링을 지원
   - 그 외 방법을 차용하는 경우에 대한 PoC 필요

<br/>

## Reference
- [우아한테크세미나: 200123 우아한모노리스 by 박용권님](https://www.youtube.com/watch?v=SrQeIz3gXZg)
  - [예제코드](https://github.com/arawn/building-modular-monoliths-using-spring) 
  - [발표자료: 우아한모노리스](https://www.slideshare.net/slideshow/ss-224478403/224478403)
  - [발표자료: 잘 키운 모노리스 하나 열 마이크로서비스 안 부럽다](https://www.slideshare.net/slideshow/ss-195979955/195979955)
- [Modular Monolithic Architecture와 Spring Modulith](https://monday9pm.com/modular-architecture%EC%99%80-spring-modulith-43b6709b2937)
- [Spring Modulith](https://docs.spring.io/spring-modulith/reference/index.html)
  - [baeldung: Spring Modulith](https://www.baeldung.com/spring-modulith)
  - [Spring Modulith Monitoring](https://docs.spring.io/spring-modulith/reference/production-ready.html)
  - [Youtube: Spring Modulith Deep Dive](https://www.youtube.com/watch?v=430YOyMNjhs)
- [spring-modulith overview(KR)](https://velog.io/@gehwan96/Spring-Modulith)
- [멀티 모듈 설계 관점](https://mangkyu.tistory.com/304)
  - [PPT](https://docs.google.com/presentation/d/1TSs-w9WW7Bz0qtu9byVR7UnHYNAYYWYt/edit#slide=id.p1)