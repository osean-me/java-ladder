# 사다리 게임
### step1. 자바8 스트림, 람다, Optional
**- 피드백**
1. @FunctionalInterface 애노테이션으로 명시화를 해줄 수가 있어요.
   * 람다용 설계 인터페이스는 애노테이션 추가하기
2. 여기도 Stream API로 해결할 수 있을 것 같아요. 해보시겠어요?
   * 스트림으로 바꿔보기!
3. 이런식으로도 가능합니다 getAge가 null인 경우 filter에 순회 대상에서 빠지기 때문이죠
   * map을 사용하여 age를 가져오고 filter로 null을 제외시킨다.

### step2. 사다리(생성)
**- 요구사항**
1. 참여하는 사람에 이름은 최대 5글자
2. 사다리 출력할떄 사람 이름도 같이 출력
3. 사람 이름은 쉼표를 기준
4. 사람 이름을 5자 기준으로 출력, 사다리 폭도 넒어져야함
5. 가로 라인이 겹치지 않도록 함

**- TODO List**
1. 참여하는 사람 객체를 만들아보자
   - Playaer, PlayerName, Players
2. PlayerName 5자 검증
3. 사다라리를 구성하는 객체 생성
   - Point, Position, Line, Ladder, Height