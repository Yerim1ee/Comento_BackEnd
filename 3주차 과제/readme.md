
## 개발환경
>Java: Oracle JDK 17 (version "17.0.10")
>
>IntelliJ IDEA: 2023.3.3
>
>Spring: 3.2.2
>
>MariaDB: 10.2.14
>
>HeidiSQL: 2023.11.05 (12.6)


** Eclipse에서 오류가 많이나서 우선 Intelij에서 실행하였습니다. 추후 다시 Eclipse로 진행해보겠습니다.


## 업무 진행 현황
### 3-1) 스프링부트로 개발 환경 설정하기
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/872869fe-b771-422a-b0c6-741d5ab36ff4)

** Spring initialzer 을 통해 다운로드 하다 Maven이 아닌 gradle을 사용하게 되었습니다. 다음 과제에서 다시 변경해서 설정할 수 있도록 하겠습니다.

### 3-2)통계(SW활용현황) API를 위한 DB, Table 생성
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/46f6c0cd-82a8-4e15-be02-0707725f8201)

** csv로 데이터 파일 만들어 추가적으로 넣을 예정입니다.

### 3-3) [20년도 로그인수 API] 스프링부트, Mybatis, mariadb 연동
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/1875ab5c-3c9e-4904-b4d7-126582adb418)


에러 발생하여 해결 중에 있습니다.
```
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.devfun.settingweb_boot.dao.StatisticMapper.selectYearLogin
```


### 3-4) API 구축을 위한 SQL 작성
#### 3-4-1) 월별 접속자 수
한 개를 받는 sql문으로 만들고, for 문으로 start - end 까지 돌릴 예정입니다. 
for 문을 사용하고 싶지 않았는데 varchar인 createDate를 월 별로 Groupby을 어떻게 해야하는지를 아직 잘 모르겠어서 우선 대안으로 이 방법을 생각했습니다.
```
select substr(ri.createDate, 4) as month, count(*) as count
from statistc.requestinfo ri
where substr(ri.createDate, 4) == #{month}
```
#### 3-4-2) 일자별 접속자 수
```
select substr(ri.createDate, 6) as day, count(*) as count
from statistc.requestinfo ri
where substr(ri.createDate, 6) == #{day}
```
#### 3-4-1) 평균 하루 로그인 수
진행 중

#### 3-4-1) 휴일을 제외한 로그인 수
진행 중

#### 3-4-1) 부서별 월별 로그인 수
진행 중

## 질문 1
📌 pom.xml 설정에서 밑의 에러가 났었는데, http로 바꾸었더니 에러가 해결되었는데 어떤 차이로 에러가 해결된 것인지 궁금합니다.

![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/60f40d9a-03d3-464f-8c54-c92ac41d4488)

```
// 에러 메세지 1)
Description   Resource   Path   Location   Type
Downloading external resources is disabled.   pom.xml   /settingweb_boot   line 3   Language Servers

// 에러 메세지 2) 
Description   Resource   Path   Location   Type
cvc-elt.1.a: Cannot find the declaration of element 'project'.   pom.xml   /settingweb_boot   line 2   Language Servers
```

## 질문 2
📌 jstl을 추가하려고 dependency 설정을 추가해주었는데 밑의 에러가 났습니다. 

해결방법을 찾아봐도 이해가 안되어서 gradle로 변경하여 진행을 했었는데 혹시 참고하면 좋을만한 부분이 있다면 말씀해 주신다면 감사할 것 같습니다..!
```
Description Resource Path Location Type 'dependencies.dependency.version' for javax.servlet:jstl:jar is missing. pom.xml /settingweb_boot line 25 Language Servers
```
## 질문 3
📌 테이블의 필드 질문
1) requestcode 테이블의 requestCode 필드는 접속을 할 때 이 코드에 따라 로그인 시도인지, 접속 시도인지 분류를 하고 있는 것인지 궁금합니다. 만약 맞다면, 각 코드의 값을 제가 설정하면 되는 것인지 궁금합니다.

## 질문 4
📌 다양한 에러 관련 해결법들을 읽고 있지만 아직 [과제 3-3](https://github.com/Yerim1ee/Comento_BackEnd/blob/main/3%EC%A3%BC%EC%B0%A8%20%EA%B3%BC%EC%A0%9C/readme.md#3-3-20%EB%85%84%EB%8F%84-%EB%A1%9C%EA%B7%B8%EC%9D%B8%EC%88%98-api-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-mybatis-mariadb-%EC%97%B0%EB%8F%99) 진행 중 나오는 에러를 아직 해결하지 못했습니다. 
혹시 참고하면 좋을만한 부분이 있다면 말씀해 주신다면 감사할 것 같습니다..!

```
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.devfun.settingweb_boot.dao.StatisticMapper.selectYearLogin
```
