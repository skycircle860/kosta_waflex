# kosta_waflex

2019년 kosta 교육간 진행했던 영화정보제공 사이트 제작 프로젝트.

유저에게는 사용자와 비슷한 장르의 영화를 좋아하는 유저들이 많이 보는 영상 정보를 제공하고, 넷플릭스나 왓챠와 같이 사용자가 영상을 시청하면 시청한 영화와 비슷한 성격의 영상을 분석하여 메인에 출력해주며 유튜브의 내 플레이 리스트 같은 개인 영상리스트와 내가 사이트에서 사용한 금액 차트데이터 제공.

관리자에게는 영화별 기간 매출 데이터를 군집화를 통해 비슷한 형태의 그래프를 그려 매출을 예측, 수익률을 높일 수 있도록 정보를 제공 해주는 사이트를 개발하였다.

----------------------------------------------------------------------------------------------------------------------------------

#사용 기술

Java / Jsp / Javascript / Jquery / SpringFramework / Mybatis / Oracle / R

----------------------------------------------------------------------------------------------------------------------------------

유저 개인페이지를 담당하여 개발하였으며, 해당 코드는 팀원 전체 통합코드이다. 
실제로는 영상링크를 연결하여 생성한 리스트에서 바로 재생할 수 있도록 하려고 했으나 영상 원본 소스를 처리하는 문제도 있고 개발중에 문제도 몇개 생겨 시간이 딜레이되다 보니
그냥 더미데이터로 개발을 끝냄.

프로젝트의 요구사항이 빅데이터라고 부를 수 있을정도의 많은 양의 데이터를 사용하여 통계나 차트등으로 활용해야 하고, 교육기간중에 배운 기술을 최대한 활용해야 하는것이 요구사항이라
요구사항을 만족하는 컨텐츠를 고민중에 넷플릭스나 왓챠와 같은 사용자의 선호도,시청횟수,평점 등의 데이터를 모아 분석, 활용하기 좋은 영상정보 제공사이트가 좋은 것 같아 주제로 선정하였다.

빅데이터를 다뤄서 프로젝트에 적용한다는게, 배운기간이 짧아서 그런지 쉽지 않았다. 주제 선정도 식나이 꽤 걸렸는데 개발 중간중간에 특정 파트를 담당하는 팀원 몇명이 간헐적으로 이탈하여 개발이 딜레이 되곤 했다. 어떻게 어떻게 야근하면서 마무리는 하였으나, 그다지 유쾌하지는 않은 경험이였다. 

SpringFramework와 mybatis 를 사용해서 개발 하였는데, 단순히 mvc 모델을 사용했을때에 비해 편리함의 차이가 매우 크다고 생각했다.

개발자는 공부가 끝이 없다는 말이 괜히 나온게 아니라는 생각이 들었던 프로젝트.

팀원 전체 코드를 합치는 과정에서 약간 스파게티 코드가 되는 문제도 발생하였으나, 교훈으로 삼기위해 그대로 업로드.

