# Blog_Practice
블로그 기본 기능 구현 및 추가 기능 구현
<br>

## Blog 기본 기능 개발
<br>

### 1. 글 목록 기능 개발

  * 메인 페이지에서 모든 글의 목록을 조회할 수 있다.
  * Mustache를 활용한다.

  * 개발 순서는
    1. MyBatis Mapper 개발
    2. Service 개발
    3. Controller 개발
    4. Mustache 파일 개발


* * *

<br>

### 2. 글 목록 더보기 기능 개발
  * Blog 글의 개수가 많아지면 한 번에 모든 글을 조회 불가능하다.
  * Paging(더보기) 기능으로 정해진 수 만큼의 추가 데이터를 조회한다.
  * Paging을 위해 2개의 정보를 활용한다.
    + 조회할 현재 Page
    + Page 당 조회 데이터의 개수
   
  * Page 구현의 종류 
    + page 번호가 있고 번호를 누르면 그 페이지의 다음 게시물 리스트를 볼 수 있음.
    + 더보기 버튼을 눌러서 페이지 글을 연속적으로 더 볼 수 있도록 함
    + 스크롤을 내리면 리스트들이 나타남.
  
  여기서는 Blog Index(메인페이지) 진입 시 상위 3개의 글만 조회되고 <br>
  MORE 버튼을 클릭할 때마다 3개의 추가 데이터를 조회할 수 있도록 한다.
  
  * page 별 블로그 글 데이터 조회 API 호출
  * jQuery Ajax 사용
  * Response 데이텉를 활용하여 HTML 태그를 append


  * * *
  <br>
  
  ### 3. 글 상세 보기 기능
  * Index 글 목록에서 특정 글을 클릭하면 해당 글의 상세 페이지로 진입한다.
  * Mustache Template Engine을 활용한다.
  * Blog 글 id로 단일 글 데이터를 조회한다.

* * *
<br>

  ### 4. 글 저장 기능
  * "글작성" 메뉴 클릭 시 글 작성 화면으로 진입한다.
  * Input Form 에 정보를 입력한 후 "등록" 버튼을 클릭할 수 있다.
    * 버튼에 대한 클릭 이벤트 처리
    * ajax로 'POST /post' REST API 호출
    * 작성된 글 정보는 Request Body 데이터로 호출
  * 글 작성이 완료 되면 Index 페이지로 진입


  -> Backend
   + Mapper 개발
   + Service 개발
   + Controller(REST API) 개발
   + REST API 테스트

  -> Frontend
   + '등록' 버튼 클릭 이벤트 처리
   + 버튼 클릭 시 form에 작성된 데이터를 가져옴
   + ajax로 REST API 호출
   + API 정상 응답 시 index 화면으로 이동(redirect)

 * * *
 <br>
 
 ### 5. 글 수정 기능
 * 글 상세 페이지에서 "수정" 버튼 클릭하면 수정 페이지 진입한다.
 * 글 입력 Form에 기존에 작성된 데이터를 노출한다.(제목, 본문)
 * 데이터 수정 후 "수정" 버튼 클릭 시 DB 저장 후 글 상세 페이지로 Redirect한다.

<br>
*Backend
  + 글 수정 REST API를 위한 Mapper 개발
  + 글 수정 REST API를 위한 Service 개발
  + 글 수정 REST API를 위한 Controller(REST API) 개발
  + 글 수정 REST API 테스트
  + 글 수정 화면을 위한 PostPageController 개발

<br>
*Frontend
  + '수정' 버튼 클릭 이벤트 처리
  + 버튼 클릭 시 form에 작성된 데이터를 가져온다.
  + ajax로 REST API 호출
  + API 정상 응답 시 글 상세 화면으로 이동(redirect)

 * * *
 <br>
 
 ### 6. 글 삭제 기능
 
 블로그 글 삭제 기능 개발(프론트엔드, 백엔드 개발)
  * 글 상세 페이지에서 "섹제" 버튼 클릭하면 삭제된다.
  * "삭제" 버튼 클릭 시 DB 저장 후 Index 페이지로 Redirect한다.
 
 
