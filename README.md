# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 자동차 경주(우승자) 기능 목록
* UI InputView 구현
  * 자동차 이름(5자 초과 불가), 몇 번의 이동 입력받는 로직
* UI ResultView 구현
  * 결과창 보여주는 로직
  * 자동차의 현재 상태 보여주는 로직
  * 우승자 알려주는 로직
* Car 클래스 구현
  * 자동차 이름 부여
  * 자동차 이름 유효성 확인 기능 - 5글자 초과x
  * 전진할지 멈춰있을지 확인하는 로직
  * 움직이는 로직
  * 자동차의 현재 상태 출력하는 로직
* RacingCarGame 클래스 구현
  * 위 세가지를 잘 묶기
* Car를 묶는 Cars 클래스 구현
* tryCount를 받고 진행하는 Rounds 클래스 구현
* Rounds의 결과를 받는 Result 클래스 구현
* RacingCar 테스트 코드 작성

### 코드 리뷰
* Position 객체를 불변객체로 바꿔보기 - 어떤 이점이 있을까? 이유는?
* Result의 findWinners메서드 Cars에 넣어보기 - getter는 뷰에서만 사용하도록
* Cars의 getCars Collections.unmodifiableList사용 - 어떤 장점이 있을까?
* 뷰를 위한 로직은 도메인에 존재하지 않도록. (Car의 showCurrentState(), Position의 getStringValue())
* Car객체의 name을 객체로
* Car의 move메서드 파라미터명 random에서 변경

## 자동차 경주 기능 목록
* UI InputView 구현
  * 몇 대의 자동차, 몇 번의 이동 입력받는 로직
* UI ResultView 구현
  * 결과창 보여주는 로직
  * 자동차의 현재 상태 보여주는 로직
* RacingCar 클래스 구현
  * 전진할지 멈춰있을지 확인하는 로직
  * 움직이는 로직
  * 자동차의 현재 상태 출력하는 로직
* RacingCarGame 클래스 구현
  * 위 세가지를 잘 묶기
* RacingCar 테스트 코드 작성
* RacingGame 테스트 코드 작성

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)