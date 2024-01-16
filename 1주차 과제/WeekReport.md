![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/4f85290e-bd9c-41e7-b1e1-afecb344f830)## 이슈 1 [Spring 설치]
📌 질문
에러를 해결하는 과정을 담았습니다. 노션에 주신대로 eclipse 위에다 설치를 한 것은 아니라고 생각이 됩니다.(eclipse를 클릭하여 여는 것이 아니라 STS를 클릭하여 열어야 해당 환경이 세팅이 되는 것을 통해 그렇게 생각했습니다.) 이렇게 하여도 괜찮을지 여쭤보고 싶습니다.

1. STS 설치를 위해 Marketplace에서 STS를 검색하였지만 나오지 않아 spring으로 검색 후 아래 그림의 sts를 다운로드 하고자 하였습니다.

  ![화면 캡처 2024-01-17 001720](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/cc5d06f6-225f-48d4-8763-5a5fc56fa406)


2. 다운로드를 시도하였지만 아래와 같은 에러 메세지가 나와 구글링 후, help -> install new software -> Add(https://download.eclipse.org/mylyn/releases/latest/)로 진행하였지만 똑같이 에러가 나왔습니다. 그 외로 eclipse 버전 변경, 다시 설치 등을 해도 같은 에러가 나와서 다른 방법을 서치하였습니다.
```
// 에러 메세지
Cannot complete the install because one or more required items could not be found.
  Software being installed: Mylyn Tasks Tests SDK 3.26.0.v20230503-1226 (org.eclipse.mylyn.test_feature.feature.group 3.26.0.v20230503-1226)
  Missing requirement: Mylyn Tasks Framework Tests 3.26.0.v20221223-1911 (org.eclipse.mylyn.tasks.core.tests 3.26.0.v20221223-1911) requires 'osgi.bundle; net.bytebuddy.byte-buddy 1.12.18' but it could not be found
  Cannot satisfy dependency:
    From: Mylyn Tasks Tests SDK 3.26.0.v20230503-1226 (org.eclipse.mylyn.test_feature.feature.group 3.26.0.v20230503-1226)
    To: org.eclipse.equinox.p2.iu; org.eclipse.mylyn.tasks.core.tests [3.26.0.v20221223-1911,3.26.0.v20221223-1911]
```

3. STS 4를 설치해봤다가 SpringBoot만 되는 것을 확인하고 아래 페이지를 통해 STS 3을 다운로드 하였고, 해당 STS를 통해 작업을 시작하였습니다.
  (https://github.com/spring-attic/toolsuite-distribution/wiki/Spring-Tool-Suite-3)


-----
## 이슈 2 [Spring 설치]
📌 질문
다른 것은 그대로 가되, 아래 그림의 springframework-version은 mavenrepository.com에서 버전을 확인한 뒤, 수정하라고 해주셔서 확인 후, 6.1.3 을 적용하고자 했습니다. 하지만 에러가 났습니다. 해당 부분을 제공해주신 버전으로 낮추니 에러가 나지 않았습니다. 왜 낮추니 에러가 사라진 것인지 궁금합니다.

[버전 변경해야 하는 부분]
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/fee398de-e3ed-44f6-9372-23d698859e6e)

[참고한 버전]
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/cec72e3e-bd8a-48cc-8cdb-bb2eb2873668)


[에러 화면]
![image](https://github.com/Yerim1ee/Comento_BackEnd/assets/138195206/d93d288c-e787-4d32-b743-481fe6e2e605)

-----

## 개발환경 셋팅
[1]
- jdk 1.8 버전 설치 및 환경 변수 설정(완료)

[2]
- Eclipse 설치(완료)
- Spring 설치(이슈 1)

[3]
- 톰캣 설정(완료)

[4]
- 스프링 프로젝트 생성, Spring 버전 수정, maven-compiler 수정(이슈 2)
- 서버 셋팅(완료)

[5]
- mariadb 설치(완료)
- mysql workbench 설치(이슈 3)
- 스키마 생성, 테이블 생성, 데이터 넣기 및 조회(완료)

[6]
- POM.xml 수정(완료)
- root-context.xml 수정(문제 1)
- MyBatis 연동(완료)
- 데이터 조회/처리를 위한 JAVA 코드 작성(완료)
- 중간 Quiz(진행)
- 화면 확인(문제 2)
